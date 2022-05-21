package utility1;

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
		
		File fout= new File ("C:\\Users\\ADMIN$\\Desktop\\TestData.xlsx");
		
		FileOutputStream st=new FileOutputStream(fout);
		
	//	sh1.createRow(23).createCell(3).setCellValue("abc");//new value create karaych asel tr
		sh1.getRow(7).getCell(1).setCellValue("def");
		
		wb.write(st);
		
	}

}
