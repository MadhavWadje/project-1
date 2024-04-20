package Tscript;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC001 extends General {
//public static void main(String[] args) throws Exception {
	
	@Test
	public void Testng() throws Exception {
		DOMConfigurator.configure("log.xml");	
	General s=new General();
     s.openapp();
     s.login();
     s.Add();
     s.Edit();
     s.delete();
     s.closeapp();
	}
}

