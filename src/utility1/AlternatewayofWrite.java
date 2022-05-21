package utility1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AlternatewayofWrite {
	
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"\\Book1.xlsx";
		File src =new File (path);//path define
		
		FileInputStream fis =new FileInputStream(src);//read file
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);//workbook varti yeto
		
		XSSFSheet sh1=wb.getSheetAt(0);//sheet index ghetl
		
		File fout= new File (path);
		
		FileOutputStream st=new FileOutputStream(path);
		
//		sh1.createRow(23).createCell(3).setCellValue("abc");//new value create karaych asel tr
		sh1.getRow(8).getCell(1).setCellValue("def");
		
		wb.write(st);

		
	}
}
