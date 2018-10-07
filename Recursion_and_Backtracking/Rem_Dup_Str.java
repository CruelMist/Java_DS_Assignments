import java.lang.*;
import java.util.*;
class Rem_Dup_Str
{
    public static String rem_dup(char[] c1,int len, int j,String s2)
    {
        if(j>len-1)
        {
            s2+=c1[j];
            return s2;
        }
        if(c1[j]!=c1[j+1])
        {
            s2+=c1[j]; 
        }
        s2=rem_dup(c1,len,++j,s2);
        return s2;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char[] c1=s1.toCharArray();
        String s2="";
        s2=rem_dup(c1,s1.length()-1,0,s2);
        System.out.println(s2);
    }
}