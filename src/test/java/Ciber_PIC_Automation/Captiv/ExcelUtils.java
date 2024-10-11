package Ciber_PIC_Automation.Captiv;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

	private Workbook workbook;
	private Sheet sheet;

	// Constructor to open the Excel file
	public ExcelUtils(String excelFilePath, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to get cell data
	public String getCellData(int rowNum, int colNum) {
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(colNum);

		if (cell.getCellType() == CellType.STRING) {
			return cell.getStringCellValue();
		} else if (cell.getCellType() == CellType.NUMERIC) {
			return String.valueOf((int) cell.getNumericCellValue());
		} else {
			return "";
		}
	}

	// Close workbook
	public void close() {
		try {
			workbook.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
