import java.util.*;
class PalindromeRec
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int temp=0;
        int m=n;
        if(m==isPal(m,temp)) System.out.println("Palindrome number");
        else System.out.println("Not a Palindrome number");
    }
    public static int isPal(int n,int temp)
    {
        if(n==0) return temp;
        temp=temp*10+(n%10);
        return isPal(n/10,temp);
    }
}