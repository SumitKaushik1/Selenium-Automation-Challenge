package path;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

//seperate class is made bz it will be used
public final  class DriverAndFilesPath {


    private DriverAndFilesPath(){
        //it  make this private i donnt wnat the object of this class anywhere
    }


    private static final  String USER_DIRECTORY;

    //to avoid unneccory repetation of path
    private static final  String RESOURCE_PATH_DRIVERS;

    private static final  String RESOURCE_PATH_PROPERTIES_FILES;

    private static final  String RESOURCE_PATH_JSON_FILES;


   /* *static keyword is used where ever we donot need dublicacy like we donot want the dublicay of instscne variabels,or method it is shared among all like driver class
*non static keyword is used where we need dublicay of instance variable anad method like pojos classes for payload*/
    private static  final String CHROME_PATH;
    private static final  String EDGE_PATH;
    //final noonce can change the path

    private static final String FIREFOX_PATH;



    //within scope,unieque to class,constant
    private static final String LOGIN_CREDENTIALS_PROPERTY_FILE_PATH;

    private static final String  URLS_PROPERTY_FILE_PATH;


    private static final String LOGIN_CREDENTIALS_APPILO_JSON_FILE_PATH;


    static{

        USER_DIRECTORY=System.getProperty("user.dir");


        //it is done to avoid unneccory repetation of path
        RESOURCE_PATH_DRIVERS= USER_DIRECTORY+"\\resources\\drivers\\";
        //it is good practice to intialize the static variable in static initializer block
        //bydefault the user.dir point to the current directory

        RESOURCE_PATH_PROPERTIES_FILES= USER_DIRECTORY+"\\resources\\propertyfiles\\";


        RESOURCE_PATH_JSON_FILES= USER_DIRECTORY+"\\resources\\jsonfiles\\";

        CHROME_PATH=RESOURCE_PATH_DRIVERS+"chromedriver.exe";

        EDGE_PATH=RESOURCE_PATH_DRIVERS+"msedgedriver.exe";

        FIREFOX_PATH=RESOURCE_PATH_DRIVERS+"geckodriver.exe";

        LOGIN_CREDENTIALS_PROPERTY_FILE_PATH= RESOURCE_PATH_PROPERTIES_FILES+"LoginCredentitals.properties";

        URLS_PROPERTY_FILE_PATH=RESOURCE_PATH_PROPERTIES_FILES+"URLs.properties";

        LOGIN_CREDENTIALS_APPILO_JSON_FILE_PATH= RESOURCE_PATH_JSON_FILES+"Appilo.json";
    }


    //getter are used bz getter is mostly used for instancce variable not for  static variable
    public static String chromePath(){
        return CHROME_PATH;
    }

    public static String edgePath(){
        return EDGE_PATH;
    }


    public static String fireFoxPath(){ return FIREFOX_PATH;}



    public static String loginCredentialsPropertyFilePath(){ return LOGIN_CREDENTIALS_PROPERTY_FILE_PATH;}

    public static String frameworkConstantsPropertyFilePath(){return  URLS_PROPERTY_FILE_PATH;}

    public static String appiloJsonFilePath(){return   LOGIN_CREDENTIALS_APPILO_JSON_FILE_PATH;}



    //public static void main (String args[]) throws IOException {

    //    System.out.println( LOGIN_CREDENTIALS_APPILO_JSON_FILE_PATH);
  //     HashMap<String,String> CONFIGMAP = new ObjectMapper().readValue(new File(DriverAndFilesPath.appiloJsonFilePath()), new TypeReference<HashMap<String, String>>() {});
       // System.out.println(CONFIGMAP.values());
   // }
//
 }
