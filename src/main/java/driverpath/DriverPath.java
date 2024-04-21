package driverpath;

//seperate class is made bz it will be used
public final  class DriverPath {


   /* *static keyword is used where ever we donot need dublicacy like we donot want the dublicay of instscne variabels,or method it is shared among all like driver class
*non static keyword is used where we need dublicay of instance variable anad method like pojos classes for payload*/
    private final static String chromePath;
    private final static String edgePath;
    //final noonce can change the path anywhere
    static{
        //it is good practice to intialize the static variable in static initializer block
        //bydefault the user.dir point to the current directory
        chromePath=System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\chromedriver.exe";

        edgePath=System.getProperty("user.dir")+"\\src\\test\\resources\\driver\\msedgedriver.exe";
    }

    public static String chromePath(){
        return chromePath;
    }

    public static String edgePath(){
        return edgePath;
    }
}
