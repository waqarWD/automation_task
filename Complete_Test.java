package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Home.Mall_page;
import Olx_pages.Main_page;
import Olx_pages.MobilesPage;

import java.util.concurrent.TimeUnit;

public class Complete_Test extends Mall_page {

    private WebDriver driver;

    @Test
    public void testMandT(){
        MobilesPage mobilesPage = homePage.clickMandT();
        mobilesPage.setMinPrice("40,000");
        mobilesPage.setMaxPrice("120,000");
        //mobilesPage.clickResult();
        try {
            Thread.sleep(8000);
        }
        catch (InterruptedException ie){}
    }

    @Test
    public void testPrices(){
        mobilesPage.clickResult();
        try {
            Thread.sleep(8000);
        }
        catch (InterruptedException ie){}
    }
}
