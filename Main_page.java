package Olx_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main_page {

    WebDriver driver;
    
    private By allDropDown = By.xpath("//button[@class='button_btn__r8N5j button_link__xvDOA']");
    private By MandT = By.xpath("//*[@id=\"__next\"]/div[2]/header/div[2]/div/div/div/div/div/ul/li[2]/a/div/span");
    
    private By MobButton = By.linkText("Mobiles");

    public Main_page(WebDriver driver){this.driver = driver;}

    public MobilesPage clickMandT(){
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 4);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//button[@class='button_btn__r8N5j button_link__xvDOA']"))));
        driver.findElement(allDropDown).click();
        Actions actions = new Actions(driver);
        WebElement MandTopt = driver.findElement(MandT);
        actions.moveToElement(MandTopt).perform();
        driver.findElement(MobButton).click();
        return new MobilesPage(driver);
    }

}
