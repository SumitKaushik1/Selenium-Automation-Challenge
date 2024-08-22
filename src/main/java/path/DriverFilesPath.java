package path;

//seperate class is made bz it will be used
public final  class DriverFilesPath {


    private DriverFilesPath(){
        //it  make this private i donnt wnat the object of this class anywhere
    }

   /* *static keyword is used where ever we donot need dublicacy like we donot want the dublicay of instscne variabels,or method it is shared among all like driver class
*non static keyword is used where we need dublicay of instance variable anad method like pojos classes for payload*/
    private static  final String CHROME_PATH;
    private static final  String EDGE_PATH;
    //final noonce can change the path

    private static final String FIREFOX_PATH;

    //to avoid unneccory repetation of path
    private static final  String RESOURCE_PATH_DRIVERS;


    //within scope,unieque to class,constant
    private static final String LOGIN_CREDENTIALS_FILE_PATH;

    private static final String FRAMEWORK_CONSTANTS_FILE_PATH;

    private static final  String RESOURCE_PATH_PROPERTIES_FILES;

    static{

        //it is done to avoid unneccory repetation of path
        RESOURCE_PATH_DRIVERS=System.getProperty("user.dir")+"\\resources\\drivers\\";
        //it is good practice to intialize the static variable in static initializer block
        //bydefault the user.dir point to the current directory

        RESOURCE_PATH_PROPERTIES_FILES=System.getProperty("user.dir")+"\\resources\\configproperties\\";


        CHROME_PATH=RESOURCE_PATH_DRIVERS+"chromedriver.exe";

        EDGE_PATH=RESOURCE_PATH_DRIVERS+"msedgedriver.exe";

        FIREFOX_PATH=RESOURCE_PATH_DRIVERS+"geckodriver.exe";

        LOGIN_CREDENTIALS_FILE_PATH= RESOURCE_PATH_PROPERTIES_FILES+"LoginCredentitals.properties";

        FRAMEWORK_CONSTANTS_FILE_PATH=RESOURCE_PATH_PROPERTIES_FILES+"FrameworkConstantURLs.properties";
    }


    //getter are used bz getter is mostly used for instancce variable not for  static variable
    public static String chromePath(){
        return CHROME_PATH;
    }

    public static String edgePath(){
        return EDGE_PATH;
    }


    public static String fireFoxPath(){ return FIREFOX_PATH;}



    public static String loginCredentialsFilePath(){ return LOGIN_CREDENTIALS_FILE_PATH;}

    public static String frameworkConstantsFilePath(){return FRAMEWORK_CONSTANTS_FILE_PATH;}
}
