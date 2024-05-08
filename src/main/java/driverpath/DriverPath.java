package driverpath;

//seperate class is made bz it will be used
public final  class DriverPath {

    private DriverPath(){
        //it  make this private i donnt wnat the object of this class anywhere
    }

   /* *static keyword is used where ever we donot need dublicacy like we donot want the dublicay of instscne variabels,or method it is shared among all like driver class
*non static keyword is used where we need dublicay of instance variable anad method like pojos classes for payload*/
    private static  final String CHROME_PATH;
    private static final  String EDGE_PATH;
    //final noonce can change the path

    //to avoid unneccory repetation of path
    private static final  String RESOURCE_PATH;

    static{

        //it is done to avoid unneccory repetation of path
        RESOURCE_PATH=System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\";
        //it is good practice to intialize the static variable in static initializer block
        //bydefault the user.dir point to the current directory

        CHROME_PATH=RESOURCE_PATH+"chromedriver.exe";

        EDGE_PATH= RESOURCE_PATH+"msedgedriver.exe";
    }

    public static String chromePath(){
        return CHROME_PATH;
    }

    public static String edgePath(){
        return EDGE_PATH;
    }
}
