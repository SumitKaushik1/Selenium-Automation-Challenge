package propertesfilesread;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class PropertyFileRead {

    //private scope within class
    //static can be called by classname and  it is unique per class
    private static Properties properties;

    static{
        properties =new Properties();
    }

    //no object of this class allowed
    private PropertyFileRead(){

    }



    static {
        //static bliock is used for the early initialization
        try {
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/FrameworkConstantURLs.properties");
           // Properties properties = new Properties();
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String readPropertyFile(String key) throws Exception {
      // basically what happens that if i read the  file here ie it is he lazy initialization ie whne the method is called then it is made instsanc of it
        // whihc i donot want so we do early initialization for that we use static block
        // try(FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/FrameworkConstant.properties");
       //){
          // Properties properties = new Properties();
           //properties.load(fileInputStream);

           if(Objects.isNull(key)||Objects.isNull(properties.getProperty(key)))
               throw new Exception("property name "+key+" not found ,please check config properties");
          //directly use the class variable scope within class
           return properties.getProperty(key);
           //either you can use the fileInputStream .close or the tyr wiht resources to clasoe hte resouerce
       //}




    }

}