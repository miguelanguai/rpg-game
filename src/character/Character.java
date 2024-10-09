package character;

import character.attributes.Attack;

import java.util.List;

public class Character {

    private String name;
    private int totalHealth;
    private int leftHealth;
    private int attack;
    private int magic;
    private int speed;
    private int defense;
    private List<Attack> attacks;
    private Status status;
    private int level;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalHealth() {
        return totalHealth;
    }

    public void setTotalHealth(int totalHealth) {
        this.totalHealth = totalHealth;
    }

    public int getLeftHealth() {
        return leftHealth;
    }

    public void setLeftHealth(int leftHealth) {
        this.leftHealth = leftHealth;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", totalHealth=" + totalHealth +
                ", leftHealth=" + leftHealth +
                ", attack=" + attack +
                ", magic=" + magic +
                ", speed=" + speed +
                ", defense=" + defense +
                ", attacks=" + attacks +
                ", status='" + status + '\'' +
                ", level=" + level +
                '}';
    }
}
