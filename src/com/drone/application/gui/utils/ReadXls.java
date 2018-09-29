package com.drone.application.gui.utils;

/**------------------------------------------------------------------------------------------------------------------------------------------------------------
* The ReadXls class is a utility class to
* read data from a XLS file and send for datasource creation.
* Used JXL to extract data. (Dependency: JXL jar)
* 
* @author  Akash Sevana
* @version 1.0
* @since   2018-09-29
* ------------------------------------------------------------------------------------------------------------------------------------------------------------
*/

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadXls {

	private String inputFile;
    String[][] data = null;
    
    public ReadXls(String file) {
        this.inputFile=file;
    }
    
    public String[][] start() throws IOException {
        ReadXls test = new ReadXls(this.inputFile);
        
        String[][] data = test.read();
        return data;
    }
    
    public String[][] read() throws IOException {

        File inputWorkbook = new File(inputFile);
        Workbook w;

        try {
            w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);
            data = new String[sheet.getColumns()][sheet.getRows()];
            for (int j = 0; j < sheet.getColumns(); j++) {
                for (int i = 0; i < sheet.getRows(); i++) {
                    Cell cell = sheet.getCell(j, i);
                    data[j][i] = cell.getContents();
                }
            }
        } catch (BiffException e) {
            e.printStackTrace();
        }
        return data;
    }
}
