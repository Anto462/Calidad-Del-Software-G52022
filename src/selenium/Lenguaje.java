/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package selenium;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
By Logoutlocator = By.name("Logout");
By lenglocatoren = By.id("Ingles");
By lenglocatores = By.id("Espanol");
By validaleng = By.xpath("/html/body/div[1]/h2");
int espanol = 0;
int ingles = 0;

WebDriver driver = new ChromeDriver(); 
  driver.get("http://localhost:82/login");    

  Thread.sleep(1000);   
   driver.manage().window().maximize();
   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   Thread.sleep(3000);
   driver.findElement(Logoutlocator).click();
   driver.findElement(lenglocatoren).click();
   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
    if(driver.findElement(validaleng).isDisplayed()){
       System.out.println("Completada la prueba se observa en ingles con exito");
       ingles = 1;
   }
   Thread.sleep(3000);
   driver.findElement(Logoutlocator).click();
   driver.findElement(lenglocatores).click();
   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   if(driver.findElement(validaleng).isDisplayed()){
       System.out.println("Completada la prueba se observa en español con exito");
       espanol = 1;
   }
   
   if(ingles == 1 && espanol==1){
       System.out.println("Se observan con exito los lenguajes");
   }
   Thread.sleep(8000); 
  driver.quit();
} 
}
