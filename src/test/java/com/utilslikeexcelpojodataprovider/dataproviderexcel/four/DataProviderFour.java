package com.utilslikeexcelpojodataprovider.dataproviderexcel.four;

import com.utilslikeexcelpojodataprovider.excelpractice.four.forread.ExcelFileToReadTestControlUseraAndPasslByListenerVwo;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataProviderFour {

private static List<Map<String,String>> list;



    static{

        list=new ArrayList<>();
    }




    // public static void main (String args[]){
    public static Object[][] getDataVWOFour() {

        try {
            FileInputStream fs= new FileInputStream(System.getProperty("user.dir")+"/resources/excelfiles/Vwo.xlsx");
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


        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }






    @DataProvider
    public static   Object[] getData(Method m){
        //public static void main(String args[]){
        String testname=m.getName();
        //  list=new ArrayList<>();
        if(list.isEmpty()){
            list= ExcelFileToReadTestControlUseraAndPasslByListenerVwo.getTestDetails("vwo login user and password");
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
