package org.example.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ExcelReadingFileTest {






/*

    public static void main(String[] args) throws IOException {
        //  public String ExcelData() throws IOException {
        FileInputStream inputStream = new FileInputStream("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\TataData.xlsx");// ie here the file name is given to the from you which you will read now , fileinputstream which contains the basic functionality to read the file

        ExcelReadingFileTest excelReadingFileTest = new ExcelReadingFileTest();


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
                        System.out.println(cell.getStringCellValue());
                        // return  String.valueOf(cell.getStringCellValue());
                        break;


                    case NUMERIC:

                        System.out.println(cell.getNumericCellValue());
                        //return  String.valueOf(cell.getNumericCellValue());
                        break;


                    case BOOLEAN:

                        System.out.println(cell.getBooleanCellValue());
                        // return String.valueOf(cell.getBooleanCellValue());
                        break;
                }

                //  return null;
            }


            //  return null;

        }
    }


*/



/*    public static void main(String[] args) throws IOException {
       FileInputStream fi=new FileInputStream("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\TataData.xlsx");
        XSSFWorkbook   workbook=new XSSFWorkbook(fi);
        int index = workbook.getSheetIndex("Login Data");
        if(index==-1)
            System.out.println(0);
        else{
            XSSFSheet sheet= workbook.getSheetAt(index);
            int number=sheet.getLastRowNum()+1;
            System.out.println( number);
    }
    }*/




/*    public static void main(String[] args) throws IOException {
       //row start from 0 ot 2 (if three rows are there)
        FileInputStream fi=new FileInputStream("J:\\3. automation testing\\day41--selenium -UI elements\\AssignmentAnswers\\Appolo-Tools\\TataData.xlsx");
        XSSFWorkbook   workbook=new XSSFWorkbook(fi);
        XSSFSheet sheet=workbook.getSheet("Login Data");
        Row row=sheet.getRow(2);
        int cellcount=row.getLastCellNum();
        workbook.close();
        fi.close();
        System.out.println(cellcount);
    }*/

    public static void main(String[] args) throws IOException {
       // String[][] data = getDataFromSheet("J:/3. automation testing/day41--selenium -UI elements/AssignmentAnswers/Appolo-Tools/TataData.xlsx", "Login Data");
        XSSFWorkbook workbook = new XSSFWorkbook("J:/3. automation testing/day41--selenium -UI elements/AssignmentAnswers/Appolo-Tools/TataData.xlsx");//it created the workbook for you
        XSSFSheet workSheet = workbook.getSheet("Login Data");// it makes the sheet for you

        int noOfRows = workSheet.getLastRowNum() + 1;
        int noOfColumns = workSheet.getRow(0).getLastCellNum();
        String[][] dataTable = new String[noOfRows][noOfColumns];

        for (int i = workSheet.getFirstRowNum(); i < workSheet.getLastRowNum() + 1; i++) {
            Row row = workSheet.getRow(i);
            for (int j = row.getFirstCellNum(); j < row.getLastCellNum(); j++) {
                Cell cell = row.getCell(j);
                dataTable[i][j] = cell.getStringCellValue();
            }
        }

//in the sheet it will use the for loop and it will return the data in the tabular form
       // workbook.close();


        for (String[] row : dataTable) {
            for (String cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println(); // Move to the next line after printing each row
        }


    }
}

