package fileFormats.xls;

import org.apache.poi.hssf.extractor.ExcelExtractor;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;

/**
 * Created by Tetiana_Romaniv on 10/5/2016.
 */
public class RunnerXls {
    public static void main(String[] args) throws Exception {

        InputStream in = new FileInputStream("cities.xls");
        HSSFWorkbook wb = new HSSFWorkbook(in);

        Sheet sheet = wb.getSheetAt(0);
        Iterator<Row> it = sheet.iterator();
        while (it.hasNext()) {
            Row row = it.next();
            Iterator<Cell> cells = row.iterator();
            while (cells.hasNext()) {
                Cell cell = cells.next();
                int cellType = cell.getCellType();
                switch (cellType) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.println(" city : " + cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print("id : " + cell.getNumericCellValue() + " =");
                        break;

                    case Cell.CELL_TYPE_FORMULA:
                        System.out.print("id : " + cell.getNumericCellValue() + " =");
                        break;
                    default:
                        System.out.print("|");
                        break;
                }
            }
            System.out.println();
        }


        InputStream in1 = new FileInputStream("cities.xls");
        HSSFWorkbook wb1 = new HSSFWorkbook(in1);
        ExcelExtractor extractor = new ExcelExtractor(wb1);
        extractor.setFormulasNotResults(false);
        extractor.setIncludeSheetNames(true);
        String text = extractor.getText();
        System.out.println(text);

    }
}
