package Lesson10;

import java.util.Random;

public class Car {
    private String model;
    private Integer speed;
    private Integer prace;

    public Car(){}
    public Car(String model, Integer speed, Integer prace){
        this.model = model;
        this.speed = speed;
        this.prace = prace;
    }

    public Integer start(){
        return new Random().nextInt(20);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Integer getPrace() {
        return prace;
    }

    public void setPrace(Integer prace) {
        this.prace = prace;
    }
}
