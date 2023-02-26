package com.tta.utils;

import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class FillowUtils {

    static String FILEPATH = System.getProperty("user.dir") + "/src/main/resources/TestData.xlsx";

    public static String fetchDataFromXlsx(String sheetName, String id, String field) {
        String value = null;
        try {
            Fillo fillo = new Fillo();
            Connection connection = fillo.getConnection(FILEPATH);
            String query = "Select * from " + sheetName + " " + "where ID='" + id + "'";
            Recordset recordset = connection.executeQuery(query);
            while (recordset.next()) {
                value = recordset.getField(field);
            }

            recordset.close();
            connection.close();

        } catch (Exception e) {
            e.getMessage();
        }

        return value;
    }



}
