import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelRead {

	public static void main(String[] args) throws IOException {
		
		String excelFilePathString = ".\\src\\main\\resources\\salary.xlsx";		
		FileInputStream inputStream = new FileInputStream(excelFilePathString);
		
		XSSFWorkbook workbook = new XSSFWorkbook(inputStream); //XSSFWorkbook class comes from Apache POI
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rows = sheet.getLastRowNum(); 					//total row numbers
		int columns = sheet.getRow(rows).getLastCellNum();	// total column numbers
		
		for (int i=0; i<=rows; i++)
		{
			XSSFRow row = sheet.getRow(i);		// reading one row object
			
			for (int j=0; j<columns; j++)		// for one row, iterating column by column
			{	
				XSSFCell cell = row.getCell(j);	// getting one cell object
				switch(cell.getCellType()) 			// getting cell data type
				{
				case STRING: 
					System.out.print(cell.getStringCellValue());  
					break;
				case NUMERIC:
					System.out.print(cell.getNumericCellValue()); 
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue()); 
					break;
				default:
					System.out.print("Unknown");
					break;
				}
				System.out.print(" | ");
			}	
			System.out.println();
		}
		workbook.close();
		
	}

}
