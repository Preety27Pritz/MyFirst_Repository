
class FibSeriesMan
{
    public static void main(String args[])
    {
        int digit=10;
        PrintFiboSeries(10);
    }
    public static void PrintFiboSeries(int digit)
    {
        fib(0,1,1,10);
    }
    public static void fib(int a,int b, int count,int n)
    {
        if(count>n) return;
        System.out.println(a);
        fib(b,a+b,++count,n);
    }
}