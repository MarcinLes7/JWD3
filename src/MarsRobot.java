public class MarsRobot {
    String status;
    int speed;
    int power;

    // tu tworzymy własny konstruktor
    MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    // trzeba dostarczyć konstruktor bezargumentow
/*    MarsRobot() {}*/

    public static void main(String[] args) {
/*        MarsRobot marsRobot = new MarsRobot();
        marsRobot.status = "w bazie";
        marsRobot.power = 0;
        marsRobot.power = 4;*/

        MarsRobot marsRobot = new MarsRobot("w bazie", 0, 4);
        System.out.println(marsRobot.status);

    }


}
