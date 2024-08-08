package propertesfilesread;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LoginCredentialsPropertyFileRead {

    //scope  within class,unique per  class ,constant
    //for file load
    private static final Properties PROPERTIES;

    //scope within class,unique per class,constant

    //to read file and store data in it
    private static final Map<String,String> CONFIGMAP;
    static  {
        PROPERTIES=new Properties();
        CONFIGMAP= new HashMap<>();
    }


    //no object of this  class allowed outside this class
    //scope  within class
    private LoginCredentialsPropertyFileRead(){

    }


    static{

        FileInputStream fileInputStream=new FileInputStream()

    }




}
