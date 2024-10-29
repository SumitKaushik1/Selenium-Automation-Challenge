package propertesfilesread;

import customExceptions.FileNotFoundRuntimeExcption;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.MethodPropertiesConstant;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import path.DriverAndFilesPathConstants;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Logger;

public class MethodPropertiesPropertyFileRead {


    private static final  Logger LOGGER;
    //scope  within class,unique per  class ,constant
    //for file load



    private static final Properties PROPERTIES;

    //scope within class,unique per class,constant

    //to read file and store data in it
    private static final Map<String,String> CONFIGMAP;

    static  {
        PROPERTIES=new Properties();
        CONFIGMAP= new HashMap<>();
        LOGGER= Logger.getLogger(MethodPropertiesPropertyFileRead.class.getName());
    }


    //no object of this  class allowed outside this class
    //scope  within class
    private MethodPropertiesPropertyFileRead(){

    }


    static{
        try {

            //now the  .property file  is the text file  so fileinputStream(specilaly for bianry file but can be used for text file also)
            // is not needed you can use FileReader  for text file
            // note-> text file(characters) data is standard either utf8 or ascii so any tool know this so
            //binary data text file of these characters can be opened by any tool like extension .txt,.properties
            //so fileReader is  enough for that
            //but binary file does not follow any standard it is specific its binary data is pure raw bytes
            //it can be opened by specific tool and all it is random bytes not specific it is used for the
            //extension like .audio,.png and all ,fileinputstream is used to read these types of files

            // text file and binary file store data in bytes only but for text file standard used but binary file
            // no standard
        FileReader  fileReader=new FileReader(DriverAndFilesPathConstants.methodActionPropertiesExtendedReport());

            PROPERTIES.load(fileReader);
        } catch (IOException e) {
            throw new FileNotFoundRuntimeExcption(e);
        }

       // PROPERTIES.forEach((key,value)-> System.out.println("key "+key+"value "+value))
        //here the inheritely convert hte key,value which are in integer nature in the string when we do
        // concatination
        PROPERTIES.forEach((key,value)-> LOGGER.info("key "+ key +"value "+ value));


        //properteis  class has  foreachloop which  takes functional interface as the argument
        //that functional interface has one method unimplemented ,by supplying the method implementation directly
        // inside implemented class will be formed which implement the functional interfaace nwo that functional interface
        //implemented class method down below
        PROPERTIES.forEach((key,value)->CONFIGMAP.put(String.valueOf(key),String.valueOf(value)));

    }



    public static String readPropertyFile(MethodPropertiesConstant key) throws KeyUrlNotFoundException {


        // passed key to this  method is null or there is on  key in the existing map

        // sicne hashmap has string as the value and the key is only enum constant so
        // conver the enum to string then you can take value
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
            throw new KeyUrlNotFoundException(("property name "+key.name().toLowerCase()+" not found ,please check config properties"));

        return CONFIGMAP.get(key.asLowerCase());

    }


    public static class ExcelReadingFileTest {






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
}
