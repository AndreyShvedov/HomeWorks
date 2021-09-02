package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String CPU;
    private Integer RAM;
    private Integer HDD;
    private Integer cycles;
    private Integer random;

    public void Computer(String CPU, Integer RAM, Integer HDD, Integer cycles) {     //конструктор задания параметров компьютера
        this.CPU = CPU;
        this.RAM = RAM;
        this.HDD = HDD;
        this.cycles = cycles;
    }

    public void description() {                 //метод описание
        System.out.println("Модель процессора: " + CPU);
        System.out.println("Количество оперативной памяти: " + RAM + "Gb");
        System.out.println("Емкость жесткого диска: " + HDD + "Gb");
        System.out.println("Ресурс полных циклов: " + cycles);
    }

    public void turningOn() {                //метод включения
        System.out.println("Для включения компьютера введите 0 или 1");
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * 2);
        int on = s.nextInt();
        if (on == random) {
            System.out.println(random);
            System.out.println("Компьютер включен!");
        } else {
            System.out.println(random);
            System.out.println("Компьютер сгорел!");
        }
        System.out.println("Компьютеру конец!");
    }

    public Integer turningOff() {                //метод выключения
        System.out.println("Для выключения компьютера введите 0 или 1");
        Scanner s = new Scanner(System.in);
        random = (int) (Math.random() * 2);
        int on = s.nextInt();
        if (on == random) {
            System.out.println(random);
            System.out.println("Компьютер выключен!");
        } else {
            System.out.println(random);
            System.out.println("Компьютер сгорел!");
        }
        System.out.println("Компьютеру конец!");
        return this.random;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public Integer getRAM() {
        return RAM;
    }

    public void setRAM(Integer RAM) {
        this.RAM = RAM;
    }

    public Integer getHDD() {
        return HDD;
    }

    public void setHDD(Integer HDD) {
        this.HDD = HDD;
    }

    public Integer getCycles() {
        return cycles;
    }

    public void setCycles(Integer cycles) {
        this.cycles = cycles;
    }

    public Integer getRandom() {
        return random;
    }

    public void setRandom(Integer random) {
        this.random = random;
    }
}
