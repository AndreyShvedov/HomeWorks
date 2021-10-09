package lesson17;

public class Application {
    public static void main(String[] args) {
        //вызов потока
        var thread = new MyThread();
        thread.start();
    }
}
