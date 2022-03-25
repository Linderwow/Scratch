package com.cydeo.tests;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class writeExcel {
    String path = "SampleData.xlsx";
    XSSFSheet sheet;
    XSSFWorkbook workbook;
    @Test public void excel_write()throws IOException{
        FileInputStream fileInputStream=new FileInputStream(path);
        workbook=new XSSFWorkbook(fileInputStream );
        sheet=workbook.getSheet("Employees");

        XSSFCell salaryCell =sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");

        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(100000);
        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(120000);
        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(310000);
        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(250000);

        for (int rowNum = 0; rowNum>sheet.getLastRowNum();rowNum++){
            if (sheet.getRow(rowNum).getCell(0).toString().equals("Mary")){
                sheet.getRow(rowNum).getCell(1).setCellValue("Jones");
            }
        }

        //open to write to the file: FileInputStream --> reading
        //save changes             : FileOutputStream-->writing
        FileOutputStream outPutStream=new FileOutputStream(path);

        //save/write changes to the workbook
        workbook.write(outPutStream);

        //close all

        workbook.close();
        fileInputStream.close();
        outPutStream.close();
        try {
            File file = new File("C:\\Users\\BitFenix\\IdeaProjects\\Sashkin\\Scratch\\SampleData.xlsx");// file path
            Desktop desktop = Desktop.getDesktop();//desktop function manipulates files by performing different actions
            if (file.exists()) {//if file exists
                desktop.open(file);//opens desired file
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
