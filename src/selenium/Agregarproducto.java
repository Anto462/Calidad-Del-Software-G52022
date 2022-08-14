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

public class Agregarproducto {
public void Agregar() throws MalformedURLException, InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");  
By usernamelocator = By.id("username");
By paswordlocator = By.id("password");
By loginlocator = By.name("login");
By Collocator = By.name("Colecionismo");
By Agrelocator = By.name("Agregarcol");
By NameLocator = By.name("nombre");
By PrecioLocator = By.name("precio");
By UnidadesLocator = By.name("unidades");
By MarcaLocator = By.name("marca");
By DescLocator = By.name("descripcion");
By VideojuegoLocator = By.name("videojuego");
By ProductoLocator = By.name("producto");
By Savelocator = By.name("Guardar");

WebDriver driver = new ChromeDriver(); 
  driver.get("http://localhost:82/login");    

  Thread.sleep(1000);   
driver.manage().window().maximize();
   driver.findElement(usernamelocator).sendKeys("alejandro");
   driver.findElement(paswordlocator).sendKeys("123");
   driver.findElement(loginlocator).click();
   driver.findElement(Collocator).click();
   driver.findElement(Agrelocator).click();
   
   Thread.sleep(8000); 
   driver.findElement(NameLocator).sendKeys("Selenium");  
   driver.findElement(PrecioLocator).sendKeys("1");
   driver.findElement(UnidadesLocator).sendKeys("2");
   driver.findElement(MarcaLocator).sendKeys("selenium");
   driver.findElement(DescLocator).sendKeys("Soy una prueba automatizada");
   driver.findElement(VideojuegoLocator).sendKeys("1");
   driver.findElement(ProductoLocator).sendKeys("1");
   driver.findElement(Savelocator).click();
   if(driver.findElement(Agrelocator).isDisplayed()){
       System.out.println("Completada la prueba de agregar producto con exito");
   }

   Thread.sleep(8000); 
  driver.quit();
}    
}
