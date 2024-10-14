package org.Utils.excel.excelpractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;


import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.*;

public class ExcelFileBackGroundColour{

    public static void main(String[] args) throws IOException  {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheetOne = workbook.createSheet("SheetOne");

        String[][] data = {{"Name"},{"Arun"},{"Varun"},{"Tharun"}};

        int rows = data.length;
        int cols = data[0].length;

        // Create the font and set it to white
        XSSFFont font = workbook.createFont();
        font.setColor(IndexedColors.WHITE.getIndex()); // Set font color to white
        font.setBold(true); // Set font to bold
        // Create the cell style
        XSSFCellStyle style = workbook.createCellStyle();
        style.setFillForegroundColor(IndexedColors.ORANGE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setBorderTop(BorderStyle.THICK);
        style.setTopBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderBottom(BorderStyle.THICK);
        style.setBottomBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderLeft(BorderStyle.THICK);
        style.setLeftBorderColor(IndexedColors.BLACK.getIndex());
        style.setBorderRight(BorderStyle.THICK);
        style.setRightBorderColor(IndexedColors.BLACK.getIndex());

// Apply the font to the style
        style.setFont(font);

        for(int r=0;r<rows;r++) {

            XSSFRow row = sheetOne.createRow(r);

            for(int c=0;c<cols;c++) {

                XSSFCell cell = row.createCell(c);
                String value = data[r][c];

                cell.setCellValue(value);
                cell.setCellStyle(style);

            }


        }

        File file = new File(System.getProperty("user.dir")+"\\resources\\excelfiles\\Names.xlsx");
        FileOutputStream fos = new FileOutputStream(file);
        workbook.write(fos);

        workbook.close();

        System.out.println("Task Completed");

    }

}