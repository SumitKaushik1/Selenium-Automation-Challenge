package propertesfilesread;

import customExceptions.FileNotFoundRuntimeExcption;
import customExceptions.KeyUrlNotFoundException;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public class FrameoworksConstantPropertyFileRead {

    //private scope within class
    //static can be called by classname and  it is unique per class
    private static final Properties PROPERTIES;

    //private ->scoppe within class
    //static it is unique per class
    // final constant once initialize cannot  be changed
    //Map to get values of the .propertyfile extension file key value data
    private static final Map<String ,String> CONFIGMAP;
    static{
        PROPERTIES =new Properties();
        CONFIGMAP= new HashMap<>();


    }

    //no object of this class allowed
    private FrameoworksConstantPropertyFileRead(){

    }



    static {
        //static bliock is used for the early initialization
        try {
            //take file
            FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/FrameworkConstantURLs.properties");
           // Properties properties = new Properties()
           //load the file
            PROPERTIES.load(fileInputStream);


            // Set<Map.Entry<String,String>>p=properties.entrySet();//it will retun set(no dublicay ) of maps entry ie it is the set of each key-value pair ie mapentry
            //it can be hold by Map.Entry<String,String>
            //foreach take the functional interface as the argument  so lambda expression allowed
           // for Map.Entry<Object, Object> p:properties.entrySet()
             //   CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())
            //


            PROPERTIES.forEach((key, value) -> CONFIGMAP.put(String.valueOf(key), String.valueOf(value)));
            //her we put the each key-value or entry of .property file in the hashmap

        } catch (IOException e) {
            throw new FileNotFoundRuntimeExcption(e);
        }
    }

    public static String readPropertyFile(String key) throws KeyUrlNotFoundException {

        //throws clause means exception will be handled by its caller method
      // basically what happens that if i read the  file here ie it is he lazy initialization ie whne the method is called then it is made instsanc of it
        // whihc i donot want so we do early initialization for that we use static block
        // try FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/FrameworkConstant.properties"
       //
          // Properties properties = new Properties()
           //properties.load(fileInputStream)

           if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key)))
               throw new KeyUrlNotFoundException("property name "+key+" not found ,please check config properties");
          //directly use the class variable scope within class
           return CONFIGMAP.get(key);
           //it will return teh value regarding to that
           //either you can use the fileInputStream .close or the tyr wiht resources to clasoe hte resouerce
       //




    }

}