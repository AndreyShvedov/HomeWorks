package Interfaces;

public class Animal implements Info{
    public Integer id;

    public Animal(Integer id){
        this.id = id;
    }

    public void sleep(){
        System.out.println("I am sleeping");
    }
    public void showInfo(){
        System.out.println(this.id);
    }
}
