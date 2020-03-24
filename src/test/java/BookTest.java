import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before(){
        book = new Book("Generation X", "Douglas Coupland","Fiction");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Generation X", book.getTitle());
    }

    @Test
    public void canGetAuthor(){
        assertEquals("Douglas Coupland", book.getAuthor());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
