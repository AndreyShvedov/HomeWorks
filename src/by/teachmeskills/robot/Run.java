package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.hands.ToshibaHand;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public class Run {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SamsungHead(50), new SonyHand(40), new SonyLeg(40));
        Robot robot2 = new Robot(new ToshibaHead(50), new ToshibaHand(40), new SamsungLeg(40));
        Robot robot3 = new Robot(new SonyHead(40), new SamsungHand(40), new SonyLeg(40));

        //robot1.setHand(new SamsungHand(50));

        robot1.action();
        robot2.action();
        robot3.action();

        int max1 = robot1.getPrice();
        if (max1 == robot2.getPrice() && max1 == robot3.getPrice()) {
            System.out.println("Стоимость роботов одинакова и равна " + max1);
        } else if (max1 > robot2.getPrice() && max1 > robot3.getPrice()){
            System.out.println("Самый догорой робот robot1, его стоимость равна: " +max1);
        } else if (max1 == robot2.getPrice() && max1 > robot3.getPrice()){
            System.out.println("Самые дорогие роботы robot1 и robot2, их стоимость равна: " +max1);
        } else if (max1 < robot2.getPrice() && robot2.getPrice() > robot3.getPrice()){
            max1 = robot2.getPrice();
            System.out.println("Самый догорой робот robot2, его стоимость равна: " +max1);
        } else if (max1 < robot2.getPrice() && robot2.getPrice() == robot3.getPrice()){
            max1 = robot2.getPrice();
            System.out.println("Самые дорогие роботы robot2 и robot3, их стоимость равна: " +max1);
        } else {
            max1 = robot3.getPrice();
            System.out.println("Самый догорой робот robot3, его стоимость равна: " +max1);
        }








        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */


    }
}
