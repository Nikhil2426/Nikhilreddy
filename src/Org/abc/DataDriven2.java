package Org.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven2 {
	
	public static void main(String[] args) throws IOException {
		//initiating file
		
		File excelloc = new File("C:\\Users\\nikhi\\excel\\testcase.xlsx");
		
	//	FileInputStream fin = new FileInputStream(excelloc);
		
		Workbook w = new XSSFWorkbook();
		
		Sheet s = w.createSheet("Sample");
		
		Row r = s.createRow(0);
		Cell c = r.createCell(5);
		c.setCellValue("helli");
		
		FileOutputStream fout = new FileOutputStream(excelloc);
		w.write(fout);
		
		System.out.println("done");
		
	}
}
