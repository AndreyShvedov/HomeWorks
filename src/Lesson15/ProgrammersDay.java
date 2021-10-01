package Lesson15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgrammersDay {
    public static void main(String[] args) {
        var today = LocalDate.now();
        System.out.println("Сегодня " + today.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        var newyear = LocalDate.of(today.getYear(),12, 31);
        int v = newyear.getDayOfYear();
        if (v == 365){
            System.out.println("День програмиста в этом году будет "
                    + newyear.minusDays(109).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        } else {
            System.out.println("День програмиста в этом году будет "
                    + newyear.minusDays(110).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        }

        var day = LocalDate.of(2000,2,29);
        System.out.println("1: " + day.format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        System.out.println("2: " + day.plusYears(1).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        System.out.println("3: " + day.plusYears(4).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        for (int i = 1; i <= 4; i++) {
            System.out.println("4." + i + ": " + day.plusYears(i).format(DateTimeFormatter.ofPattern("dd MM yyyy")));
        }
    }
}
