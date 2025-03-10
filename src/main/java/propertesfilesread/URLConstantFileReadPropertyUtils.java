package propertesfilesread;

import customExceptions.PropertyFileUsageException;
import enumconstants.URLPropertiesConstants;
import path.DriverAndFilesPathConstants;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.logging.Logger;

public class URLConstantFileReadPropertyUtils {

    //private scope within class
    //static can be called by classname and  it is unique per class
    private static final Logger LOGGER;
    //scope  within class,unique per  class ,constant
    //for file load

    private static final Properties PROPERTIES;

    //private ->scoppe within class
    //static it is unique per class
    // final constant once initialize cannot  be changed
    //Map to get values of the .propertyfile extension file key value data
    private static final Map<String ,String> CONFIGMAP;
    
    static{
        PROPERTIES =new Properties();
        CONFIGMAP= new HashMap<>();
        LOGGER= Logger.getLogger(LoginCredentialsPropertyFileRead.class.getName());


    }

    //no object of this class allowed
    private URLConstantFileReadPropertyUtils(){

    }



    static {
        //static bliock is used for the early initialization
        try(FileReader fileReader=new FileReader(DriverAndFilesPathConstants.frameworkConstantsPropertyFilePath())) {
            //take file
            //FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/URLs.properties")
           //notw the  .property file  is the text file  so fileinputStream(specilaly for bianry file but can be used for text file also)
            // is not needed you can use FileReader  for text file
            // note-> text file(characters) data is standard either utf8 or ascii so any tool know this so
            //binary data text file of these characters can be opened by any tool like extension .txt,.properties
            //so fileReader is  enough for that
            //but binary file does not follow any standard it is specific its binary data is pure raw bytes
            //it can be opened by specific tool and all it is random bytes not specific it is used for the
            //extension like .audio,.png and all ,fileinputstream is used to read these types of files

            // text file and binary file store data in bytes only but for text file standard used but binary file
            // no standard
            // Properties properties = new Properties()

            // PROPERTIES.load(fileInputStream)
           //load the file
           // FileReader fileReader=new FileReader(DriverAndFilesPathConstants.frameworkConstantsPropertyFilePath());
            PROPERTIES.load(fileReader);


            // Set<Map.Entry<String,String>>p=properties.entrySet();//it will retun set(no dublicay ) of maps entry ie it is the set of each key-value pair ie mapentry
            //it can be hold by Map.Entry<String,String>
            //foreach take the functional interface as the argument  so lambda expression allowed
           // for Map.Entry<Object, Object> p:properties.entrySet()
             //   CONFIGMAP.put(String.valueOf(entry.getKey()),String.valueOf(entry.getValue())
            //

           // PROPERTIES.forEach((key,value)-> System.out.println("key "+key+"value "+value))
            //here the inheritely convert hte key,value which are in integer nature in the string when we do
            // concatination
            PROPERTIES.forEach((key,value)-> LOGGER.info("key "+ key +"value "+ value));



            //properteis  class has  foreachloop which  takes functional interface as the argument
            //that functional interface has one method unimplemented ,by supplying the method implementation directly
            // inside implemented class will be formed which implement the functional interfaace nwo that functional interface
            //implemented class method down below
            PROPERTIES.forEach((key, value) -> CONFIGMAP.put(String.valueOf(key), String.valueOf(value).trim()));
            //her we put the each key-value or entry of .property file in the hashmap
            //trim() will remove all the leading and the trailing spaces

        } catch (IOException e) {
            //actually throw will search for the nearest catch block either in same place or
            // from where it is called ie called stack
            // if no catch block found then terminate it


            //throw new FileNotFoundRuntimeExcption(e);
              // but i want that it must terminate here only so  we  use exit(0);

             e.printStackTrace();
            System.exit(0);


        }
    }

    public static String get(URLPropertiesConstants key) /*throws KeyUrlNotFoundException*/ {

        //throws clause means exception will be handled by its caller method
      // basically what happens that if i read the  file here ie it is he lazy initialization ie whne the method is called then it is made instsanc of it
        // whihc i donot want so we do early initialization for that we use static block
        // try FileInputStream fileInputStream = new FileInputStream("src/test/resources/configproperties/FrameworkConstant.properties"
       //
          // Properties properties = new Properties()
           //properties.load(fileInputStream)

        // passed key to this  method is null or there is on  key in the existing map

        //acctually the key is hte enumconstant and the  configmap has key nature of string
        // when we pass the enumconstant as the key so in retrun the configmap will returnt the value as null
        // bz no value corresspong to enum ,so we have ot convert the key to string in lowecase letters which is
        //present in the file key come as the URLONE as enum constant conver to enum string ,in lower case
           if(Objects.isNull(key)||Objects.isNull(CONFIGMAP.get(key.name().toLowerCase())))
           //    throw new KeyUrlNotFoundException("property name "+key.name().toLowerCase()+" not found ,please check config properties");
            throw new PropertyFileUsageException("property name "+key.name().toLowerCase()+" not found ,please check config properties");
           //directly use the class variable scope within class
           return CONFIGMAP.get(key.asLowerCase());
           //it will return teh value regarding to that
           //either you can use the fileInputStream .close or the tyr wiht resources to clasoe hte resouerce
       //




    }

}