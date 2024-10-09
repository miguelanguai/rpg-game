package character;

import java.util.Random;

public class Enemy extends Character{
    private Object object;


    public Enemy(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "object=" + object +
                '}';
    }

    /**
     * genera enemigos. Depende de si es jefe final o no, tiene más o menos dificultad.
     * @param isBoss depende de si se quiere qeu el enemigo generado sea un jefe final o no
     * @param object el objeto que entregará al jugador una vez es derrotado
     * @param playerLevel el nivel del jugador para tomar como referencia
     * @return
     */
    public static Enemy generateEnemy(boolean isBoss, Object object, int playerLevel, String enemyName){
        Enemy enemy = new Enemy(object);
        enemy.setName(enemyName);

        if (isBoss){
            playerLevel+= (int) (playerLevel*0.1);
            System.out.println(playerLevel);
            addAtributes(playerLevel, enemy);
        }else{
            playerLevel= (int) (playerLevel*0.8);
            System.out.println(playerLevel);
            addAtributes(playerLevel, enemy);
        }
        return enemy;
    }

    /**
     * añade atributos al enemigo de manera randomizada. Al menos tiene un punto de salud.
     * Cuando acaba el bucle, multiplica por 4 los puntos de vida para que tenga un minimo de vida el enemigo
     * Setea la salud restante inicial (que está entera) y el estado a normal
     * @param enemyLevel
     * @param character
     * @return
     */
    public static Character addAtributes(int enemyLevel, Character character){
        Random r = new Random();
        character.setTotalHealth(1);
        for(int i=0;i<enemyLevel/2;i++){
            int attributeToAffect=r.nextInt(5);

            switch (attributeToAffect){
                case 0:
                    character.setTotalHealth(character.getTotalHealth()+1);
                    break;
                case 1:
                    character.setAttack(character.getAttack()+1);
                    break;
                case 2:
                    character.setMagic(character.getMagic()+1);
                    break;
                case 3:
                    character.setSpeed(character.getSpeed()+1);
                    break;
                case 4:
                    character.setDefense(character.getDefense()+1);
                    break;

            }
        }
        character.setTotalHealth(character.getTotalHealth()*4);
        character.setLeftHealth(character.getTotalHealth());
        character.setStatus(Status.NORMAL);
        System.out.println("Attributes given to the enemy");
        return character;
    }
}
