package Week_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowsingHandlingTwo {

    public static void main(String[] args){

        Scanner object = new Scanner(System.in);

        System.out.println("choose browser chrome, firefox, edge");

        String browserType = object.next();

        WebDriver driver;

        if ( browserType.equalsIgnoreCase( "chrome" ) ){

            driver = new ChromeDriver();
        }
        else if ( browserType.equalsIgnoreCase( "firefox" ) ){

            driver = new FirefoxDriver();
        }
        else if ( browserType.equalsIgnoreCase("edge" ) ){

            driver = new EdgeDriver();
        }
        else {

            throw new RuntimeException( "Wrong driver" );
        }
        driver.get( "https//google.com");


    }
}
