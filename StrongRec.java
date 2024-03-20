import java.util.*;
class StrongRec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int m=n;
        if(m==isStrong(m)) System.out.println("Strong Number");
        else System.out.println("Not a Strong Number");
    }
    public static int fact(int n)
    {
        if(n==0 || n==1) return 1;
        return (n*fact(n-1));
    }
    public static int isStrong(int n)
    {
        if(n==0) return 0;
        return fact(n%10)+isStrong(n/10);
    }

}