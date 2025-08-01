package Daraz.utils;

import Daraz.constants.FrameworkConstants;
import Daraz.exceptions.FrameworkException;
import Daraz.exceptions.InvalidPathForExcelException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public final class ExcelUtils {
    private ExcelUtils(){}

    //try with resource
    public static List<Map<String,String>> getTestDetails(String sheetname){
        List<Map<String,String>> list=null;

        DataFormatter formatter = new DataFormatter(); // Handles all cell types

        try (FileInputStream fs= new FileInputStream(FrameworkConstants.getExcelpath())){

            XSSFWorkbook workbook= new XSSFWorkbook(fs);
           // String sheetname ="RUNMANAGER";
            XSSFSheet sheet=workbook.getSheet(sheetname);

            int lastrownum = sheet.getLastRowNum();
            int  lastcolnum = sheet.getRow(0).getLastCellNum();

            Map<String,String> map=null;
            list=new ArrayList<>();



            for(int i=0;i<=lastrownum;i++){
                map=new HashMap<>();
                for(int j=0;j<lastcolnum;j++){

                    String key = formatter.formatCellValue(sheet.getRow(0).getCell(j)); // Handles any cell type
                    String value = formatter.formatCellValue(sheet.getRow(i).getCell(j));
                  // String key=sheet.getRow(0).getCell(j).getStringCellValue();
                   //String value=sheet.getRow(i).getCell(j).getStringCellValue();
                   map.put(key,value);
                }
                list.add(map);
            }

        } catch (FileNotFoundException e) {
        throw new InvalidPathForExcelException("Excel File you trying to read is not found");
        }catch (IOException e) {
       throw new FrameworkException("Some io exception happened while reading excel file");
        }
        return list;

    }
}