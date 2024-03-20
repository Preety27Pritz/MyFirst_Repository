import java.util.*;
class ArmRec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int count=0;
        int m=n;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        if(m==isArm(m,count)) System.out.println("Armstrong number");
        else System.out.println("not a Armstrong number");
    }
    public static int isArm(int n,int count)
    {
        if(n==0) return 0;
        return (int)Math.pow(n%10,count)+isArm(n/10,count);
    }
}