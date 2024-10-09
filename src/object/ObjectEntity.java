package object;

import character.Player;

public class ObjectEntity {
    private String name;
    private String description;
    private ObjectAttribute attributeAffected;

    public ObjectEntity(String name, String description, ObjectAttribute attributeAffected) {
        this.name = name;
        this.description = description;
        this.attributeAffected=attributeAffected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ObjectAttribute getAttributeAffected() {
        return attributeAffected;
    }

    public void setAttributeAffected(ObjectAttribute attributeAffected) {
        this.attributeAffected = attributeAffected;
    }

    @Override
    public String toString() {
        return "ObjectEntity{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", attributeAffected=" + attributeAffected +
                '}';
    }

    public void use(Player player){
        ObjectAttribute attributeAffected = this.attributeAffected;
        switch (attributeAffected){
            case LEFTHEALTH:
                player.setLeftHealth(player.getTotalHealth());
                System.out.println("Toda la salud de "+player.getName()+"ha sido restaurada.");
                break;
            case ATTACK:
                player.setAttack(player.getAttack()+1);
                System.out.println("El ataque de "+player.getName()+" ha subido 1PT");
                break;
            case DEFENSE:
                player.setDefense(player.getDefense()+1);
                System.out.println("La defensa de "+player.getName()+" ha subido 1PT");
                break;
            case MAGIC:
                System.out.println("magic");
                break;
            case SPEED:
                System.out.println("speed");
                break;
            case STATUS:
                System.out.println("status");
                break;

        }
    }
}
