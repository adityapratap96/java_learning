import javax.sound.sampled.SourceDataLine;


public class goal_for_pac {
    public static boolean canPack(int bigCount,int smallCount ,int goal)
{
    if(bigCount<0||smallCount<0||goal<0)
    {
        return false;
    }
    int sum =0;
    
    for(int i=0;i<=bigCount;i++)
    {
        for(int j=0;j<=smallCount;j++)
        {
            sum = (5*i)+(1*j);
            if(sum==goal)
            {
                return true;
            }
        }
    }
    return false;
}
    public static void main(String[] args)
    {    
        System.out.println(canPack(4,3,13));
    }
}
