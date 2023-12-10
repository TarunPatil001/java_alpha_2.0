public class Abstraction {
    public static void main(String args[]) {
        Deer d = new Deer();
        d.eats();
        d.walk();

        Horse h = new Horse();
        h.eats();
        h.walk();

    }
}

abstract class Animal {
    void eats() {
        System.out.println("Eats grass");
    }

    abstract void walk();
}

class Deer extends Animal {
    void walk() {
        System.out.println("DEER");
    }
}

class Horse extends Animal {
    void walk() {
        System.out.println("HORSE");
    }
}