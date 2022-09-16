public class largest_primefactor {
    public static int getLargestPrime(int number)
    {
        boolean t=true;
        if(number<2)
        {
            return -1;
        }
        for(int i=number;i>1;i--)
        {
            t=true;
            if(number%i==0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        t=false;
                        break; 
                    }
                }
                if(t)
                {
                return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(getLargestPrime(77));
    }
}
