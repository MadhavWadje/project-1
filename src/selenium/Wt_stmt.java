package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wt_stmt {
public static void main(String[] args)throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/index.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
Thread.sleep(3000);

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4)); 
	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
	driver.findElement(By.name("Submit")).click();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.linkText("Logout")).click();
driver.close();	
	
}
}
