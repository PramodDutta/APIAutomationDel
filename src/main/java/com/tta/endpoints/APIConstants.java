package com.tta.endpoints;


import com.tta.utils.FillowUtils;
import com.tta.utils.PropertyReader;
import com.tta.utils.YamlReader;

import java.io.FileNotFoundException;

public class APIConstants {

    //public static String BASE_URL  = FillowUtils.fetchDataFromXlsx("Sheet1","baseurl","value");
//    public static String BASE_URL;
//
//    static {
//        try {
//            BASE_URL = PropertyReader.readyKey("url","config_prod.properties");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }

    public static  String BASE_URL;

    static {
        try {
            BASE_URL = YamlReader.readyKey("url","data.yaml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //    public static String BASE_URL  = "https://restful-booker.herokuapp.com";
    public static String CREATE_BOOKING  = "/booking";
    public static String UPDATE_BOOKING  = "/booking";



}
