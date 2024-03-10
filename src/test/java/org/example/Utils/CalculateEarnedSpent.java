package org.example.Utils;

import org.example.Pojo.SpentEarned;

public class CalculateEarnedSpent {


    //ie  we can call the static variable or method by class name
    //ie per class it is only one
    //dublicacy is not allowed
    //like non static variable or method is dublicated for each new object
    private static SpentEarned spentEarned;

    static{
        spentEarned=new SpentEarned();
    }


    public static void amountSpent(double amountSpent){
        spentEarned.setSpent(amountSpent);
    }

    public static double showSpent(){
        return spentEarned.getSpent();
    }


    public static void amountEarned(double amountEarned){
        spentEarned.setEarned(amountEarned);
    }

    public static double showEarned(){
        return spentEarned.getEarned();
    }

}
