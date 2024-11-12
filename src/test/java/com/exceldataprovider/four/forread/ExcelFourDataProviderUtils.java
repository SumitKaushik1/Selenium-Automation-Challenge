package com.exceldataprovider.four.forread;

import customExceptions.FrameworkException;
import customExceptions.InvalidPathExcelException;
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

public class ExcelFourDataProviderUtils {

    private static List<Map<String,String>> list;



    static{

        list=new ArrayList<>();
    }



    // public static void main (String args[]){
    public static Object[][] getDataVWOFour() {

        try( FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"/resources/excelfiles/Vwo.xlsx");) {

            XSSFWorkbook workbook=new  XSSFWorkbook(fs);
            XSSFSheet sheet=workbook.getSheet("Login Data");

            //first rownumber start from 0 end row number end at 2 // 0 1, 2 ie 3 rows
            int rowNum=sheet.getLastRowNum();//
            System.out.println(rowNum);// 3 rows come

            int colNum=sheet.getRow(0).getLastCellNum();// 3 columns
            //getRow(index of first row).number of cells in one row is equal to column //3 columns
            System.out.println(colNum);

            Object[][] data=new Object[rowNum][colNum];
            // to hold the address of each row since values are in 2 rows 1st and 2nd index only removeing first row 0 indx



            // we start from 1st index ie 2nd row bz we need the values form the 2nd row only to last index ie 2nd index ie 3rd row
            //i is index
            for(int i=1;i<=rowNum;i++){

                for(int j=0;j<colNum;j++){

                    // here we are setting the key as fixed three ie loginid ,usename and hte password
                    data[i-1][j]= sheet.getRow(i).getCell(j).getStringCellValue();
                    //  System.out.println("key :"+key);




                }



            }


/*
            for(int i=1;i<=rowNum;i++){

                for(int j=0;j<colNum;j++){


                    System.out.println(data[i-1][j]);



                }



            }*/


            return data;


        }
        catch(IOException e){
            // e.printStackTrace();
            //  e.printStackTrace();
            throw new FrameworkException("some io exception happened while reading excel file ");
        }



    }






   //  public static void main (String args[]){
   public static List<Map<String, String>> getTestDetails(String sheetname) {


       // File file = new File(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePath());
       File file = new File(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePathEncoded());
        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }



        List<Map<String, String>> list = null;

        //fileinputtream is needed to read the excel file
       // FileInputStream fs = null;
      //  try(FileInputStream fs= new FileInputStream(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePath())) {
            try(FileInputStream fs= new FileInputStream(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePathEncoded())) {

           // fs = new FileInputStream(DriverAndFilesPathConstants.getExcelVWOLoginControlFilePath());
            XSSFWorkbook workbook = new XSSFWorkbook(fs);
           //  String sheetname="vwo login user and password";
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

        } catch(FileNotFoundException e){

            //e.printStackTrace();
            throw new InvalidPathExcelException("Excel File trying to read is not found");
            // to give hte customized messag we make the custom excpetion
        }
        catch(IOException e){
            // e.printStackTrace();
            //  e.printStackTrace();
            throw new FrameworkException("some io exception happened while reading excel file ");
        } /*finally {

            try {
                if (Objects.nonNull(fs)) {
                    fs.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/

        //System.out.println(Arrays.toString(list.toArray()));
        return list;
    }





    @DataProvider
    public static   Object[] getData(Method m){
        //public static void main(String args[]){
        String testname=m.getName();
        //  list=new ArrayList<>();
        if(list.isEmpty()){
            list= ExcelFourDataProviderUtils.getTestDetails("vwo login user and password");
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
