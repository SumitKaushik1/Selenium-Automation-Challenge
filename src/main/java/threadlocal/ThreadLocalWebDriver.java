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

    public static void setDriver(WebDriver driver){
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getDriver(){
        return webDriverThreadLocal.get();
    }



    public static void  unload(){
        webDriverThreadLocal.remove();
    }
}