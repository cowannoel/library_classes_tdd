import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;

    @Before
    public void before(){
        library = new Library(50);
    }

    @Test
    public void startWithNoBooks(){
        assertEquals(0, library.getNumberOfBooks());
    }

}



