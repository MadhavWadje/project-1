package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.Utility.Log;

public class General extends Global {
	public void openapp() {
		driver=new FirefoxDriver();
        driver.get(url);		 
       System.out.println("appl opened");
       Reporter.log("open app");
	}
	
public void login() throws Exception {
	driver.findElement(By.name(untbx)).sendKeys(un);
	driver.findElement(By.name(pwtbx)).sendKeys(pw);
	driver.findElement(By.name(loginbtn)).click();
	Thread.sleep(1000);
	System.out.println("Login completed");
    Reporter.log("login");
Log.info("Login successful");
}

	public void closeapp() throws Exception {
driver.findElement(By.linkText(logoutbtn)).click();
Thread.sleep(500);
		driver.close();	
        System.out.println("logout completed");
        Reporter.log("closeapp");
Log.info("Logout successful");
	}

	public void Add()throws Exception {
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath(adbtn)).click();
		Thread.sleep(3000);
		driver.findElement(By.name(lnbx)).sendKeys(ln);
		driver.findElement(By.name(fnbx)).sendKeys(fn);
		Thread.sleep(1000);
		
	WebElement Fileinput=driver.findElement(By.xpath(Fileupld));
		Fileinput.sendKeys("C:\\Users\\dell\\Pictures\\mini1.PNG");
		
		driver.findElement(By.id(svbtn)).click();
		//driver.findElement(By.xpath(bckbtn)).click();
		Thread.sleep(1000);
		System.out.println("Add successful");
		//driver.switchTo().defaultContent();
	    Reporter.log("Add");
Log.info("Add success");
	}
	//Edit
	public void Edit() throws Exception {
	//driver.switchTo().frame("rightMenu");
	driver.findElement(By.name(ebtn)).click();
	driver.findElement(By.name(lnbx)).clear();
driver.findElement(By.name(lnbx)).sendKeys(ln1);
driver.findElement(By.name(fnbx)).clear();
driver.findElement(By.name(fnbx)).sendKeys(fn1);
driver.findElement(By.name(svbtn1)).click();
Thread.sleep(3000);
driver.findElement(By.xpath(bckbtn)).click();
//driver.switchTo().defaultContent();
System.out.println("Edit success");
Reporter.log("Edit");
Log.info("Edit successful");

	}
//delete
	public void delete() throws Exception {
Select st=new Select(driver.findElement(By.name("loc_code")));
st.selectByVisibleText("Emp. ID");
driver.findElement(By.name(srchbx1)).sendKeys(number);
driver.findElement(By.xpath(srchbtn1)).click();
driver.findElement(By.name(ckbx)).click();
driver.findElement(By.xpath(Dbtn)).click();
Thread.sleep(1000);
System.out.println("delete success");
driver.switchTo().defaultContent();
Reporter.log("delete");
Log.info("Delete successful");

	}
}




