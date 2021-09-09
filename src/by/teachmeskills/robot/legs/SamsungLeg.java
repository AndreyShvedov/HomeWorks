package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg {
    public int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public void SamsungHand() {

    }

    @Override
    public void step() {
        System.out.println("Шагает нога Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
