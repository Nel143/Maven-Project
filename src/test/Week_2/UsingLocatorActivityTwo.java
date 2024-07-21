package Week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingLocatorActivityTwo {

    /*
    In google.com search for TekSchool and click on First Link that have TekSchool.
    Hint. To click on first link you can use PartialLinkText locator strategy.
     */
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.get( "https://www.google.com" );

        driver.manage().window().maximize();

        By textLocator = By.name( "q" );
        WebElement searchElement = driver.findElement( textLocator );
        searchElement.sendKeys( "TekSchool" );

        By searchlocator = By.name( "btnK" );
        WebElement textElement = driver.findElement( searchlocator );
        textElement.click();

        By linkLocator = By.partialLinkText( "TEK SCHOOL Modern" );
        WebElement linkElement = driver.findElement( linkLocator );
        linkElement.click();

        driver.quit();


    }
}
