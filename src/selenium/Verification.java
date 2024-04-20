package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Verification {
public static void main(String args[])throws Exception {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("http://183.82.103.245/nareshit/login.php");
	
	if(driver.getTitle().equals("hrms")) {
		System.out.println("Title matched");
	}
	else {
		System.out.println("Title not Matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
	driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
	driver.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
	if(driver.getTitle().equals("orange Hrms")) {
		System.out.println("Title Matched");
	}
	else {
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
	}
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
