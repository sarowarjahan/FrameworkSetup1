package page;

import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/7/17.
 */
public class TestHomePage extends CommonApi {

    @Test
    public void testHome(){
        System.out.println(driver.getCurrentUrl());
        clickByXpath(".//*[@id='nav-xshop']/a[3]");
        //driver.findElement(By.xpath(".//*[@id='nav-xshop']/a[3]")).click();

    }
}
