package poloymorphism;

public class overloading
{
	int a=10;
	int b=20;
	public static int readdata(int a,int b)
	{
		return a*b;
	}
	public double readdata(double a,double b)
	{
		return a*b;
		
	}
	static class main
	{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println(overloading.readdata(10,20));
		System.out.println(overloading.readdata(20,30));
		
	}
	}
}


