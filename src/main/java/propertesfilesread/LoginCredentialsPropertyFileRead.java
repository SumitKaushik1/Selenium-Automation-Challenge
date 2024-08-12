package propertesfilesread;

import customExceptions.FileNotFoundRuntimeExcption;
import customExceptions.KeyUrlNotFoundException;
import path.DriverFilesPath;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Logger;

public class LoginCredentialsPropertyFileRead {


    private static final  Logger LOGGER;
    //scope  within class,unique per  class ,constant
    //for file load



    private static final Properties PROPERTIES;

    //scope within class,unique per class,constant

    //to read file and store data in it
    private static final Map<String,String> CONFIGMAP;

    static  {
        PROPERTIES=new Properties();
        CONFIGMAP= new HashMap<>();
        LOGGER= Logger.getLogger(LoginCredentialsPropertyFileRead.class.getName());
    }


    //no object of this  class allowed outside this class
    //scope  within class
    private LoginCredentialsPropertyFileRead(){

    }


    static{
        try {

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
        FileReader  fileReader=new FileReader(DriverFilesPath.loginCredentialsFilePath());

            PROPERTIES.load(fileReader);
        } catch (IOException e) {
            throw new FileNotFoundRuntimeExcption(e);
        }


        PROPERTIES.forEach((key,value)-> LOGGER.info("key "+ key +"value "+ value));


        //properteis  class has  foreachloop which  takes functional interface as the argument
        //that functional interface has one method unimplemented ,by supplying the method implementation directly
        // inside implemented class will be formed which implement the functional interfaace nwo that functional interface
        //implemented class method down below
        PROPERTIES.forEach((key,value)->CONFIGMAP.put(String.valueOf(key),String.valueOf(value)));

    }



    public static String readPropertyFile(String key) throws KeyUrlNotFoundException {


        // passed key to this  method is null or there is on  key in the existing map
        if(Objects.isNull(key) || Objects.isNull(CONFIGMAP.get(key)))
            throw new KeyUrlNotFoundException(("property name "+key+" not found ,please check config properties"));

        return CONFIGMAP.get(key);

    }



}
