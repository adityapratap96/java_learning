package class01;

public class basic {
    public static void main(String[] args)
    {
        car alto =new car();
        alto.setModel("k10");
        car porche = new car();
        porche.setModel("land");
        System.out.println(porche.getmodel());
        System.out.println(alto.getmodel());
    } 
}
