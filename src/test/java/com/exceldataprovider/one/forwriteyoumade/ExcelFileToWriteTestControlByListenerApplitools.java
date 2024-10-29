package com.exceldataprovider.one.forwriteyoumade;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExcelFileToWriteTestControlByListenerApplitools {

    public static void main(String args[]) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Appilotools Test Control Data");

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"TestCaseName", "Execute", "InvocationCount", "Priority"});
        data.put("2", new Object[]{"loginWithCredentials", "Yes", "1", "0"});
        data.put("3", new Object[]{"totalMoneySpentCalculation", "Yes", "1", "1"});
        data.put("4", new Object[]{"justToTestListenerMethod1", "Yes", "5", "2"});
        data.put("5", new Object[]{"justToTestListenerMethod2", "Yes", "2", "3"});

        Set<String> keySet = data.keySet();

        // Adjust column widths for all columns (making them wider)
        for (int i = 0; i < 4; i++) {
            sheet.setColumnWidth(i, 10000);  // You can adjust the value (5000) to make it more/less wide

        }

        // Create a light orange color using RGB
       // XSSFColor lightOrange = new XSSFColor(new Color(255, 200, 100), null);

        // Style for the first row (light orange background, white bold font, black border, bigger font size)
        XSSFFont headerFont = workbook.createFont();
        headerFont.setColor(IndexedColors.WHITE.getIndex());
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);  // Set larger font size (14 points)

        XSSFCellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);
     //   headerStyle.setFillForegroundColor(lightOrange);
        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_ORANGE.getIndex());

        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        headerStyle.setBorderTop(BorderStyle.THICK);
        headerStyle.setTopBorderColor(IndexedColors.BLACK.getIndex());
        headerStyle.setBorderBottom(BorderStyle.THICK);
        headerStyle.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        headerStyle.setBorderLeft(BorderStyle.THICK);
        headerStyle.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        headerStyle.setBorderRight(BorderStyle.THICK);
        headerStyle.setRightBorderColor(IndexedColors.BLACK.getIndex());

        // Style for the other rows
        XSSFCellStyle dataStyle = workbook.createCellStyle();

        int rowNum = 0;
        for (String key : keySet) {
            Row row = sheet.createRow(rowNum++);
            Object[] objectArray = data.get(key);
            int cellNum = 0;

            for (Object obj : objectArray) {
                Cell cell = row.createCell(cellNum++);

                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else {
                    cell.setCellValue((Integer) obj);
                }

                // Apply the header style to the first row
                if (rowNum == 1) {
                    cell.setCellStyle(headerStyle);
                } else {
                    cell.setCellStyle(dataStyle);
                }
            }


            // Increase the height for all rows except the first
            if (rowNum > 1) {
                row.setHeightInPoints(50);  // Set the height in points for all rows except the first
            }

        }

        try {
            String excelFilePath = System.getProperty("user.dir") + "/resources/excelfiles/AppilloTestControlOne.xlsx";
            FileOutputStream outputStream = new FileOutputStream(new File(excelFilePath));
            workbook.write(outputStream);
            outputStream.close();
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("I am not able to write into the file");
        }
    }
}

