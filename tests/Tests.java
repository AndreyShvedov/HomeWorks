import Lesson9.Application;
import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {
    @Test
    public void testProcessing(){
        var result = Application.procesing("FFDkkioakkO");
        assertEquals(result, "FFDFFioaFFO");
    }
    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testProcessing2(){
        var result = Application.procesing("FF");

    }

}

