/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selenium;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.JOptionPane;
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
public static void main(String[] args) throws MalformedURLException, InterruptedException{
Login Login1 = new Login();
Trailer Trailer1 = new Trailer();
Lenguaje Leng1 = new Lenguaje();
Redes Redes1 = new Redes();
Logout Logout1 = new Logout();
Agregarproducto Agre1 = new Agregarproducto();
Menu(Login1,Trailer1,Leng1,Redes1,Logout1,Agre1);
}

public static void Menu(Login Login1, Trailer Trailer1, Lenguaje Leng1, Redes Redes1, Logout Logout1, Agregarproducto Agre1) throws MalformedURLException, InterruptedException{
        String lectura;
        int opcion;
        do {
            lectura = JOptionPane.showInputDialog("////- MENU DE PRUEBAS -//// \n"
                    + "1.  Prueba Login \n"
                    + "2.  Prueba trailer \n"
                    + "3.  Prueba de cambio de lenguaje \n"
                    + "4.  Prueba Redes sociales  \n"
                    + "5.  Prueba Logout  \n"
                    + "6.  Prueba Agregar producto +++en desarollo \n"
                    + "0. Salir");
            opcion = Integer.parseInt(lectura);
            switch (opcion) {
                case 1:
                    Login1.Login();
                    break;
                case 2:
                    Trailer1.Trailer();
                    break;
                case 3:
                    Leng1.Lenguaje();
                    break;
                case 4:
                    Redes1.Redes();
                    break;
                case 5:
                    Logout1.Logout();
                    break;
                case 6:
                    Agre1.Agregar();
                    break;
                case 0:
                    System.out.println("Pruebas finalizadas, Exitos compañeros");
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
        } while (opcion != 0);
    }
    
}
