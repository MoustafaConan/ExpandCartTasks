package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Task2Test extends TestBase {
    Pages.Task2Page task2Page;

    @Test
    public void assertApps(){
        task2Page = new Pages.Task2Page(driver);
        String URL = prop.getProperty("task2URL");
        driver.get(URL);
        task2Page.clickOnApps();

        Assert.assertEquals("https://play.google.com/store/apps", task2Page.getCurrentUrl());

    }

    @Test (dependsOnMethods = {"assertApps"})
    public void CheckByCurrentUrl()  {
        //ExtentTest test= extent.createTest("element is loaded");
        task2Page = new Pages.Task2Page(driver);
        String URL = prop.getProperty("task2URL");
        driver.get(URL);

        task2Page.clickOneducationLink();
        // Assert that you are in Educational page
        String currentUrl= task2Page.getCurrentUrl();
        Assert.assertEquals("https://play.google.com/store/apps/category/GAME_EDUCATIONAL",currentUrl);

    }

    @Test (dependsOnMethods = {"assertApps"})
    public void CheckByCurrentCategory() {
        //ExtentTest test= extent.createTest("element is loaded");
        task2Page = new Pages.Task2Page(driver);
        String URL = prop.getProperty("task2URL");
        driver.get(URL);

        task2Page.clickOneducationLink();
        // Assert that you are in Educational page
        String currentUrl= task2Page.getCurrentUrl();
        Assert.assertEquals("Educational", task2Page.element.getText());

    }
}

