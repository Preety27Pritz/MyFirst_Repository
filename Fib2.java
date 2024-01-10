class Fib2
{
	public static void main(String args[])
	{
		System.out.println(fib(0,1,10));
	}
	
	static int fib(int a,int b,int n)
	{
		if(n==1) return a;
		
		return fib(b,a+b,n-1);
	}
}