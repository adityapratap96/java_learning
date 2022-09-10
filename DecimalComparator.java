import java.util.Scanner;
public class DecimalComparator {
    
    public static boolean areEqualByThreeDecimalPlaces(double a,double b)
   {
        return (int)(a*1000)==(int)(b*1000);
   }
   public static void main (String[] args)
   {
    Scanner inp = new Scanner(System.in);
    
    double a = inp.nextDouble();
    double b = inp.nextDouble();
    System.out.println(areEqualByThreeDecimalPlaces(a,b));

   }
    
}
