package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceltestdata {
	
	static String path = System.getProperty("user.dir")+"\\src\\test\\resources\\testdata.xlsx";
	public static String readdata(int row , int cell) throws IOException {
		
		 FileInputStream fis = new FileInputStream(path);
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		 String val1=wb.getSheet("Sheet7").getRow(row).getCell(cell).getStringCellValue();
			return val1;
		
	}
	
	public static void writedata(int row, int cell , String msg) throws IOException {
		FileInputStream Fis = new FileInputStream(path);
		 XSSFWorkbook wb = new XSSFWorkbook(Fis);
		wb.getSheet("Sheet7").getRow(row).createCell(cell).setCellValue(msg);
		FileOutputStream fop = new FileOutputStream(path);
		wb.write(fop);
		fop.close();
		
		
	}
	

}
