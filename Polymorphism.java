public class Polymorphism {
    public static void main(String args[]) {

        Deer d = new Deer();
        d.eats();

        // Calculator cal = new Calculator();
        // System.out.println(cal.sum(1, 2));
        // System.out.println(cal.sum((float) 1.2, (float) 2.3));
        // System.out.println(cal.sum(1, 2, 3));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void eats() {
        System.out.println("Eats anything");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass");
    }
}