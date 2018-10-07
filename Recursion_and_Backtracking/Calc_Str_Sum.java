import java.util.Scanner;

class Calc_Str_Sum
{
    public static int Calc(char[] c1, int len, int sum)
    {
        if(len<0)
        {
            return sum;
        }
        if(c1[len]>'0'&&c1[len]<'9')
        {
            sum+=(int)c1[len]-'0';
            //System.out.println(c1[len]);
        }
        
        sum=Calc(c1,--len,sum);
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] c1=s1.toCharArray();
        int sum=0;
        sum=Calc(c1,s1.length()-1,sum);
        System.out.println(sum);
    }
}