 import java.util.*;
class B
{
	void result(int n)
	{
		int f=1;
		while(n!=0)
		{
			f=f*n;
			n--;
		}
		System.out.println("the factorial:"+f);
	}
	void result(int m,int u)
	{
		System.out.println("the power of number is:"+(Math.pow(m, u)));
	}
	void result(int cost,int len,int bet)
	{
		System.out.println("the total cost of boundary:"+(cost*(2*len*bet)));
	}
}
 class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x,c,d;
		System.out.println("enter the number");
		x=sc.nextInt();
		B ne=new B();
		ne.result(x);
		System.out.println("enter the two numbers");
		c=sc.nextInt();
		d=sc.nextInt();
	    ne.result(c,d);
	    int cost,len,bet;
	    System.out.println("enter the cost");
	    cost=sc.nextInt();
	    System.out.println("enter the length");
	    len=sc.nextInt();
	    System.out.println("enter the breth");
	    bet=sc.nextInt();
	    ne.result(cost,len,bet);
	}

}
