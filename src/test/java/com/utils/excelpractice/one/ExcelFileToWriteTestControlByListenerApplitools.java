package com.utils.excelpractice.one;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelFileToWriteTestControlByListenerApplitools {


    public static void main(String args[]) {


        XSSFWorkbook workbook = new XSSFWorkbook();//workbook is created.
        XSSFSheet sheet = workbook.createSheet("Appilotools Test Control Data");//sheet is created ,sheet name is the login data
        Map<String, Object[]> data = new TreeMap<>();//i want sorted map in the form of sorted keys while printing

        data.put("1", new Object[]{"TestCaseName", "Execute", "InvocationCount", "Priorty"});
        //values can be of any datatype so i put the array of Objects


        //since appilo tools has bug it can logged in with nay value so negative test case cannot be formed so take only one
        // value in the excel file
        data.put("2", new Object[]{"loginWithCredentials", "Yes", "1", "0"});
        data.put("3", new Object[]{"totalMoneySpentCalculation", "Yes", "1", "1"});
        data.put("4", new Object[]{"justToTestListenerMethod1", "Yes", "5", "2"});
        data.put("5", new Object[]{"justToTestListenerMethod2", "Yes", "2", "3"});
        // data.put("3",new Object[]{"2","Admin","Password@123"});
        Set<String> keySet = data.keySet();
        int rowNum = 0;
        for (String key : keySet) {
            Row r = sheet.createRow(rowNum++);//one key means i am making the row in the excel file 1,2 ,3 so on
            Object[] objectArray = data.get(key);//here i am getting the value by key i know the value is the array
            int cellNum = 0;
            for (Object o : objectArray) {

                Cell cell = r.createCell(cellNum++);//for each row number of cells created according to objects come in one row suppose 3 objects so 3 cells are created in one row
                if (o instanceof String)
                    cell.setCellValue((String) o);// now the value is put in the cell ie objects are put in the cell
                else
                    cell.setCellValue((Integer) o);

            }
        }


        try {

            String Excelfilepath = System.getProperty("user.dir") + "/resources/excelfiles/AppilloTestControlOne.xlsx";
            // FileOutputStream outputStream=new FileOutputStream(new File("Appollo.xlsx"));//File class which will make the file(excel file ie the TataData is excel file is made ) and FileOutputStream is the node Stream which contains the basic functionality to write in the file ,now the write method uses the node Stream and write int the file
            FileOutputStream outputStream = new FileOutputStream(new File(Excelfilepath));
            workbook.write(outputStream);
            outputStream.close();//node stream which is opened must be closed
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I am not able to write into  the File");
        }


    }


    }
