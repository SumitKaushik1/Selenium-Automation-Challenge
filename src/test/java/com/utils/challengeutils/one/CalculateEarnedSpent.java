package com.utils.challengeutils.one;


import com.pojo.Pojo.one.SpentEarned;

public class CalculateEarnedSpent {


    //ie  we can call the static variable or method by class name
    //ie per class it is only one
    //dublicacy is not allowed
    //like non static variable or method is dublicated for each new object



    //i need dublicate object for both classs so make the non static
    private SpentEarned spentEarned;

    public CalculateEarnedSpent(){
        spentEarned=new SpentEarned();
    }

    public  void amountSpent(double amountSpent){
        spentEarned.setSpent(amountSpent);
    }

    public  double showSpent(){
        return spentEarned.getSpent();
    }


    public  void amountEarned(double amountEarned){
        spentEarned.setEarned(amountEarned);
    }

    public  double showEarned(){
        return spentEarned.getEarned();
    }
}
