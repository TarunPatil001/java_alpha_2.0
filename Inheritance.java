public class Inheritance {
    public static void main(String args[]) {
        Peacock m1 = new Peacock();
        m1.eat();
        m1.color = "Blue";
        System.out.println(m1.color);

    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Fish extends Animal {
    int fins;
}

class Tuna extends Fish {
    int gills;
}

class Shark extends Fish {
    int height;
}

class Bird extends Animal {
    int wings;
}

class Peacock extends Bird {
    String color;
}

class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}

class Cat extends Mammal {
    String name;
}

class Human extends Mammal {
    String quality;
}

// Derived Class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swims in water");
// }
// }