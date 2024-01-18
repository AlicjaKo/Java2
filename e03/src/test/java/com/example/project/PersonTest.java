package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    @Test
    public void testConstructorWithThreeArgs() {
        Person person = new Person("John", "Doe", 30);
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(30, person.getAge());
    }

    @Test
    public void testConstructorWithTwoArgs() {
        Person person = new Person("John", "Doe");
        assertEquals("John", person.getFirstName());
        assertEquals("Doe", person.getLastName());
        assertEquals(0, person.getAge());
    }

    @Test
    public void testDefaultConstructor() {
        Person person = new Person();
        assertEquals("", person.getFirstName());
        assertEquals("", person.getLastName());
        assertEquals(0, person.getAge());
    }
}