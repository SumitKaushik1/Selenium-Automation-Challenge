package org.example.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;


import static org.apache.poi.ss.usermodel.CellType.NUMERIC;
import static org.apache.poi.ss.usermodel.CellType.STRING;

public class ExcelReadingFile {


    //public static void main(String[] args) throws IOException {
        public String ExcelData() throws IOException {
        FileInputStream inputStream = new FileInputStream("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\TataData.xlsx");// ie here the file name is given to the from you which you will read now , fileinputstream which contains the basic functionality to read the file

        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
// workbook instance take the fileinputstream instance the data it has from the file , workbook ie the whole excel sheet


        XSSFSheet sheet = workbook.getSheetAt(0);//what happens in the excel file there are tabs ie the sheet1 ,sheet2,sheet3 and so on
//i have provided the index ie i want the first one

        Iterator<Row> rowIterator = sheet.iterator();
//i have attached the row iterator

        while (rowIterator.hasNext()) {
// now check row exist or not

            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

//now each row has the cell so i take the cell instance to store the cell information
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
//now we know in each cell there may be the integer or the string or anything now i can take the StringCellValue() thne done there must be the Integer and the String  if i take the string then if the integer comes it will error

//so we check
                switch (cell.getCellType()) {
                    case STRING:
                       // System.out.println(cell.getStringCellValue());
                      return  String.valueOf(cell.getStringCellValue());
                       // break;


                    case NUMERIC:

                        //System.out.println(cell.getNumericCellValue());
                      return  String.valueOf(cell.getNumericCellValue());
                        //break;


                    case BOOLEAN:

                        //System.out.println(cell.getBooleanCellValue());
                       return String.valueOf(cell.getBooleanCellValue());
                               // break;
                }

               return null;
            }


//java 19 there si the arrow we have added in the switch case
               /* switch(cell.getCellType){
                    case STRING->{
                        System.out.println(cell.getStringCellValue());
                        break;
                    }

                    case NUMERIC ->{

                        System.out.println(cell.getNumbericCellValue());
                        break;

                    }
                    case BOOLEAN->{

                        System.out.println(cell.getBooleanCellValue());
                    }


                }*/

        }

        return null;

    }
}

