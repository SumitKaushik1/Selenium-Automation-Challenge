package path;

import enumconstants.MethodPropertiesConstant;
import propertesfilesread.MethodPropertiesPropertyFileRead;





//seperate class is made bz it will be used
public final  class DriverAndFilesPathConstants {




    private DriverAndFilesPathConstants(){
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


    private static final String  METHOD_ACTION_EXTEND_REPORTS_PROPERTY_FILE_PATH;

    private static final String EXTENTREPORTPATH;

    private static String extentReportFilePath;

    private static String extentReportFilePath1;

    private static String extentReportFilePath2;

    private static String extentReportFilePath3;
    private static String extentReportFilePath4;

    private static final String  EXCEL_FILE_PATH;

    private static final String  EXCEL_PATH_APPILO_TOOLS_ONE;

    private static final String  EXCEL_PATH_VWO_LOGIN_ONE;

    private static final String  EXCEL_PATH_APPILO_TOOLS_TWO;

    private static final String  EXCEL_PATH_DEMOQA_TWO;
   private static final String  EXCEL_PATH_DEMOQA_METHOD_INTERCEPTOR_TWO;

   private static final String  EXCEL_PATH_VWO_LOGIN_TWO;


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

        METHOD_ACTION_EXTEND_REPORTS_PROPERTY_FILE_PATH= RESOURCE_PATH_PROPERTIES_FILES+"methodActionExtendReport.properties";

        EXTENTREPORTPATH= USER_DIRECTORY+"\\resources\\extended-reports\\";

        extentReportFilePath="";

        extentReportFilePath1="";

        extentReportFilePath2="";

        extentReportFilePath3="";


        extentReportFilePath4="";

        EXCEL_FILE_PATH=USER_DIRECTORY+"\\resources\\excelfiles\\";

        EXCEL_PATH_APPILO_TOOLS_ONE= EXCEL_FILE_PATH +"AppilloTestMethodInterceptor.xlsx";

        EXCEL_PATH_VWO_LOGIN_ONE= EXCEL_FILE_PATH +"vwousernameandpasswordcontrol.xlsx";

        EXCEL_PATH_APPILO_TOOLS_TWO= EXCEL_FILE_PATH +"AppilloTestMethodInterceptor.xlsx";

        EXCEL_PATH_DEMOQA_TWO=EXCEL_FILE_PATH+"DemoQATestControlAndBrowserFour.xlsx";

        EXCEL_PATH_DEMOQA_METHOD_INTERCEPTOR_TWO=EXCEL_FILE_PATH+"DemoQaTestControl2Four.xlsx";

        EXCEL_PATH_VWO_LOGIN_TWO=EXCEL_FILE_PATH+"vwousernameandpasswordcontrolencoded.xlsx";

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


    public static String methodActionPropertiesExtendedReport(){

        return METHOD_ACTION_EXTEND_REPORTS_PROPERTY_FILE_PATH;
    }


    public static String createReportPath() throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.OVERRIDEREPORTS).equalsIgnoreCase("no"))
            return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"DynamicAppiloOne.html";
        else
            return EXTENTREPORTPATH+"AppiloOne.html";
    }

    public static String getExtentReportPathApilloToolsOne() throws Exception{
         if(extentReportFilePath.isEmpty())
             extentReportFilePath=createReportPath();
         return extentReportFilePath;
    }


    public static String createReportPath1() throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.OVERRIDEREPORTS).equalsIgnoreCase("no"))
            return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"DynamicDemoQaTwo.html";
        else
            return EXTENTREPORTPATH+"DemoqaTwo.html";
    }

    public static String getExtentReportPathDemoQaTwo() throws Exception{
        if(extentReportFilePath1.isEmpty())
            extentReportFilePath1=createReportPath1();
        return extentReportFilePath1;
    }

    public static String createReportPath2() throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.OVERRIDEREPORTS).equalsIgnoreCase("no"))
            return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"DynamicDemoQaThree.html";
        else
            return EXTENTREPORTPATH+"DemoqaThree.html";
    }

    public static String getExtentReportPathDemoQaThree() throws Exception{
        if(extentReportFilePath2.isEmpty())
            extentReportFilePath2=createReportPath2();
        return extentReportFilePath2;
    }


    public static String createReportPath3() throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.OVERRIDEREPORTS).equalsIgnoreCase("no"))
            return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"Dynamicvwologinfour.html";
        else
            return EXTENTREPORTPATH+"vwologinfour.html";
    }

    public static String getExtentReporVWOLoginFour() throws Exception{
        if(extentReportFilePath3.isEmpty())
            extentReportFilePath3=createReportPath3();
        return extentReportFilePath3;
    }


    public static String createReportPath4() throws Exception{
        if(MethodPropertiesPropertyFileRead.readPropertyFile(MethodPropertiesConstant.OVERRIDEREPORTS).equalsIgnoreCase("no"))
            return EXTENTREPORTPATH+"/"+System.currentTimeMillis()+"Dynamicvwoheapmapfive.html";
        else
            return EXTENTREPORTPATH+"vwoheatmapfive.html";
    }

    public static String getExtentReportPathVWOHeatMapFive() throws Exception{
        if(extentReportFilePath4.isEmpty())
            extentReportFilePath4=createReportPath4();
        return extentReportFilePath4;
    }




    public static String getExcelAppiloToolsFilePath(){

        return EXCEL_PATH_APPILO_TOOLS_ONE;
    }

    public static String getExcelVWOLoginControlFilePath(){

        return    EXCEL_PATH_VWO_LOGIN_ONE;
    }

    public static String getExcelIterationDataSheet(){

        return EXCEL_PATH_APPILO_TOOLS_TWO;
    }


    public static String getExcelIterationDataSheetTwo(){

        return   EXCEL_PATH_DEMOQA_TWO;
    }


    public static String getExcelIterationDataSheetControlTwo(){

        return EXCEL_PATH_DEMOQA_METHOD_INTERCEPTOR_TWO;
    }


    public static String getExcelVWOLoginControlFilePathEncoded(){

        return    EXCEL_PATH_VWO_LOGIN_TWO;
    }




    //public static void main (String args[]) throws IOException {

    //    System.out.println( LOGIN_CREDENTIALS_APPILO_JSON_FILE_PATH);
  //     HashMap<String,String> CONFIGMAP = new ObjectMapper().readValue(new File(DriverAndFilesPathConstants.appiloJsonFilePath()), new TypeReference<HashMap<String, String>>() {});
       // System.out.println(CONFIGMAP.values());
   // }
//
 }
