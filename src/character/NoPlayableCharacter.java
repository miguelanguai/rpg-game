package character;

public class NoPlayableCharacter {
    private String name;
    private Object object;

    public NoPlayableCharacter(String name, Object object) {
        this.name = name;
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "NoPlayableCharacter{" +
                "name='" + name + '\'' +
                ", object=" + object +
                '}';
    }
}
