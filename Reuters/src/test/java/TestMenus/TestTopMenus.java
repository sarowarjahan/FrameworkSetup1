package TestMenus;

import PageFactory.TopMenus;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by sarowar on 1/14/17.
 */
public class TestTopMenus extends CommonAPI {


    @Test
    public void testTopMenuBusiness(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkBusiness.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleBusiness));
    }

    @Test
    public void testTopMenuMarkets(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkMarkets.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleMarkets));
    }

    @Test
    public void testTopMenuWorld(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkWorld.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleWorld));
    }

    @Test
    public void testTopMenuPolitics(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkPolitics.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titlePolitics));
    }

    @Test
    public void testTopMenuTech(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkTech.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleTech));
    }

    @Test
    public void testTopMenuCommentary(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkCommentary.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titleCommentary));
    }

    @Test
    public void testTopMenuPictures(){
        TopMenus reutersTopMenu = new TopMenus(driver);
        reutersTopMenu.linkPictures.click();
        Assert.assertTrue(getTitle().contains(reutersTopMenu.titlePictures));
    }



}
