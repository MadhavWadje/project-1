package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {
public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);

Alert a=driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
	Thread.sleep(3000);
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
driver.close();
}
}
