package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg {
    public int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {

    }

    @Override
    public void step() {
        System.out.println("Шагает нога Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
