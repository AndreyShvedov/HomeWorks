public class ClassesAndObjects {
    public static void main(String[] args) {
        /*var person1 = new Person1();
        person1.name = "Peter";
        person1.age = 15;
        person1.speak();
        person1.say();
        var person2 = new Person1();
        person2.name = "Din";
        person2.age = 25;
        person2.newName("Sasha");
        System.out.println(person1.calcul());
        //var array1 = new Arrays();
        //array1.ar();
        Person1 vitya = new Person1(150);
        System.out.println(vitya.height);
        var vlad = new Person1(180);
        System.out.println(vlad.height);
        vlad.say();*/

        var freshman = new Student(76, "Vania", 2);
        System.out.println(freshman.course);
        freshman.tell();

        Shape[] arr = new Shape[] {new Circle(), new Square(), new Triangle()};
            for (int i = 0; i < arr.length; i++)
                arr[i].draw();
            //Array a = new Circle();
        //System.out.println(a.Add(4));

    }


}