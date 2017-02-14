package TestNGClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcelLib {
	
//@DataProvider(name="feedData")
@DataProvider(name="feedData")
public static Object [][] test001(Method m) throws EncryptedDocumentException, InvalidFormatException, IOException{
	
	if(m.getName().equalsIgnoreCase("test_003")){
        try {
	          return DataProviderExcelLib.getExcelData("Sheet1",1);
        } catch (Exception e) {
	          e.printStackTrace();
	          return DataProviderExcelLib.getExcelData("Sheet1",1);
        }
        
	   } 
	 else if(m.getName().equalsIgnoreCase("test_004")){
    	     return DataProviderExcelLib.getExcelData("Sheet3",1);
       }
	return new Object[1][1];
}
	
	
	
final static String xlpath="E:\\Automation\\NewTest2\\testdata\\testdata.xlsx"; 
    
	public static Object[][] getExcelData(String sheet1, int colnum) throws EncryptedDocumentException, InvalidFormatException, IOException {
	
	FileInputStream fis = new FileInputStream(xlpath);
	Workbook wb=WorkbookFactory.create(fis);
	//String data = wb.getSheet(sname).getRow(rnum).getCell(cnum).getStringCellValue();
	int rowcount=wb.getSheet(sheet1).getLastRowNum()-wb.getSheet(sheet1).getFirstRowNum();
	System.out.println("Last row number"+wb.getSheet(sheet1).getLastRowNum());
	System.out.println("First row number"+wb.getSheet(sheet1).getFirstRowNum());
	//int colnum = wb.getSheet(sheet1).getRow(0).getLastCellNum();
	System.out.println("last cell num"+colnum);
	Object [][] arr = new Object[rowcount][colnum+1];
	for(int i=0;i<rowcount;i++){
		for(int j=0;j<=colnum;j++){
			//System.out.print(wb.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue()+" ");
			arr[i][j]=wb.getSheet(sheet1).getRow(i+1).getCell(j).getStringCellValue();
			System.out.println(arr[i][j]);
		}
		
	}
	fis.close();

	return arr;
	
	
	}
	
	public void setExcelData(String sname, int rnum,int cnum,String data) throws EncryptedDocumentException, InvalidFormatException, IOException{
		try {
			
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb=WorkbookFactory.create(fis);
			Cell c1 = wb.getSheet(sname).getRow(rnum).createCell(cnum);
			c1.setCellValue(data);
			FileOutputStream fos = new FileOutputStream(xlpath);
			wb.write(fos);
			fos.close();
			fis.close();
		
			} catch (FileNotFoundException e) {
				System.out.println("Data Not Written");
			}
	}

}
