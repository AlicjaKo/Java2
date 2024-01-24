package project;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal("Buck", "Dog", 2);
        Animal cat = new Animal("Paws", "Cat", 1);
        Animal bird = new Animal("Pixel", "Canary", 3);

        bird.toString();
        dog.display(null);
        cat.equals(bird);
    }
}