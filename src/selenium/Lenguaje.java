/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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

public class Lenguaje {
public void Lenguaje() throws MalformedURLException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");  
By usernamelocator = By.id("username");
By paswordlocator = By.id("password");
By loginlocator = By.name("login");
By lenglocatoren = By.name("Ingles");
By lenglocatores = By.name("Espanol");

WebDriver driver = new ChromeDriver(); 
  driver.get("http://localhost:82/login");    

  Thread.sleep(1000);   

   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   driver.findElement(lenglocatoren);
   driver.findElement(lenglocatoren).click();
   Thread.sleep(5000);
   driver.findElement(lenglocatores).click();
   
   Thread.sleep(8000); 
  driver.quit();
} 
}
