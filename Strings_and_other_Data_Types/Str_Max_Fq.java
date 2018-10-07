//Compress string
//eg: aaabccd=a3bc2d
import java.util.Scanner;
class Str_Max_Fq
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char[] c1=s1.toCharArray();
        int i,j=0,max=0;
        int[] c2=new int[256];
        for(i=0;i<s1.length();i++)
        {
            c2[c1[i]]++;
        }
        for(i=0;i<s1.length();i++)
        {
            if(max<c2[c1[i]])
            {
                j=i;
                max=c2[c1[i]];
            }
        }
        System.out.println("Character with maximum frequency : "+c1[j]);
    }
}