package character.attributes;

import character.CharacterType;

public class Attack {
    String name;
    int strength;
    int accuracy;
    int powerPoints;
    CharacterType type;

    public Attack(String name, int strength, int accuracy, int powerPoints, CharacterType type) {
        this.name = name;
        this.strength = strength;
        this.accuracy = accuracy;
        this.powerPoints = powerPoints;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public int getPowerPoints() {
        return powerPoints;
    }

    public void setPowerPoints(int powerPoints) {
        this.powerPoints = powerPoints;
    }

    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Attack{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", accuracy=" + accuracy +
                ", powerPoints=" + powerPoints +
                ", type='" + type + '\'' +
                '}';
    }
}
