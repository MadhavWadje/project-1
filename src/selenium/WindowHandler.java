package selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandler {
public static void main(String[] args) throws Exception{
	WebDriver driver=new FirefoxDriver();
	Thread.sleep(3000);
	
	driver.get("file:///C:/Users/dell/Downloads/multiplewindows.html");
driver.findElement(By.id("btn1")).click();
driver.findElement(By.id("btn2")).click();
driver.findElement(By.id("btn3")).click();
Thread.sleep(3000);
	
ArrayList <String> windowinfo= new ArrayList <> (driver.getWindowHandles());
driver.switchTo().window(windowinfo.get(2));
driver.close();
	
}
}
