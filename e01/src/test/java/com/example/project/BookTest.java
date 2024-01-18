package project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    @Test
    public void testTitle() {
        Book book = new Book();
        book.setTitle("The Great Gatsby");
        assertEquals("The Great Gatsby", book.getTitle());
    }

    @Test
    public void testAuthor() {
        Book book = new Book();
        book.setAuthor("F. Scott Fitzgerald");
        assertEquals("F. Scott Fitzgerald", book.getAuthor());
    }

    @Test
    public void testPages() {
        Book book = new Book();
        book.setPages(180);
        assertEquals(180, book.getPages());
    }

    @Test
    public void testReadingTime() {
        Book book = new Book();
        book.setPages(180);
        assertEquals(225.0, book.calculateReadingTime(), 0.1);
    }
}