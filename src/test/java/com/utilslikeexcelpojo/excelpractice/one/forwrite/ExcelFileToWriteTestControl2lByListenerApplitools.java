package com.utilslikeexcelpojo.excelpractice.one.forwrite;

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

public class ExcelFileToWriteTestControl2lByListenerApplitools {

    public static void main(String args[]) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Appilotools Test Control Data");

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"TestName", "TestDescription", "Execute", "Priority", "count"});
        data.put("2", new Object[]{"loginWithCredentialsChrome", "to login chrome ", "Yes", "0", "1"});
        data.put("3", new Object[]{"totalMoneySpentCalculationChrome", "to calculate money chrome", "Yes", "1", "1"});
        data.put("4", new Object[]{"justToTestListenerMethod1Chrome", "to test listener count control on method chrome", "Yes", "2", "5"});
        data.put("5", new Object[]{"justToTestListenerMethod2Chrome", "to test listener count control on method chrome", "No", "3", "1"});
        data.put("5", new Object[]{"justToTestRetryListenerOnFailMethod3Chrome", "to test listener count control on method chrome", "No", "3", "1"});


        data.put("6", new Object[]{"TestName", "TestDescription", "Execute", "Priority", "count"});
        data.put("7", new Object[]{"loginWithCredentialsEdge", "to login edge ", "Yes", "0", "1"});
        data.put("8", new Object[]{"totalMoneySpentCalculationEdge", "to calculate money edge", "Yes", "1", "1"});
        data.put("9", new Object[]{"justToTestListenerMethod1Edge", "to test listener count control on method edge", "Yes", "2", "5"});
        data.put("10", new Object[]{"justToTestListenerMethod2Edge", "to test listener count control on method edge", "No", "3", "1"});
        data.put("11", new Object[]{"justToTestRetryListenerOnFailMethod3Edge", "to test listener count control on method edge", "No", "3", "1"});

        Set<String> keySet = data.keySet();

        // Adjust column widths for all columns
        for (int i = 0; i < 4; i++) {
            sheet.setColumnWidth(i, 10000);
        }

        // Create styles for header and data cells
        XSSFFont headerFont = workbook.createFont();
        headerFont.setColor(IndexedColors.WHITE.getIndex());
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);

        XSSFCellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);
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

        // Style for "Yes" and "No" cells
        XSSFCellStyle yesStyle = workbook.createCellStyle();
        yesStyle.setFillForegroundColor(IndexedColors.BRIGHT_GREEN.getIndex());
        yesStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        XSSFCellStyle noStyle = workbook.createCellStyle();
        noStyle.setFillForegroundColor(IndexedColors.RED.getIndex());
        noStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        // Create data rows
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
                    // Apply specific styles based on the value in the "Execute" column
                    if (cellNum == 3) { // "Execute" column index
                        String executeValue = (String) obj;
                        if ("Yes".equalsIgnoreCase(executeValue)) {
                            cell.setCellStyle(yesStyle);
                        } else if ("No".equalsIgnoreCase(executeValue)) {
                            cell.setCellStyle(noStyle);
                        } else if("Execute".equalsIgnoreCase( (String) obj))
                            cell.setCellStyle(headerStyle);

                    }
                    else if(cellNum==1 && "TestName".equalsIgnoreCase( (String) obj))
                        cell.setCellStyle(headerStyle);
                    else if(cellNum==2 && "TestDescription".equalsIgnoreCase( (String) obj))
                        cell.setCellStyle(headerStyle);
                    else if(cellNum==4 && "Priority".equalsIgnoreCase( (String) obj))
                        cell.setCellStyle(headerStyle);
                    else if(cellNum==5 && "count".equalsIgnoreCase( (String) obj))
                        cell.setCellStyle(headerStyle);
                }
            }

            // Increase the height for all rows except the first
            if (rowNum > 1) {
                row.setHeightInPoints(50);  // Set the height in points for all rows except the first
            }
        }

        try {
            String excelFilePath = System.getProperty("user.dir") + "/resources/excelfiles/AppilloTestControl2One.xlsx";
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
