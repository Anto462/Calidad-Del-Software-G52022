/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium;
import dev.failsafe.internal.util.Assert;
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

int face = 0;
int twit = 0;
int insta = 0;
int tube = 0;

By Facevalidator = By.xpath("//img[ @src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']");

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
   if(driver.findElement(facelocator).isDisplayed()){
   face = 1;   
   }
   Thread.sleep(2000);
   driver.findElement(Twitlocator);
   driver.findElement(Twitlocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   if(driver.findElement(Twitlocator).isDisplayed()){
   twit = 1;   
   }
   Thread.sleep(2000);
   driver.findElement(Instalocator);
   driver.findElement(Instalocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   if(driver.findElement(Instalocator).isDisplayed()){
   insta = 1;   
   }
   Thread.sleep(2000);
   driver.findElement(Tubelocator);
   driver.findElement(Tubelocator).click();
   Thread.sleep(3000);
   driver.switchTo().window("");
   if(driver.findElement(Tubelocator).isDisplayed()){
   tube = 1;   
   }

   if(face ==1 && twit ==1 && insta == 1 && tube ==1){
       System.out.println("Redes validadas con exito");
   }
   Thread.sleep(8000); 
  driver.quit();
} 
}
