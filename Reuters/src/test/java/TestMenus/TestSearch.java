package TestMenus;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageFactory.NewsSearch;

import static org.openqa.selenium.support.PageFactory.initElements;

/**
 * Created by sarowar on 1/14/17.
 */
public class TestSearch extends CommonAPI {

    //One Data Driven Option to supply search.data from Data Provider
    @DataProvider(name = "items")
    public Object[][] createData(){
        return new Object[][]{
                {"Obama"} ,
                {"Trump"} ,
                {"Computer"},
        };
    }

    //@Test
    public void testClickSearchIcon(){
        PageFactory.NewsSearch reutersSearch = new PageFactory.NewsSearch(driver);
        reutersSearch.clickSearchIcon.click();
        //Assert.assertTrue(getTitle().contains(reutersSearch.titleBusiness));

    }

    @Test(dataProvider = "items")
    public void searchUsingDataProvider(String data)throws InterruptedException{

        PageFactory.NewsSearch reutersSearch = new PageFactory.NewsSearch(driver);
        reutersSearch.clickSearchIcon.click();
        sleepFor(2);
        //initialize Search page factory
        NewsSearch search = initElements(driver, NewsSearch.class);
        search.searchFor(data);
        sleepFor(2);
        search.clearSearchInput();


    }
}
