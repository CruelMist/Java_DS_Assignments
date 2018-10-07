import java.util.*;
class Change_Case
{
    public static String change(char[] c1)
    {
        String s2="";
        int a;
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i]>='A'&&c1[i]<='Z')
            {
                a=(int)(c1[i]+32);
                s2+=(char)a;
            }
            else if(c1[i]>='a'&&c1[i]<='z')
            {
                a=(int)(c1[i]-32);
                s2+=(char)a;
            }
            else
            {
                s2+=c1[i];
            }
        }
        return s2;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine(); 
        char[] c1=s1.toCharArray();
        String a=change(c1);
        System.out.println(a);
        
    }
}
