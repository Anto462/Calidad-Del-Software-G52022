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

public class Logout {
public void Logout() throws MalformedURLException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");  
By usernamelocator = By.id("username");
By paswordlocator = By.id("password");
By loginlocator = By.name("login");
By Logoutlocator = By.name("Logout");

WebDriver driver = new ChromeDriver(); 
  driver.get("http://localhost:82/login");    

  Thread.sleep(1000);   
   driver.manage().window().maximize();
   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   Thread.sleep(3000);
   driver.findElement(Logoutlocator).click();

   Thread.sleep(8000); 
  driver.quit();
}
}
