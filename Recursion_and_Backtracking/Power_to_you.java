import java.util.*;
class Power_to_you
{
    public static long calc_power(long x, long y)
    {
        if(y==1)
        {
            return x;
        }
        x*=x;
        x=calc_power(x,--y);
        return x;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        long x= s.nextInt();
        System.out.println("Enter Power:");
        long y=s.nextInt();
        x=calc_power(x,y);
        System.out.println("Result: "+x);
    }
}
