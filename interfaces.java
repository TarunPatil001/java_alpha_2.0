interface Carnivore {
    void Carni();

}

interface Herbivore {
    void Herbi();
}

class Bear implements Carnivore, Herbivore {
    public void Carni() {
        System.out.println("Eats Meat.");
    }

    public void Herbi() {
        System.out.println("Eats Plants.");
    }
}

public class interfaces {
    public static void main(String args[]) {
        Bear b = new Bear();
        b.Carni();
        b.Herbi();
    }
}
