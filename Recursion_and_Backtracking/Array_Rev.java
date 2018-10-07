import java.util.*;
class Array_Rev
{
    public static int[] rev(int[] arr,int i, int j)
    {
        int temp;
        if(j>=i)
        {
            return arr;
        }
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        arr=rev(arr,--i,++j);
        return arr;

    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++)
        {
            arr[i]=s.nextInt();
        }
        arr=rev(arr,num-1,0);
        System.out.println("Reversed Array:");
        for(int i=0;i<num;i++)
        {
            System.out.println(arr[i]);
        }
    }
}