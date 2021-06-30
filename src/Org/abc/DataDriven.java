package Org.abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		//initiating file
		
		File excelloc = new File("C:\\Users\\nikhi\\excel\\testcase.xlsx");
		
		FileInputStream fin = new FileInputStream(excelloc);
		
		Workbook w = new XSSFWorkbook(fin);
		
		Sheet s = w.getSheet("hello");
		
		
		Row r = s.getRow(0);
		Cell c = r.getCell(1);
		System.out.println(c);
		
		CellType cellType = c.getCellType();
		
	System.out.println(cellType);
	
	System.out.println("*****");
	
	
	if (cellType==CellType.STRING) {
		
		String stringCellValue = c.getStringCellValue();
		
		System.out.println(stringCellValue);
		
	}
	
	if (cellType == CellType.NUMERIC) {
		
		if(DateUtil.isCellDateFormatted(c)) {
			SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yy");
			String format = s1.format(c.getDateCellValue());
			System.out.println(format);
		
		}else {
			double numericCellValue = c.getNumericCellValue();
			
			long l = (long) numericCellValue;
			
	String valueOf = String.valueOf(l);
	System.out.println(valueOf);
		
		


	}


	
	}

	
	}
}