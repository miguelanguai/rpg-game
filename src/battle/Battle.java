package battle;

import character.Enemy;
import character.Player;
import character.attributes.Attack;
import object.ObjectEntity;

import java.util.*;

public class Battle {
    private Player player;
    private Enemy enemy;
    private boolean playerWon;

    public Battle(Player player, Enemy enemy, boolean playerWon) {
        this.player = player;
        this.enemy = enemy;
        this.playerWon = playerWon;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
    }

    public boolean isPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(boolean playerWon) {
        this.playerWon = playerWon;
    }

    /**
     * ejecutar la batalla entre el jugador y el personaje enemigo
     */
    public boolean battle(){
        boolean playerWins;
        int playerStartingHealth = player.getLeftHealth();

        while(true) {
            int interfaceSelected = selectionInterface();
            ObjectEntity objectSelected = null;
            Attack attackSelected = null;

            if (interfaceSelected==1){
                attackSelected=attackSelectionInterface();
                if (isPlayerFaster()){
                    if(this.playerAttacksEnemy(attackSelected)){
                        playerWins=true;
                        break;
                    }
                    if(enemyAttacksPlayer()){
                        playerWins=false;
                        break;
                    }
                }else{
                    if(enemyAttacksPlayer()){
                        playerWins=false;
                        break;
                    }
                    if(this.playerAttacksEnemy(attackSelected)){
                        playerWins=true;
                        break;
                    }
                }
            }else if (interfaceSelected==2){
                objectSelected=objectSelectionInterface();
                //player uses an object
                useObject(objectSelected);
                //enemy attacks player
                if(enemyAttacksPlayer()){
                    playerWins=false;
                    break;
                }
            }

        }
        if (playerWins) {
            earnExperience(playerStartingHealth);
            getObject();
        }
        System.out.println("El combate ha terminado");
        return playerWins;
    }



    public void showData(){
        System.out.println(this.player.getName() + "         " + this.enemy.getName());

        System.out.println(this.player.getLevel() + "             "+this.enemy.getLevel());

        System.out.println("HP: "+this.player.getLeftHealth()+"        HP: "+this.enemy.getLeftHealth());
        System.out.println("\n");
    }

    /**
     * se puede ver la interfaz inicial del usuario, que da a elegir entre atacar, usar un objeto o rendirse
     */
    public int selectionInterface(){
        showData();
        int selection;

        do{
            System.out.println("¿Qué quieres hacer?");
            System.out.println("1) Elegir Ataque");
            System.out.println("2) Usar Objeto");

            Scanner s = new Scanner(System.in);
            selection = s.nextInt();
            s.nextLine();
            System.out.println(selection);

            if (selection==1||selection==2){
                break;
            }
            System.out.println("Elección incorrecta. Elige de nuevo");
        }while(true);

        return selection;
    }

    /**
     * muestra la interfaz de seleccion de ataques del jugador, y elige uno para usar
     * @return ataque elegido
     */
    public Attack attackSelectionInterface(){
        showData();
        List<Attack> attackList = this.player.getAttacks();
        Attack selectedAttack;
        int selection=0;

        for (int i = 0; i < attackList.size(); i++) {
            System.out.println(i+": "+attackList.get(i).getName());


        }
        Scanner s = new Scanner(System.in);
        selection = s.nextInt();
        s.nextLine();

        selectedAttack = attackList.get(selection);
        return selectedAttack;
    }

    /**
     * muestra la interfaz de selección de los objetos parte del inventario del jugador y elige uno para usar
     * @return objeto elegido
     */
    public ObjectEntity objectSelectionInterface(){
        showData();
        List<ObjectEntity> inventory = this.player.getInventory();
        ObjectEntity selectedObject;
        int selection=0;

        for (int i = 0; i < inventory.size(); i++) {
            System.out.println(i+": "+inventory.get(i).getName()+": "+inventory.get(i).getDescription());
        }
        Scanner s = new Scanner(System.in);
        selection = s.nextInt();
        s.nextLine();

        selectedObject = inventory.get(selection);
        System.out.println(player.getName()+" va a usar "+selectedObject.getName());
        return selectedObject;
    }

    /**
     * verifica que la velocidad del jugador sea mayor que la velocidad del enemigo. De momento, si son iguales, devuelve que el jugador también es más rápido, por facilidad
     * @return si el jugador es más rapido que el enemigo
     */
    public boolean isPlayerFaster(){
        return this.player.getSpeed() >= this.enemy.getSpeed();
    }

    /**
     * ataque de un personaje al otro
     * @return boolean el enemigo es debilitado
     */
    public boolean playerAttacksEnemy(Attack attack){
        int playerBaseAttack = this.player.getAttack();
        System.out.println(this.player.getName()+" usa "+attack.getName());

        int totalStrenghtAttack = playerBaseAttack*attack.getStrength();
        enemy.setLeftHealth(enemy.getLeftHealth()-totalStrenghtAttack);

        if (enemy.getLeftHealth() <= 0) {
            enemy.setLeftHealth(0);
            System.out.println(this.enemy.getName()+" ha sido derrotado. ¡Has ganado!");
            return true;
        }
        return false;
    }

    /**
     * el enemigo ataca al jugador. El ataque del enemigo se elige de entre los ataques que tiene de manera aleatoria.
     * @return booleano si el jugador muere
     */
    public boolean enemyAttacksPlayer(){
        //randomizar el ataque que emplea, de todos los ataques que tiene en lista el personaje del enemigo
        List<Attack> enemyAttacks = enemy.getAttacks();
        Random rand = new Random();
        int randomChoice = rand.nextInt(enemyAttacks.size());
        System.out.println(enemy.getName()+" usa "+enemyAttacks.get(randomChoice).getName());

        int totalStrenghtAttack = this.enemy.getAttack()*enemyAttacks.get(randomChoice).getStrength();
        player.setLeftHealth(player.getLeftHealth()-totalStrenghtAttack);

        if (player.getLeftHealth() <= 0) {
            player.setLeftHealth(0);
            System.out.println("Has sido debilitado");
            return true;
        }
        return false;
    }

    /**
     * usuario emplea un objeto.
     */
    private void useObject(ObjectEntity object) {
        object.use(this.player);
        System.out.println(player.getName()+" ha usado "+object.getName());
    }

    /**
     * usuario gana puntos de experiencia por derrotar al enemigo. La cantidad de puntos ganada es la cantidad de salud que nos ha retirado el enemigo durante la batalla
     */
    public void earnExperience(int playerStartingHealth){
        int earnedPoints= playerStartingHealth-player.getLeftHealth();
        player.setExperiencePoints(earnedPoints);
        System.out.println(player.getName()+" ha ganado "+earnedPoints+" puntos de experiencia.");
    }

    /**
     * El jugador consigue el objeto del enemigo, si este lleva alguno
     */
    public void getObject(){
        ObjectEntity enemyObject = (ObjectEntity) enemy.getObject();
        if (Objects.nonNull(enemyObject)){
            List<ObjectEntity> updatedInventory = new ArrayList<>();
            updatedInventory.add(enemyObject);
            player.setInventory(updatedInventory);
            System.out.println(player.getName()+" ha conseguido "+enemyObject.getName()+ " y se lo ha guardado en el inventario");
        }
    }


}
