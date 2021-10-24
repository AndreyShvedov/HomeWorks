package lesson17;

import java.io.*;

public class MyThread extends Thread {
    //создание потока
    public void run() {
        File file = new File("d:\\Study\\Java\\HomeWorks\\out\\production\\HomeWorks\\phonebook\\");
        File[] files = file.listFiles(((dir, name) -> name.endsWith(".class")));

        for (File value : files) {
            try (FileInputStream fis = new FileInputStream(value);
                 FileOutputStream fos = new FileOutputStream("thread.txt", false)) {
                byte[] buffer = new byte[fis.available()];
                fis.read(buffer, 0, buffer.length);
                fos.write(buffer, 0, buffer.length);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
    }
}
