package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WB {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("file:///C:/Users/dell/Downloads/WebTable%20(1).html");
	
	int row = driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr")).size();
	int col=driver.findElements(By.xpath("//table[@id='idCourse']/tbody/tr[1]/td")).size();
	int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
	
	System.out.println("Row Count " + row);
	System.out.println("Col Count " + col);
	System.out.println("Row_col Count " + row_col);
	
	//perticular t.data
	String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[6]/td[2]")).getText();
			System.out.println(celldata);
			
String celldata1= driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td[1]")).getText();	
		System.out.println(celldata1);
		String celldata2=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[4]/td[4]")).getText();
		System.out.println(celldata2);
		
		//1st row all data
		String celldata4=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]")).getText();
		System.out.println(celldata4);
		//6th row all data
		String celldata5=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[6]")).getText();
		System.out.println(celldata5);
		
		//String celldata6=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/td[4]")).getText();
		//System.out.println(celldata6);
		
//all row & all col
for(int i=1; i<=row; i++) {
	String data = driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
System.out.println(data);
}
driver.close();
}

}
