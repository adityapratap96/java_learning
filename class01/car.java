package oops;

public class car {
     private int doors;
     private int wheels;
     private String model;
     private String color;
     
     public void setModel(String model)
     {
        String validModel = model.toLowerCase();
        if(validModel.equals("land")|| validModel.equals("k10"))
        {
            this.model = model;
        }
        else{
            this.model ="unknown";
        }
        this.model =model;
     }
     public String getmodel()
     {
        return this.model;
     }
}
