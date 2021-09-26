package Lesson12;

import java.util.Scanner;

public class Application {
    private final Scanner scanner;
    private final Shop shop = new Shop();

    public Application(Scanner scanner) {
        this.scanner = scanner;
    }

    private void printMenu() {
        System.out.println("1. Для вывода списка товаров введите 1");
        System.out.println("2. Для добавления товара в список товаров введите 2");
        System.out.println("3. Для удаления товара из список товаров введите 3");
        System.out.println("4. Для редактирования товара в списке товаров введите 4");
        System.out.println("5. Для выхода из приложения введите 5");
    }

    public void start() {
        if (this.scanner != null) {
            int key;
            do {
                printMenu();
                System.out.print("Введите номер меню: ");
                key = this.scanner.nextInt();
                switch (key) {
                    case 1:
                        shop.returnProdutcs();
                        System.out.println("Выполнилось 1");
                        break;
                    case 2:
                        shop.addProduct(new Product(1, "milk", 10));
                        shop.addProduct(new Product(2, "bread", 1200));
                        shop.addProduct(new Product(3, "meat", 40));
                        shop.addProduct(new Product(1, "milk", 10));
                        shop.addProduct(new Product(4, "tomato", 5));
                        System.out.println("Выполнилось 2");
                        break;
                    case 3:
                        shop.deleteProdutc(3);
                        System.out.println("Выполнилось 3");
                        break;
                    case 4:
                        shop.editProdutc(1, new Product("bear", 2200));
                        System.out.println("Выполнилось 4");
                        break;
                    case 5:
                        System.out.println("Завершение программы...");
                        break;
                    default:
                        System.out.println("Вы ввели неверное значение меню...\n");
                }
            } while (key != 5);
        }
        System.out.println("До свидания!");
    }
}

