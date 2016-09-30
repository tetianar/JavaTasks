package relations;

/**
 * Created by Tetiana_Romaniv on 9/23/2016.
 */
public class Main {
    public static void main(String[] args){

        Robot robot = new Robot(6.5,5.5);
        Robot robot1 = new Robot(2.5,10.5);
        Operator operator = new Operator("Ivan", "Ivanov");
        Operator operator1 = new Operator("Roman", "Romanov");


        robot.setOperator(operator);
        operator1.setRobot(robot1);

    }
}
