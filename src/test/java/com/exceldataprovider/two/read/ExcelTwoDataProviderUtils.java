package com.exceldataprovider.two.read;

import com.exceldataprovider.four.forread.ExcelFourDataProviderUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import path.DriverAndFilesPathConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;

public class ExcelTwoDataProviderUtils {

    private static List<Map<String,String>> list;



    static{

        list=new ArrayList<>();
    }


   //  public static void main (String args[]){
    public static List<Map<String, String>> getTestDetails(String sheetname) {


        File file = new File(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePath());
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
            fs = new FileInputStream(DriverAndFilesPathConstants.getExcelIterationDataSheetTwo());
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
           //  String sheetname="DemoQa Test Control Data";
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

       // System.out.println(Arrays.toString(list.toArray()));
        return list;
    }



    @DataProvider
    public static   Object[] getData(Method m){
        //public static void main(String args[]){
        String testname=m.getName();
        //  list=new ArrayList<>();
        if(list.isEmpty()){
           list= ExcelTwoDataProviderUtils.getTestDetails("DemoQa Test Control Data");
        }

        //    System.out.println(Arrays.toString(list.toArray()));
        List<Map<String,String>> smalllist=new  ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).get("TestName").equalsIgnoreCase(testname)){
                if(list.get(i).get("Execute").equalsIgnoreCase("yes")){
                    smalllist.add(list.get(i));
                }
            }
        }

        return smalllist.toArray();
    }





















}
