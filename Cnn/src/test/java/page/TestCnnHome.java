package page;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/7/17.
 */
public class TestCnnHome extends CommonApi {

    @Test
    public void testHome(){

        clickByXpath(".//*[@id='nav']/div[2]/div[2]/a[3]");
        clickByXpath(".//*[@id='nav-header']/nav/div/div[4]/ul/li[1]/a");
       // driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[3]"));
        //driver.findElement(By.xpath(".//*[@id='nav']/div[2]/div[2]/a[4]"));

    }
}
