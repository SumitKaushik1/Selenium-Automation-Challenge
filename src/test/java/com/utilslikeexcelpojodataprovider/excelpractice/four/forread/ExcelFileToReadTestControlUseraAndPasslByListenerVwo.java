package com.utilslikeexcelpojodataprovider.excelpractice.four.forread;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import path.DriverAndFilesPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelFileToReadTestControlUseraAndPasslByListenerVwo {

    // private construcor bz object of this class not allowed
    private ExcelFileToReadTestControlUseraAndPasslByListenerVwo() {
    }


  // public static void main (String args[]){
    public static List<Map<String, String>> getTestDetails(String sheetname) {


        File file = new File(DriverAndFilesPath.getExcelVWOLoginControlFilePath());
        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }



        List<Map<String, String>> list = null;

        //fileinputtream is needed to read the excel file
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(DriverAndFilesPath.getExcelVWOLoginControlFilePath());
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
            // String sheetname="vwo login user and password";
          XSSFSheet sheet = workbook.getSheet(sheetname);

           // XSSFSheet sheet= workbook.getSheetAt(0);
          //  XSSFSheet sheet = workbook.getSheet("vwo login user and password control");
            System.out.println(Objects.nonNull(sheet));
            int lastrownum = sheet.getLastRowNum();
            int lastcolnum = sheet.getRow(0).getLastCellNum();

            Map<String, String> map = null;
            list = new ArrayList<>();

            for (int i = 1; i < lastrownum; i++) {
                map = new HashMap<>();
                for (int j = 0; j < lastcolnum; j++) {
                    String key = sheet.getRow(0).getCell(j).getStringCellValue();
                    String value = sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key, value);
                }
                list.add(map);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (Objects.nonNull(fs)) {
                    fs.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(Arrays.toString(list.toArray()));
       return list;
    }


}
