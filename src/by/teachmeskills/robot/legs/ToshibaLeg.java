package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg {
    public int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {

    }

    @Override
    public void step() {
        System.out.println("Шагает нога Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
