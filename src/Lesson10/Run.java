package Lesson10;

public class Run {
    public static void main(String[] args) throws CarExeption {
        var car1 = new Car("Audi", 220, 70000);
        var car2 = new Car("BMW", 240, 85000);
        var car3 = new Car("Lada", 180, 35000);

        if (car1.start() % 2 == 0){
            throw new CarExeption("The car did not start");
        } else {
            System.out.println(car1.getModel() + " start");
        }

        try {
            car2.start();
            throw new CarExeption("The car did not start");
        } catch (CarExeption e){
            e.printStackTrace();
        }
        /*Создать собственное исключение
        - создать класс car с полями (марка, скорость, цена),
        конструкторы (с параметрами и default) гетеры-сетеры
        Создать метод старт в котором пытаетесь завести автомобиль.
        В методе старт герерируется случайное число от 0 до 20, если
        полученное число оказалось четным, то выбрасывается
        созданное исключение и передаете его к месту откуда
        вызывали метод старт. Если все хорошо и исключение не вылетело,
        то выводить в консоль сообщение что автомобиль с такой-то
        маркой завелся.

        в main создайте парочку автомобилей и попытайтесь их завести.
        И обрабатываете исключение которое может вылететь при старте
        автомобиля.

          */
    }
}
