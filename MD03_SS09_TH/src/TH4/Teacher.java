package TH4;

public class Teacher extends Person {
    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher: "+
                "Name: "+super.getName()+
                " | Age: "+super.getAge());
    }


}
