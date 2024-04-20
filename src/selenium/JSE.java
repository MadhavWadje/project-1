package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSE {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");

	WebElement element=driver.findElement(By.name("Submit"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",element);
	Thread.sleep(3000);
	System.out.println("login completed");
	
	WebElement logout=(driver.findElement(By.linkText("Logout")));
JavascriptExecutor executor1=(JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();",logout);
	System.out.println("logout completed");
	driver.close();
}
}