import java.util.Scanner;
class Palindrome
{
    public static String chkpal(char[] c1,int i,int j)
    {
        if(j>=i)
        {
            return ("Palindrome");
        }
        if(c1[i]==c1[j])
        {
            String s = chkpal(c1,i-1,j+1);
            //System.out.print(s+" "+i);
            return (s);
        }
        else
        {
            return("Not a Palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String s1=s.next(); 
        char[] c1=s1.toCharArray();
        String a=chkpal(c1,s1.length()-1,0);
        System.out.println(a);
        
    }
}