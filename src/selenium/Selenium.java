/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


/**
 *
 * @author Usuario
 */
public class Selenium {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");  

WebDriver driver = new ChromeDriver(); 
  driver.get("http://www.google.com/");    

  Thread.sleep(5000);  // Let the user actually see something!     

  WebElement searchBox = driver.findElement(By.name("q"));

  searchBox.sendKeys("ChromeDriver");     

  searchBox.submit();    

  Thread.sleep(5000);  // Let the user actually see something!     

  driver.quit();
}
    
}
