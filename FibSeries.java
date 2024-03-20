import java.util.*;
class FibSeries
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit upto which u want to see the series:");
        int digit=sc.nextInt();
        PrintFiboSeries(digit);
    }
    public static void PrintFiboSeries(int digit)
    {
        fib(0,1,1,digit);
    }
    public static void fib(int a,int b, int count,int n)
    {
        if(count>n) return;
        System.out.println(a);
        fib(b,a+b,++count,n);
    }
}