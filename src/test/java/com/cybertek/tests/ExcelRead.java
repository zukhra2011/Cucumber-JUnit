package com.cybertek.tests;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {
    /*
    How to read from excel file
     */
    @Test
    public void read_excel_file() throws IOException {
    String path="SampleData.xlsx";
//To be able to read from Excel File, we need to load it into FileInputStream
        FileInputStream fileInputStream=new FileInputStream(path);
        //workbook>sheet>row>cell
        //1-Create a workbook
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        //2-We need to get the specific sheet from currently opened workbook
        XSSFSheet sheet= workbook.getSheet("Employees");
        //3- Select row and cell
        //Print out Steven's Cell
        //Indexes start from 0
        System.out.println("sheet.getRow(1).getCell(0)="+ sheet.getRow(1).getCell(0));
        //Print out "Singer" from the sheet
        System.out.println(sheet.getRow(3).getCell(2));
        //Return the count of used cells only
        // If there are cells not used they will not be counted.
        //Counts from 1.
        int usedRows=sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);
        //Returns the number from the top cel to bottom ceel
        int lastUsedRow=sheet.getLastRowNum();
        //TODO:1-Create a logic to Print out Neena's name dynamically
        for(int rownum=0; rownum<usedRows; rownum++){
            System.out.println(sheet.getRow(rownum).getCell(0).equals("Neena"));
        }



    }
}
