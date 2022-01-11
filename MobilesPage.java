package Olx_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MobilesPage {
    WebDriver driver;

    private By minPrice = By.id("minPrice");
    private By maxPrice = By.id("maxPrice");
    private By resultsCard = By.xpath("/html/body/div[1]/div[2]/main/div/div/div[2]/div[2]/div/div[2]/div[2]");
    private By resultOne = By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div[2]/div/div[2]/div[2]/a[1]");
    private By tagName = By.tagName("a");
    private String attr = "";

    public MobilesPage(WebDriver driver){this.driver = driver;}

    public void setMinPrice(String minprice) {
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("minPrice"))));
        driver.findElement(minPrice).sendKeys(minprice);
    }

    public void setMaxPrice(String maxprice) {
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("maxPrice"))));
        driver.findElement(maxPrice).clear();
        driver.findElement(maxPrice).sendKeys(maxprice);
    }


    public void clickResult(){
List<WebElement> allLinks = driver.findElements((tagName));
        System.out.println("No of links are: "+ allLinks.size());

        for (int i =0 ; i < allLinks.size(); i++){
      
      WebDriverWait wait = new WebDriverWait(driver, 4);
            wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"__next\"]/div[2]/main/div/div/div[2]/div[2]/div/div[2]/div[2]"))));

            WebElement elm = allLinks.get(i);
            String url = elm.getAttribute("href");

                if(url.contains("products")){
                    driver.get(url);
                    try{Thread.sleep(7000);}
                    catch (InterruptedException ie){}
                    driver.navigate().back();
                }
                else{
                    i++;
                }
        }
    }
}
