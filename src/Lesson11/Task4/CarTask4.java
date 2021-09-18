package Lesson11.Task4;

import java.io.Serializable;
import java.util.Random;

public class CarTask4 implements Serializable{
    private String model;
    private Integer speed;
    private Integer prace;

    public CarTask4(){}
    public CarTask4(String model, Integer speed, Integer prace){
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

    @Override
    public String toString() {
        return "CarTask4{" +
                "model='" + model + '\'' +
                ", speed=" + speed +
                ", prace=" + prace +
                '}';
    }
}
