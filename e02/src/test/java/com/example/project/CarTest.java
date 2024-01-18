package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    public void testStartEngine() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.startEngine();
        assertTrue(car.isRunning());
    }

    @Test
    public void testStopEngine() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.startEngine();
        car.stopEngine();
        assertFalse(car.isRunning());
    }

    @Test
    public void testAccelerate() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.startEngine(); 
        car.accelerate();
        car.accelerate();
        assertEquals(20, car.getSpeed());
    }

    @Test
    public void testBrake() {
        Car car = new Car("Toyota", "Camry", 2020);
        car.startEngine();
        car.accelerate();
        car.accelerate();
        car.brake();
        assertEquals(10, car.getSpeed());
    }

    @Test
    public void testInvalidMake() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car();
            car.setMake(null);
        });
    }

    @Test
    public void testInvalidModel() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car();
            car.setModel("");
        });
    }

    @Test
    public void testInvalidYear() {
        assertThrows(IllegalArgumentException.class, () -> {
            Car car = new Car();
            car.setYear(-1);
        });
    }

    @Test
    public void testValidMake() {
        Car car = new Car();
        car.setMake("Toyota");
        assertEquals("Toyota", car.getMake());
    }

    @Test
    public void testValidModel() {
        Car car = new Car();
        car.setModel("Corolla");
        assertEquals("Corolla", car.getModel());
    }

    @Test
    public void testValidYear() {
        Car car = new Car();
        car.setYear(2020);
        assertEquals(2020, car.getYear());
    }


}
