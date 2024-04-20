package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/dell/Downloads/WebTable%20(1).html");
	
	int row=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td[1]")).size();
	int col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]/td")).size();
	int row_col=driver.findElements(By.xpath("//*[@id=\"idCourse\"]/tbody/tr/td")).size();
	
	System.out.println("row count"+ row);
	System.out.println("col count"+ col);
System.out.println("row_col count"+ row_col);

	String celldata=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[3]/td[2]")).getText();
    System.out.println(celldata);

String celldata1=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr[1]")).getText();
System.out.println(celldata);
String cell=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/td[2]")).getText();
System.out.println(cell);

//row print verticaly
//for(int s=1; s<=col; s++) {
//String celldata2=driver.findElement(By.xpath("//*[@id=\\\"idCourse\\\"]/tbody/tr[1]/td["+s+"]")).getText();
//System.out.println(celldata2);




for(int i=1; i<=row; i++) {
String data=driver.findElement(By.xpath("//*[@id=\"idCourse\"]/tbody/tr["+i+"]")).getText();
System.out.println(data);
}
driver.quit();
}
}
