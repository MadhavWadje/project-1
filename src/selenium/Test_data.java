package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_data {
	//Test data
static 	String url = "http://183.82.103.245/nareshit/login.php";
static String Username= "nareshit";
static String password="nareshit";
static	String Title1="OrangeHRM - New Level of HR Management";
static	String Title2 ="OrangeHRM";
	
	public static void main(String args[]) throws Exception{
WebDriver driver=new FirefoxDriver();
	driver.navigate().to(url);
	if(driver.getTitle().equals(Title1)) {
		System.out.println("title matched1");
	}
	driver.findElement(By.name("txtUserName")).sendKeys(Username);
	driver.findElement(By.name("txtPassword")).sendKeys(password);
	driver.findElement(By.name("Submit")).click();
	if(driver.getTitle().equals(Title2)) {
		System.out.println("title matched2");
	}
	Thread.sleep(3000);
	driver.findElement(By.linkText("Logout")).click();
	driver.close();
}
}
