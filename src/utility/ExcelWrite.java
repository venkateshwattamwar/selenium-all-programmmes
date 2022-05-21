package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
File src =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);//workbook varti yeto
		
		XSSFSheet sh1=wb.getSheetAt(0);//sheet index ghetl
		File src1 =new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");
		
		FileOutputStream st=new FileOutputStream(src1);//write karnyasthi
		
	//	sh1.createRow(22).createCell(2).setCellValue("amit");
		sh1.getRow(3).createCell(1).setCellValue("madhuri");;
		
		wb.write(st);
		
		
		
	}

}
