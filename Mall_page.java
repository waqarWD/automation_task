package Home;

import Olx_pages.Main_page;
import Olx_pages.MobilesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Mall_page {
    private WebDriver driver;
    protected Main_page homePage;
    protected MobilesPage mobilesPage;

    @BeforeTest
    public void BrowersetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdul.waqar\\Desktop\\chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:\\Users\\abdul.waqar\\Desktop\\ServerIEDriverServer.exe");
        //driver = new InternetExplorerDriver();
        //WebDriver driver=new InternetExplorerDriver();
        
        driver = new ChromeDriver();
        driver.get("https://olx.com.pk/mall");

        homePage = new Main_page(driver);
        mobilesPage = new MobilesPage(driver);
    }

    @AfterTest
    public void Down(){
        driver.quit();
    }
}
