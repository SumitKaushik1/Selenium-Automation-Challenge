package org.Utils.excelextendedreportpropertyfile.propertyfile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileReader {

    static Properties properties;

    public PropertyFileReader(){

        loadAllProperties();
    }

    public  void loadAllProperties(){
        properties =new Properties();
        try{
            String propertyfilepath=System.getProperty("user.dir")+"/src/test/resources/config.properties";
            properties.load(new FileInputStream(propertyfilepath));


        } catch(IOException e){
            throw new RuntimeException("Could not read the properites file");
        }



    }
    public static String readItem(String propertyName){

        return properties.getProperty(propertyName);
    }


}
