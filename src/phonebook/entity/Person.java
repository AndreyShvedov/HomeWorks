package phonebook.entity;

public class Person {
    private Integer id;          //приватное поле
    private String firstname;     //приватное поле
    private String lastname;     //приватное поле
    private Integer age;         //приватное поле
    private String phoneNumber; //приватное поле

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Person(Integer id) {                     //конструктор класса Person поля id
        this.id = id;
    }

    public Person(String id, String[] columns) {               //конструктор класса Person в виде массиса
        this.id = Integer.parseInt(id);             //задает значение id из 1-го элемента массива
        this.firstname = columns[1];                //задает значение firstname из 2-го элемента массива
        this.lastname = columns[2];                 //задает значение lastname из 3-го элемента массива
        this.age = Integer.parseInt(columns[3]);    //задает значение age из 4-го элемента массива
    }

    public Integer getId() {        //геттер поля ID
        return id;
    }

    public void setId(Integer id) {     //сеттер поля ID
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
