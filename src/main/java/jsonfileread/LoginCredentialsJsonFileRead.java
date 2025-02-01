package jsonfileread;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import customExceptions.KeyUrlNotFoundException;
import enumconstants.URLPropertiesConstants;
import enumconstants.LoginCredentialsPropertiesConstants;
import path.DriverAndFilesPathConstants;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginCredentialsJsonFileRead {


    //private static final  Logger LOGGER;
    //scope  within class,unique per  class ,constant
    //for file load



   // private static final Properties PROPERTIES;

    //scope within class,unique per class,constant

    //to read file and store data in it
    private static final Map<String,String> CONFIGMAP;

    static  {
     //   PROPERTIES=new Properties();
        try {

            //jspm file is taken it is converted into hashmap
          //  CONFIGMAP= new ObjectMapper().readValue(new File(DriverAndFilesPathConstants.appiloJsonFilePath()),HashMap.class);
            CONFIGMAP = new ObjectMapper().readValue(new File(DriverAndFilesPathConstants.appiloJsonFilePath()), new TypeReference<HashMap<String, String>>() {});

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // LOGGER= Logger.getLogger(LoginCredentialsJsonFileRead.class.getName());
    }


    //no object of this  class allowed outside this class
    //scope  within class
    private LoginCredentialsJsonFileRead(){

    }


   // public static void main(String args[]){

     //  System.out.println(CONFIGMAP.values());
    //}

    //static{
        //try {

            //now the  .property file  is the text file  so fileinputStream(specilaly for bianry file but can be used for text file also)
            // is not needed you can use FileReader  for text file
            // note-> text file(characters) data is standard either utf8 or ascii so any tool know this so
            //binary data text file of these characters can be opened by any tool like extension .txt,.properties
            //so fileReader is  enough for that
            //but binary file does not follow any standard it is specific its binary data is pure raw bytes
            //it can be opened by specific tool and all it is random bytes not specific it is used for the
            //extension like .audio,.png and all ,fileinputstream is used to read these types of files

            // text file and binary file store data in bytes only but for text file standard used but binary file
            // no standard
        //FileInputStream fileInputStream=new FileInputStream(DriverAndFilesPathConstants.loginCredentialsJsonFilePath());

           // PROPERTIES.load(fileReader);
        //} catch (IOException e) {
          //  throw new FileNotFoundRuntimeExcption(e);
        //}

       // PROPERTIES.forEach((key,value)-> System.out.println("key "+key+"value "+value))
        //here the inheritely convert hte key,value which are in integer nature in the string when we do
        // concatination
        //PROPERTIES.forEach((key,value)-> LOGGER.info("key "+ key +"value "+ value));


        //properteis  class has  foreachloop which  takes functional interface as the argument
        //that functional interface has one method unimplemented ,by supplying the method implementation directly
        // inside implemented class will be formed which implement the functional interfaace nwo that functional interface
        //implemented class method down below
       // PROPERTIES.forEach((key,value)->CONFIGMAP.put(String.valueOf(key),String.valueOf(value)));

  //  }



    public static String readJsonFile(URLPropertiesConstants key) throws KeyUrlNotFoundException {


        // passed key to this  method is null or there is on  key in the existing map

        // sicne hashmap has string as the value and the key is only enum constant so
        // conver the enum to string then you can take value
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
            throw new KeyUrlNotFoundException(("property name "+key.name().toLowerCase()+" not found ,please check config properties"));

        return CONFIGMAP.get(key.asLowerCase());

    }

    public static String readJsonFile(LoginCredentialsPropertiesConstants key) throws KeyUrlNotFoundException {


        // passed key to this  method is null or there is on  key in the existing map

        // sicne hashmap has string as the value and the key is only enum constant so
        // conver the enum to string then you can take value
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
            throw new KeyUrlNotFoundException(("property name "+key.name().toLowerCase()+" not found ,please check config properties"));

        return CONFIGMAP.get(key.asLowerCase());

    }




}