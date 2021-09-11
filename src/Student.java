public class Student extends Person1 {
    public Integer course = 1;

    public Student (Integer height, String name, Integer course) {
        super(height, name);
        this.course = course;
    }

    public void tell() {
        System.out.println(super.name);
        System.out.println(super.name + super.height + this.course);
    }
}
