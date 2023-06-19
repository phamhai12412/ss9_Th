

// lớp Phone là một lớp trừu tượng (abstract class) và chứa các phương thức trừu tượng
public abstract class Phone {
    public abstract void insertPhone(String name, String phone);
    public abstract void removePhone(String name);
    public abstract void updatePhone(String name, String newPhone);
    public abstract void searchPhone(String name);
    public abstract void sort();
}
