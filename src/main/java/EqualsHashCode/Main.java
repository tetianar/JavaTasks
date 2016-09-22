package EqualsHashCode;

/**
 * Created by Tetiana_Romaniv on 9/22/2016.
 */
public class Main {

    public static void main(String[] args) {

        EpamEmployee employee1 = new EpamEmployee("Tetiana",25,"master",City.Kyiv );
        EpamEmployee employee2 = new EpamEmployee("Tetiana",25,"master",City.Lviv );
        EpamEmployee employee3 = new EpamEmployee("Tetiana",25,"master",City.Kyiv );
        RdEmployee rdEmployee1 = new RdEmployee("TetianaRD", 25, "masterRd", City.Lviv, Direction.AutomatedQA);

        System.out.println(employee1.equals(rdEmployee1));
        System.out.println(employee2.equals(employee3));

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());
        System.out.println(rdEmployee1.hashCode());
    }
}
