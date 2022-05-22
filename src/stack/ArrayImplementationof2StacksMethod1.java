package stack;

public class ArrayImplementationof2StacksMethod1 
{

	public static void main(String[] args) 
	{
		stack4 obj = new stack4(10);
		obj.push1(10);
		obj.push1(20);
		obj.push1(20);
		obj.push1(20);
		obj.push1(20);
		obj.push1(20);
		
		obj.push2(30);
		obj.push2(40);
		obj.push2(40);
		obj.push2(40);
		obj.push2(40);
		obj.push2(40);
		obj.push2(40);
		
		obj.display1();
		obj.display2();

	}

}
class stack4
{	
	int[] arr = null;
	int _arrlength = 0;
	int top1 = 0;
	int top2 = 0;
	public stack4(int arrlength)
	{
		_arrlength = arrlength;
		 arr = new int[_arrlength];
		 top1 = _arrlength/2-1;
		 top2 = _arrlength - _arrlength/2;
	}
	
	public void push1(int x)
	{
		if (top1>=0)
		{
			arr[top1] = x;
			top1--;
		}
		else
		{
			System.out.println("Stack 1 - Overflow");
		}
		
	}
	public void push2(int x)
	{
		if (top2<=_arrlength-1)
		{
			arr[top2] = x;
			top2++;	
		}
		else
		{
			System.out.println("Stack 2 - Overflow");			
		}
	}
	
	public void display1()
	{
		System.out.println("Stack 1 Elements - ");
		for (int i = _arrlength/2-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void display2()
	{
		System.out.println("\n\nStack 2 Elements - ");
		for (int i = _arrlength - _arrlength/2;i<=_arrlength-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
