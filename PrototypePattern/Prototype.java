package PrototypePattern;

public abstract class Prototype {
    public int x;
    public int y;

    public Prototype() {
    }

    public Prototype(Prototype prototype) {
        if (prototype != null) {
            this.x = prototype.x;
            this.y = prototype.y;
        }
    }


    public abstract String getColor();

    public abstract Prototype clone();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prototype prototype = (Prototype) o;

        if (x != prototype.x) return false;
        return y == prototype.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
