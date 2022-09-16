public class diagonal_patter01 {
    public static void printSquareStar(int number)
    {
        if (number<5)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                for(int j=1 ;j<=number;j++)
                {
                    if((i==1)||(j==1)||(i==j)||(i==number)||(j==number)||(j==number-i+1))
                    {
                        System.out.print("*");
                    }
                    else{
                       System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
        }
    }
    public static void main(String[] args)
    {
        printSquareStar(6);
    }
}
