package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {
	FileInputStream file;
	XSSFWorkbook wb;
	XSSFSheet sh;
	 XSSFCell cell;

	 public static String dataColumnValue;
	 public static int totalRows;



   public void readExcelFile(String location) throws IOException {
//	 file=new FileInputStream("C:\\Users\\thara\\eclipse-workspace\\AutimationPjt\\src\\test\\resources\\KDD.xlsx");
	   file=new FileInputStream(location);
	 wb=new XSSFWorkbook(file);
	
	 sh=wb.getSheet("Sheet1");
	 
	 totalRows=sh.getLastRowNum();
}

   public String getValuesFromExcel(int row,int column) {
	    cell=sh.getRow(row).getCell(column);
		
		String cellvalue=cell.getStringCellValue();
		return cellvalue;
		
		
		
		//System.out.println(cellvalue);
   }
   
  public void findWebelementToBeUsed() {
	  
  }
 }