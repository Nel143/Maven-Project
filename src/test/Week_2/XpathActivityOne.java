package Week_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class XpathActivityOne {

    /*
    In retail App click on videos Games then choose PS5 console
    then click on add to cart
    Only use relative Xpath.
     */
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get( "https://tek-retail-ui.azurewebsites.net/" );

        driver.findElement( By.xpath( "//img[@alt='Video Games']" )).click();

        driver.findElement( By.xpath("//p[text()='PlayStation 5 Console']" )).click();

        String text = driver.findElement( By.xpath( "//h1[@class='product__name']" )).getText();

        System.out.println( text );

        driver.findElement( By.xpath( "//button[@id='addToCartBtn']" )).click();

        driver.quit();
    }
}
