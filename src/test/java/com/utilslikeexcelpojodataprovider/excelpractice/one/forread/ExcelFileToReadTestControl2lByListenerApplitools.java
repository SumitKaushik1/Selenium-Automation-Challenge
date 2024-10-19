package com.utilslikeexcelpojodataprovider.excelpractice.one.forread;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import path.DriverAndFilesPath;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelFileToReadTestControl2lByListenerApplitools {

    public static List<Map<String,String>>getTestDetails() throws IOException {

      //  public static void main (String args[]){
        File file = new File(DriverAndFilesPath.getExcelAppiloToolsFilePath());
        // Check if the file exists
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }



            List<Map<String,String>> list=null;

            FileInputStream fs=null;

            try{


                fs=new FileInputStream(DriverAndFilesPath.getExcelAppiloToolsFilePath());
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
            }catch(FileNotFoundException e){e.printStackTrace();}
            catch(IOException e){
                e.printStackTrace();
            }
            finally{
                try{
                    if(Objects.nonNull(fs)){
                        fs.close();
                    }
                }catch(IOException e){e.printStackTrace();}
            }

            System.out.println("in get data"+Arrays.toString(list.toArray()));

            return list;

        }






}
