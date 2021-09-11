package Lesson9.Task4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var builder = new Scanner(System.in).nextLine();
        var text = new TextFormater();
        String newstring = null;
        System.out.println("Количество слов в строке = " + (TextFormater.numberOfLines(builder) + 1));
        System.out.println("Наличие палиндромов в строке: " + TextFormater.thePresenceOfAPalindrome(builder));
        if (TextFormater.numberOfLines(builder) >= 3 && TextFormater.numberOfLines(builder) <= 5) {
            newstring = builder;
            System.out.println(newstring);
        }

        if (TextFormater.thePresenceOfAPalindrome(builder) == true) {
            text.palindromeSearch(builder);
        }
    }



    /*Текстовый файл содержит текст. После запуска программы в другой файл должны
    записаться только те предложения в которых от 3-х до 5-ти слов.
    Если в предложении присутствует слово-полиндром, то не иммет значения какое
    количество слов в предложении, оно попадает в новый файл.
    Пишем все в ООП стиле. Создаем класс TextFormater в котором два статических метода:
    1. Метод принимает строку и возвращает кол-во слов в строке.
    2. Метод принимает строку и проверяет есть ли в строке слово-палиндром.
    Если есть возвращает true, если нет false.

    В main читываем файл.
    Разбиваем текст на предложения. Используя методы класса TextFormater
    определяем подходит ли нам предложение. Если подходит добавляем
    его в новый файл.
    */
}

