package threadlocal;


import org.openqa.selenium.WebDriver;





//no one extend it
public final class ThreadLocalWebDriver {

    //no object of it //only made in thsi classs only
    private ThreadLocalWebDriver(){

    }

    //genearely
    // class ->static variable -> if it is not threadlocal ->same varible for thread1 and same for thread2

    //so what happens suppose the one thread is using one driver now
   // so what happnes that ic call this calss adn call the static method of this class in static classs threadlocal




    //instsnce is created which is static ie you can call the by class name but
    //this threadlocal variable scope only limited to that particular thread only in whichever thread
    // is suing this variable
    //suppsoe another thread come and called the staic method ie called by class naame but the thraedlocal variable sepertly made for thread
    //conclusion -->threadlocal ->static ie per class it is only one ->no dublcacy->it is called by clas name
    //but there would seperate threadlcoal for each thread
    // class ->static variable per class one only ->since it is threadlocal -> one for thread1
    //                                                                      -> one for thread2



    static ThreadLocal<WebDriver> webDriverThreadLocal=new ThreadLocal<>();
    //gernally what we are doing our parallel classes is handled by the 2 threads on thread one clas and antther theread anotehr class
    //now






    //ThreadLocal class has the stsatic method which intaialVAlue that method
    // ha the argument as the Supplier interface now hte Suppleir interface is the funcitonal interface  that has only the one abstract method so the implementation
    //either you can pass the like kike
    //class supplierInterfaceImplementation implements Suppler @Override supplier interface methid
    //make the object of the  supplierInterfaceImplementation this pass to the
    //like ThreadLocal<String>threadLocal=ThreadLocal.initialValue(passt ot this suplierinterface implemetnatlal boject )
    //not hw inital value will use the impentation class method to inteiral the value or theree is the antoehre way ie the lambda expresioo as belwo
    //    like ThreadLocal<String>threadLocal=ThreadLocal.initialValue(
      //      lambda expresion
    //    since supplier is the fucntional interface so you can suppply the impletnation of the supplier abstrac method implentation here only uisn hte lambad expresion
  //
//intereanly what happent hte javm will makt the class wehihc impletnets tthe supplier interdace and over the only the one absract metoh adn tthe object it is made ath referce is passed ot hte intiral alue
//)
   // static ThreadLocal<WebDriver> webDriverThreadLocal=ThreadLocal.withInitial(
         //   lambda expresion
              //  System.setProperty("webdriver.gecko.driver", DriverAndFilesPath.fireFoxPath
           //     return new FirefoxDriver()
           //
    //)





    // when two or more piece of code has to run in parallel(one by one ) then we use thread  concept
    // each thread must have the seperate local variable value for that we use  the threadlocal variable
    // how thread local variabl how ist it made very simple make one class you can assign each thread local value  using this class

    public static void setDriver(WebDriver driver){
        webDriverThreadLocal.set(driver);
    }



    //this method is used whne two or more threads are running i want the local value like driver value for each thread
    public static WebDriver getDriver(){
        return webDriverThreadLocal.get();
    }



    public static void  unload(){
        webDriverThreadLocal.remove();
    }
}
