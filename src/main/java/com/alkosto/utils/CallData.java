package com.alkosto.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class CallData {

    private  static ArrayList<Map<String, String>> data= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= ExcelCode.leerDatosDeHojaDeExcel("src/main/resources/Data/Excel.xlsx","productos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
