package Lesson7;


public class Application {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.Computer("AMD", 4, 256, 10);
        computer.description();
        computer.turningOn();
        computer.turningOff();
    }
}
