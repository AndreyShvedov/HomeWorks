public class Person1 {
    public String name = "Dt";
    public Integer age;
    public Integer height = 180;

    public Person1(){

    }
    public Person1(Integer height, String name) {
        this.height = height;
        this.name = name;
    }

    public Person1(Integer h) {
        height = h;
    }

    public void say() {
        System.out.println("Hello " + name);
    }

    public Integer calcul() {
        Integer years = 65 - age;
        return years;
    }

    public String newName(String s) {
        if (name == "Din") {
            System.out.println(s);
            System.out.println(name);
            return s;

        }
        return name;
    }

    public void speak() {
        if (name == "Din") {
            System.out.println("Sorry");
        } else {
            System.out.println(name + age);
        }

    }

    public void fly() {
        System.out.println("AAAAAaaaa");
    }
}
