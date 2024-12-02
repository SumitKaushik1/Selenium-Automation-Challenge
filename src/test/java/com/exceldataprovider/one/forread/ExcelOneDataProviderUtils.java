package com.exceldataprovider.one.forread;

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

public class ExcelOneDataProviderUtils {


    private static List<Map<String,String>> list;



    static{

        list=new ArrayList<>();
    }


    //public static void main (String args[]){

    //static bz it is unique per  class

   public static Object[] getDataExcelAppilotools() {

        try( FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"/resources/excelfiles/Appollo.xlsx");) {

            XSSFWorkbook workbook=new  XSSFWorkbook(fs);
            XSSFSheet sheet=workbook.getSheet("Login Data");

            //first rownumber start from 0 end row number end at 2 // 0 1, 2 ie 3 rows
            int rowNum=sheet.getLastRowNum();//
            System.out.println(rowNum);// 3 rows come

            int colNum=sheet.getRow(0).getLastCellNum();// 3 columns
            //getRow(index of first row).number of cells in one row is equal to column //3 columns
           System.out.println(colNum);

            Object[] data=new Object[rowNum];
            // to hold the address of each row since values are in 2 rows 1st and 2nd index only removeing first row 0 indx

            //hashmap is undorderd and unsorted printed
            // treemap is unordered but sorted printed by key
            //linked hashmap is orderd but not sortd by key while printed
            Map<String,String> map;

            // we start from 1st index ie 2nd row bz we need the values form the 2nd row only to last index ie 2nd index ie 3rd row
           //i is index
            for(int i=1;i<=rowNum;i++){
                map=new LinkedHashMap<>();
                for(int j=0;j<colNum;j++){

                    // here we are setting the key as fixed three ie loginid ,usename and hte password
                   String key= sheet.getRow(0).getCell(j).getStringCellValue();
                  //  System.out.println("key :"+key);

                   String value=sheet.getRow(i).getCell(j).getStringCellValue();
                 //   System.out.println("value :"+value);
                   map.put(key,value);
                  //  System.out.println(map);

                }
                System.out.println(map);
                data[i-1]=map;

            }


            return data;


        } catch (IOException e) {
           // throw new RuntimeException(e);
          throw new FrameworkException("some io exception happen while reading the file ");
            // to give hte customized messag we make the custom excpetion
        }




    }


    //static bz it is unique per  class


    public static List<Map<String,String>>getTestDetails() throws IOException {


        //File file = new File(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());
        File file = new File(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }


        //public static void main (String args[]){

        List<Map<String,String>> list=null;

        //FileInputStream fs=null;


        // fs=new FileInputStream(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());
       // fs=new FileInputStream(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());

        try(FileInputStream fs=new FileInputStream(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath())){



            // System.out.println(fs.);
            XSSFWorkbook workbook=new XSSFWorkbook(fs);
            String sheetname="Appilotools Test Control Data";
            XSSFSheet sheet=workbook.getSheet(sheetname);

            int lastrownum= sheet.getLastRowNum();
            int lastcolnum= sheet.getRow(0).getLastCellNum();

            Map<String,String>map=null;
            list=new ArrayList<>();

            for(int i=1;i<=lastrownum;i++){
                map=new HashMap<>();
                for(int j=0;j<lastcolnum;j++){
                    String  key=sheet.getRow(0).getCell(j).getStringCellValue();
                    String value=sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key,value);

                }
                list.add(map);

            }
        }catch(FileNotFoundException e){

            //e.printStackTrace();
            throw new InvalidPathExcelException("Excel File trying to read is not found");
           // to give hte customized messag we make the custom excpetion
             }
        catch(IOException e){
           // e.printStackTrace();
            //  e.printStackTrace();
            throw new FrameworkException("some io exception happened while reading excel file ");
        }
     /*   finally{
            try{
                if(Objects.nonNull(fs)){
                    fs.close();
                }
            }catch(IOException e){e.printStackTrace();}
        }*/

        System.out.println("in get data"+Arrays.toString(list.toArray()));

        return list;

    }


    @DataProvider
    public static   Object[] getData(Method m) throws IOException {
        //public static void main(String args[]){
        String testname=m.getName();
        //  list=new ArrayList<>();
        if(list.isEmpty()){
            list= ExcelOneDataProviderUtils.getTestDetails();
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


    @DataProvider(parallel = true)
    public static   Object[] getData1(Method m) throws IOException {
        //public static void main(String args[]){
        String testname=m.getName();
        //  list=new ArrayList<>();
        if(list.isEmpty()){
            list= ExcelOneDataProviderUtils.getTestDetails();
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














    // public static List<Map<String,String>>getTestDetails() throws IOException {

    public static void main (String args[]){
        //File file = new File(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());
        File file = new File(DriverAndFilesPathConstants.getExcelIterationDataSheet());

        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }



        List<Map<String,String>> list=null;

       // FileInputStream fs=null;

        try(FileInputStream fs=new FileInputStream(DriverAndFilesPathConstants.getExcelIterationDataSheet())){


            // fs=new FileInputStream(DriverAndFilesPathConstants.getExcelAppiloToolsFilePath());
          // fs=new FileInputStream(DriverAndFilesPathConstants.getExcelIterationDataSheet());




            // System.out.println(fs.);
            XSSFWorkbook workbook=new XSSFWorkbook(fs);
            String sheetname="Appilotools Test Control Data";
            XSSFSheet sheet=workbook.getSheet(sheetname);

            int lastrownum= sheet.getLastRowNum();
            int lastcolnum= sheet.getRow(0).getLastCellNum();

            Map<String,String>map=null;
            list=new ArrayList<>();

            for(int i=1;i<=lastrownum;i++){
                map=new HashMap<>();
                for(int j=0;j<lastcolnum;j++){
                    String  key=sheet.getRow(0).getCell(j).getStringCellValue();
                    String value=sheet.getRow(i).getCell(j).getStringCellValue();
                    map.put(key,value);

                }
                list.add(map);

            }
        }catch(FileNotFoundException e){

            //e.printStackTrace();
            throw new InvalidPathExcelException("Excel File trying to read is not found");
            // to give hte customized messag we make the custom excpetion
        }
        catch(IOException e){
          //  e.printStackTrace();
        throw new FrameworkException("some io exception happened while reading excel file ");

        }
       /* finally{
            try{
                if(Objects.nonNull(fs)){
                    fs.close();
                }
            }catch(IOException e){e.printStackTrace();}
        }*/

        System.out.println("in get data"+Arrays.toString(list.toArray()));

        //return list;

    }










}
