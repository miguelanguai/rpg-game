package character;

import battle.Battle;
import character.attributes.Attack;
import character.attributes.Skill;
import character.weapon.Armor;
import character.weapon.Weapon;
import object.ObjectEntity;
import object.ObjectAttribute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player extends Character {

    private CharacterType type;
    private Weapon weapon;
    private Armor armor;
    private int experiencePoints;
    private List<ObjectEntity> inventory;
    private Skill skill;

    public Player(CharacterType type, Weapon weapon, Armor armor, int experiencePoints, List<ObjectEntity> inventory, Skill skill) {
        this.type = type;
        this.weapon = weapon;
        this.armor = armor;
        this.experiencePoints = experiencePoints;
        this.inventory = inventory;
        this.skill = skill;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public List<ObjectEntity> getInventory() {
        return inventory;
    }

    public void setInventory(List<ObjectEntity> inventory) {
        this.inventory = inventory;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Player{" +
                "type=" + type +
                ", weapon=" + weapon +
                ", armor=" + armor +
                ", experiencePoints=" + experiencePoints +
                ", inventory=" + inventory +
                ", skill=" + skill +
                '}';
    }

    public static void main(){

        //Weapons
        Weapon weapon1 = new Weapon("Espada", "Una espada sencilla, bien equilibrada, perfecta para el combate cuerpo a cuerpo");
        Weapon weapon2 = new Weapon("Hacha", "Hacha de doble filo que duplica la cantidad de víctimas en combate cuerpo a cuerpo");
        Weapon weapon3 = new Weapon("Arco Básico", "Un arco sencillo, hecho para ataques a distancia con precisión");
        Weapon weapon4 = new Weapon("Arco Incandescente", "Arco que tira flechas de lava, con las que quemar al enemigo");
        Weapon weapon5 = new Weapon("Bastón de Roble", "Un bastón básico utilizado para canalizar magia elemental");
        Weapon weapon6 = new Weapon("Libro del Fénix", "Libro con encantamientos poderosos");

        //Armors
        Armor armor1 = new Armor("Armadura de placas", "Armadura que ofrece resistencia a ataques físicos");
        Armor armor2 = new Armor("Cota de malla", "Armadura metálica que permite movilidad y precisión");
        Armor armor3 = new Armor("Túnica", "Prenda hecha por elfos ligera pero muy resistente");

        //Objects
        ObjectEntity object1 = new ObjectEntity("Poción", "Restaura toda la salud del personaje", ObjectAttribute.LEFTHEALTH);
        ObjectEntity object3 = new ObjectEntity("Brebaje", "Aumenta el ataque del personaje 1PT", ObjectAttribute.ATTACK);
        ObjectEntity object4 = new ObjectEntity("Manzana encantada", "Aumenta la defensa del personaje 1PT", ObjectAttribute.DEFENSE);


        List<ObjectEntity> inventory = new ArrayList<>();
        inventory.add(object1);
        inventory.add(object3);
        inventory.add(object1);

        //Hability
        Skill skill1 = new Skill("Normal", "Habilidad que no hace nada mas");

        //Attack
        Attack attack1 = new Attack("Toque afilado", 1, 100, 5, CharacterType.WARRIOR);
        Attack attack2 = new Attack("Mandoble violento", 2, 100, 5, CharacterType.WARRIOR);
        Attack attack3 = new Attack("Flecha afilada", 1, 100, 5, CharacterType.ARCHER);
        Attack attack4 = new Attack("Flechazo eficaz", 2, 100, 5, CharacterType.ARCHER);
        Attack attack5 = new Attack("Lanzapiedras", 1, 100, 5, CharacterType.WIZARD);
        Attack attack6 = new Attack("Confundus", 2, 100, 5, CharacterType.WIZARD);
        Attack attack7 = new Attack("Arañazo", 1, 100, 5, CharacterType.REGULAR);
        Attack attack8 = new Attack("Placaje", 2, 100, 5, CharacterType.REGULAR);

        List<Attack> attackList = new ArrayList<>();
        attackList.add(attack1);
        attackList.add(attack2);


        //Initialize my player
        Player me = new Player(CharacterType.WARRIOR,weapon1, armor1, 0, inventory, skill1  );
        me.setName("Migue");
        me.setTotalHealth(20);
        me.setLeftHealth(20);
        me.setAttack(10);
        me.setMagic(10);
        me.setSpeed(10);
        me.setDefense(10);
        me.setAttacks(attackList);
        me.setStatus(Status.NORMAL);

        System.out.println(me.getName()+ " "+ me.toString());

        List<Attack> enemyAttackList = new ArrayList<>();
        enemyAttackList.add(attack1);


        //Initialize the enemy
        Enemy enemy = new Enemy(object1);
        enemy.setName("Bowser");
        enemy.setTotalHealth(15);
        enemy.setLeftHealth(15);
        enemy.setAttack(10);
        enemy.setMagic(10);
        enemy.setSpeed(10);
        enemy.setDefense(10);
        enemy.setAttacks(enemyAttackList);
        enemy.setStatus(Status.NORMAL);
        enemy.setObject(object4);

        System.out.println(enemy.toString());

        Battle battle = new Battle(me, enemy, false);
        battle.battle();

    }

    /**
     * crea el Jugador Virtual que elige el jugador y lo devuelve
     * @return Player con el que jugar
     */
    public static Player generatePlayer(){
        //ifs para ver cual elige.
        int selection;
        String name;
        Scanner s = new Scanner(System.in);

        System.out.println("¿Cómo llamarás a tu personaje?");
        name=s.nextLine();

        do{
            System.out.println("Elige entre los siguientes personajes jugables:");
            System.out.println("1) Mago");
            System.out.println("2) Arquero");
            System.out.println("3) Guerrero");


            selection = s.nextInt();
            s.nextLine();
            System.out.println(selection);

            if (selection==1||selection==2||selection==3){
                break;
            }
            System.out.println("Elección incorrecta. Elige de nuevo");
        }while(true);

        Weapon weapon1 = new Weapon("Espada", "Una espada sencilla, bien equilibrada, perfecta para el combate cuerpo a cuerpo");
        Weapon weapon2 = new Weapon("Hacha", "Hacha de doble filo que duplica la cantidad de víctimas en combate cuerpo a cuerpo");
        Weapon weapon3 = new Weapon("Arco Básico", "Un arco sencillo, hecho para ataques a distancia con precisión");
        Weapon weapon4 = new Weapon("Arco Incandescente", "Arco que tira flechas de lava, con las que quemar al enemigo");
        Weapon weapon5 = new Weapon("Bastón de Roble", "Un bastón básico utilizado para canalizar magia elemental");
        Weapon weapon6 = new Weapon("Libro del Fénix", "Libro con encantamientos poderosos");

        Armor armor1 = new Armor("Armadura de placas", "Armadura que ofrece resistencia a ataques físicos");
        Armor armor2 = new Armor("Cota de malla", "Armadura metálica que permite movilidad y precisión");
        Armor armor3 = new Armor("Túnica", "Prenda hecha por elfos ligera pero muy resistente");

        List<ObjectEntity> inventory = new ArrayList<>();

        Skill skill1 = new Skill("Normal", "Habilidad que no hace nada mas");

        Attack attack1 = new Attack("Toque afilado", 1, 100, 5, CharacterType.WARRIOR);
        Attack attack2 = new Attack("Mandoble violento", 2, 100, 5, CharacterType.WARRIOR);
        Attack attack3 = new Attack("Flecha afilada", 1, 100, 5, CharacterType.ARCHER);
        Attack attack4 = new Attack("Flechazo eficaz", 2, 100, 5, CharacterType.ARCHER);
        Attack attack5 = new Attack("Lanzapiedras", 1, 100, 5, CharacterType.WIZARD);
        Attack attack6 = new Attack("Confundus", 2, 100, 5, CharacterType.WIZARD);
        Attack attack7 = new Attack("Arañazo", 1, 100, 5, CharacterType.REGULAR);
        Attack attack8 = new Attack("Placaje", 2, 100, 5, CharacterType.REGULAR);



        Player player;
        List<Attack> attackList;
        switch (selection){
            case 1:
                player=new Player(CharacterType.WIZARD, weapon1, armor1, 0, inventory, skill1);
                player.setTotalHealth(20);
                player.setAttack(1);
                player.setMagic(4);
                player.setSpeed(1);
                player.setDefense(2);
                attackList = new ArrayList<>();
                attackList.add(attack5);
                attackList.add(attack6);
                player.setAttacks(attackList);
                player.setStatus(Status.NORMAL);
                break;
            case 2:
                player=new Player(CharacterType.ARCHER, weapon1, armor1, 0, inventory, skill1);
                player.setTotalHealth(20);
                player.setAttack(2);
                player.setMagic(2);
                player.setSpeed(3);
                player.setDefense(1);
                attackList = new ArrayList<>();
                attackList.add(attack3);
                attackList.add(attack4);
                player.setAttacks(attackList);
                player.setStatus(Status.NORMAL);
                break;
            case 3:
                player=new Player(CharacterType.WARRIOR, weapon1, armor1, 0, inventory, skill1);
                player.setTotalHealth(30);
                player.setAttack(2);
                player.setMagic(1);
                player.setSpeed(1);
                player.setDefense(3);
                attackList = new ArrayList<>();
                attackList.add(attack1);
                attackList.add(attack2);
                player.setAttacks(attackList);
                player.setStatus(Status.NORMAL);
                break;
            default:
                player=new Player(CharacterType.REGULAR, weapon1, armor1, 0, inventory, skill1);
                player.setTotalHealth(20);
                player.setAttack(2);
                player.setMagic(2);
                player.setSpeed(2);
                player.setDefense(2);
                attackList = new ArrayList<>();
                attackList.add(attack3);
                attackList.add(attack4);
                player.setAttacks(attackList);
                player.setStatus(Status.NORMAL);
        }

        player.setName(name);


        return player;
    }

}
