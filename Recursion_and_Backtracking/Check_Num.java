import java.util.Scanner;

class Check_Num
{
    public static boolean check(int[] arr,int n,int m)
    {
        if(n<0)
        {
            return false;
        }
        else if(arr[n]==m)
        {
            return true;
        }
        boolean a=check(arr,--n,m);
        return a;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n=s.nextInt();
        System.out.println("Enter elements of array:");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter number to search:");
        int m=s.nextInt();
        boolean a= check(arr,n-1,m);
        System.out.println("Result:"+a);

    }
}