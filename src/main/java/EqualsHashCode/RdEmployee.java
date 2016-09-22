package EqualsHashCode;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class RdEmployee extends EpamEmployee{

    private Direction direction;

    public RdEmployee(String name, int age, String education, City city, Direction direction) {
        super(name, age, education, city);
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RdEmployee)) return false;
        if (!super.equals(o)) return false;

        RdEmployee that = (RdEmployee) o;

        return direction == that.direction;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        return result;
    }
}
