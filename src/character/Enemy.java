package character;

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
}
