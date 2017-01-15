package PageFactory;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sarowar on 1/14/17.
 */
public class NewsSearch extends CommonAPI {
    WebDriver pageObjectDriver;

    @FindBys({
            @FindBy(how = How.XPATH, using = ".//*[@id='headerNav']/div/ul/li[13]/div")
    })
    public static WebElement clickSearchIcon;

    @FindBy(how = How.XPATH, using = ".//*[@id='searchfield']")
    public static WebElement searchInput;

    @FindBy(how = How.XPATH, using = ".//*[@id='search-submit-button']")
    public static WebElement searchSubmit ;

    public void searchFor(String item){
        searchInput.sendKeys(item, Keys.ENTER);
    }
    public void clearSearchInput() {
        searchInput.clear();
    }

    public NewsSearch(WebDriver driver) {
        this.pageObjectDriver = driver;
        PageFactory.initElements(driver, this);

    }

}
