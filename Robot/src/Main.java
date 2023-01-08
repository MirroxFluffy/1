public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();
        System.out.println("Robot is going to move somewhere");
        for (int i = 4; i < 8; i++) {
            robot.MoveLeft();
        }
        robot.MoveBack();
        for (int i = 0; i < 10; i++) {
            robot.MoveRight();
        }
        for (int i = 2; i < 4; i++) {
            robot.MoveForward();
        }
    }
}