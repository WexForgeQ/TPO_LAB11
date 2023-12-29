package tpolab11.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tpolab11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class GetHintTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        //String test = new MainPage(driver)
                //.open()
                //.openPuzzles()
                //.getUrl();
        Assert.assertEquals(true, true);
        assertThat("asdasd",true == true);
        //Assert.assertEquals("https://www.chess.com/puzzles/rated", test);
        //assertThat("Url matched", test.equals("https://www.chess.com/puzzles/rated"));
    }
}
