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

public class Redes {
public void Redes() throws MalformedURLException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");  
By usernamelocator = By.id("username");
By paswordlocator = By.id("password");
By loginlocator = By.name("login");
By contactlocator = By.name("Contactanos");
By facelocator = By.name("Facebook");
By Twitlocator = By.name("Twitter");
By Instalocator = By.name("Instagram");
By Tubelocator = By.name("Youtube");
WebDriver driver = new ChromeDriver(); 
  driver.get("http://localhost:82/login");    

  Thread.sleep(1000);   

   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   driver.findElement(contactlocator).click();
   driver.findElement(facelocator);
   driver.findElement(facelocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   Thread.sleep(2000);
   driver.findElement(Twitlocator);
   driver.findElement(Twitlocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   Thread.sleep(2000);
   driver.findElement(Instalocator);
   driver.findElement(Instalocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   Thread.sleep(2000);
   driver.findElement(Tubelocator);
   driver.findElement(Tubelocator).click();

   Thread.sleep(8000); 
  driver.quit();
} 
}
