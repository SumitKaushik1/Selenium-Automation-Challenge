package Pojo;

public class SpentEarned {

    private double  spent;//bydefault is zero
    private double earned;

    public SpentEarned(){
    }



   public  double getSpent(){
        return this.spent;
    }

    public double getEarned(){

        return this.earned;

    }


  public void setSpent(double spentValue){
        this.spent+=spentValue;
    }

   public  void setEarned(double earnedValue){
        this.earned+=earnedValue;
    }

}
