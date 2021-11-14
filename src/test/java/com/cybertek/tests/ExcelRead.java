package com.cybertek.tests;

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
    }
}
