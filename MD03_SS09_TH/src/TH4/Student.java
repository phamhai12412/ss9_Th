package TH4;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: "+
                "Name: "+super.getName()+
                " | Age: "+super.getAge());
    }
}
