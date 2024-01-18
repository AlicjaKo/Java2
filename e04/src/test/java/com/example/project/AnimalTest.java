package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    @Test
    public void testToString() {
        Animal animal = new Animal("Lion", "Mammal", 5);
        assertEquals("Name: Lion, Type: Mammal, Age: 5", animal.toString());
    }

    @Test
    public void testEquals() {
        Animal animal1 = new Animal("Lion", "Mammal", 5);
        Animal animal2 = new Animal("Lion", "Mammal", 5);
        Animal animal3 = new Animal("Tiger", "Mammal", 8);
        assertTrue(animal1.equals(animal2));
        assertFalse(animal1.equals(animal3));
    }
}