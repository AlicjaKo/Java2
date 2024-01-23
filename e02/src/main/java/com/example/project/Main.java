package project;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ab", "b", 0);

        car.setMake("Nissan");
        car.setModel("Fairlady");
        car.setYear(2002);

        System.out.println(car.getMake());
        System.out.println(car.getYear());

        car.startEngine();
        car.accelerate();
        car.brake();

        System.out.println(car.getSpeed());
        System.out.println(car.getisRunning());

    }
}