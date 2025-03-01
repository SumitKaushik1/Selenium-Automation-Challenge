package com.extendedreport.two;


import enumconstants.LogType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Consumer;

public class FrameworkLogger {
    private FrameworkLogger(){}

    private static Consumer<String> PASS;
    private static Consumer<String> FAIL;
    private static Consumer<String> SKIP;
    private static Consumer<String> INFO;
    private static Consumer<String> CONSOLE;
    private static Consumer<String> EXTENTANDCONSOLE;
//Consumer is the functional interface and it has one  abstract method ie accept we can give defintion of that accept method as the below
    // compiler make the implicit class which implement functiona interface adn override the method accdept and add the definition ot that as below

    private static Map<LogType,Consumer<String>> MAP=new EnumMap<>(LogType.class);
    static{


       PASS= (message)->ThreadLocalTwoExtentManager.getExtentTest().pass(message);
       FAIL=(message)->ThreadLocalTwoExtentManager.getExtentTest().fail(message);
       SKIP=(message)->ThreadLocalTwoExtentManager.getExtentTest().skip(message);
       INFO=(message)->ThreadLocalTwoExtentManager.getExtentTest().info(message);
       CONSOLE=(message)-> System.out.println("INFO--->"+message);
       EXTENTANDCONSOLE=PASS.andThen(CONSOLE);
       //Enum constants bz the coder hast o choose from the user defined constants instead  of
        // stirngs ie fixed constants noy any random
        MAP.put(LogType.PASS,PASS);
        MAP.put(LogType.FAIL,FAIL);
        MAP.put(LogType.SKIP,SKIP);
        MAP.put(LogType.INFO,INFO);
        MAP.put(LogType.CONSOLE,CONSOLE);
        MAP.put(LogType.EXTENTANDCONSOLE,PASS);

       

    }

    public static void log(LogType status ,String message){
        MAP.get(status).accept(message);
    }

}
