package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/index.php");
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//input[@value='Add']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Madhav");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Wadje");
		
		WebElement fileinput=driver.findElement(By.xpath("//input[@Type='file'][@name='photofile']"));
		fileinput.sendKeys("C:\\Users\\dell\\Pictures\\mini1.PNG");
		Thread.sleep(3000);
		
		driver.findElement(By.id("btnEdit")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
	}

