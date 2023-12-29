package tpolab11.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import tpolab11.page.MainPage;

import static org.hamcrest.MatcherAssert.assertThat;
public class NewsPageTest extends CommonConditions {
    @Test
    public void isTestFound() throws InterruptedException {
        String url = new MainPage(driver)
                .open()
                .openNews()
                .getUrl();
        Assert.assertEquals("https://www.chess.com/today", url);
        assertThat("Url matched", url.equals("https://www.chess.com/today"));
    }
}
