import java.util.*;
class Fib
{
    public static int calc_fib(int val, int val2, int n)
    {
        if(n<2)
        {
            return val2;
        }
        val2+=val;
        val=val2;
        val2=calc_fib(val,val2,--n);
        return val2;
    }
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter position");
        int n=s.nextInt();
        int val=0;
        int val2=1;
        
        if(n==1)
        {
            System.out.println(0);  
        }
        else
        {
            val=calc_fib(val,val2,n-1);
            System.out.println(val);
        }
    }
}