package com.tta.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertyReader {

    PropertyReader(){
    }

    public static String readyKey(String key, String filePath) throws Exception {
        FileInputStream fileInputStream = null;
        Properties p = null;
        try{
             // Load the file
            // Return the Key
            String filePath2 = System.getProperty("user.dir")+"/src/main/resources/"+filePath;
            fileInputStream = new FileInputStream(new File(filePath2));
            p = new Properties();
            p.load(fileInputStream);

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if(Objects.nonNull(fileInputStream)){
                fileInputStream.close();
            }
        }

        if(p.getProperty(key) == null){
            throw new Exception(p.getProperty(key) + "Not present");
        }else{
            return p.getProperty(key);
        }

    }


}
