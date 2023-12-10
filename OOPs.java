public class OOPs {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        // p1.setColor("Red");
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        BankAccount ba = new BankAccount();
        ba.username = "Hello";
        System.out.println(ba.username);
        ba.setPassword("Abc");

    }

}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;
    int marks[];

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        this.marks = s1.marks;
    }
}
