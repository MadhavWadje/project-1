package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
public WebDriver driver;

//Test data***
//loginlogout
public String url="http://183.82.103.245/nareshit/login.php";
public String un = "nareshit";
public String pw = "nareshit";
//Add
public String ln= "Fresher"; 
public String fn="Experience";
//Edit
public String ln1="Tester";
public String fn1="QA";
//delete
public String number="0071";


//objective**
//loginlogout
public String untbx="txtUserName"; 
public String pwtbx="txtPassword"; 
public String loginbtn="Submit"; 
public String logoutbtn="Logout"; 
//Add
public String adbtn="//input[@value='Add']";
public String lnbx="txtEmpLastName";
public String fnbx="txtEmpFirstName";
public String Fileupld="//input[@Type='file'][@name='photofile']";
public String file="C:\\Users\\dell\\Pictures\\mini.png";
public String svbtn="btnEdit";      //id
public String bckbtn="//input[@value='Back']";
//Edit
public String ebtn="EditMain";
public String svbtn1="EditMain";
//delete
public String srchbx1="loc_name";
public String srchbtn1="//input[@value='Search']";
public String ckbx="chkLocID[]";
public String Dbtn="//input[@value='Delete']";

}
