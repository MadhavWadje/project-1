package selenium;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class Excel {
public static void main(String[] args) throws Exception {
FileInputStream file=new FileInputStream("C:\\Users\\dell\\Desktop\\family.xls");
Workbook wb= Workbook.getWorkbook(file);
Sheet st=wb.getSheet(0);

int rowcount=st.getRows();
System.out.println(rowcount);
for(int i=1; i<=1; i++) {
	String eid=st.getCell(0,i).getContents();
	String ename=st.getCell(0,i).getContents();
	String eemail=st.getCell(0,i).getContents();
	String eno=st.getCell(0,i).getContents();
	System.out.println(eid + "||" +ename);
	
	
}


}
}