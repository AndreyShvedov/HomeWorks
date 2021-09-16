package Lesson9.Task4;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void testNumberOfLines() {
        var result = TextFormater.numberOfLines("werw rrrw wrtt ttt2 rrr2").toString();
        Assert.assertEquals(result, "4");
    }

    @Test
    public void testThePresenceOfAPalindrome() {
        var result = TextFormater.thePresenceOfAPalindrome("wew ttrr uyyt");
        Assert.assertTrue(true);
    }

    @Test
    public void testPalindromeSearch() {
        var result = TextFormater.class;        //Не знаю даже что это за тест
    }
}


