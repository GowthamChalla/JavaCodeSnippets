package stack;

public class ArrayImplementationof2StacksMethod2 
{

	public static void main(String[] args) 
	{
		stack5 obj = new stack5(10);
	
		obj.push1(10);
		
		
		obj.push2(30);
		obj.push2(40);
		obj.push2(40);
		obj.push2(40);
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
class stack5
{	
	int[] arr = null;
	int _arrlength = 0;
	int top1 = 0;
	int top2 = 0;
	public stack5(int arrlength)
	{
		_arrlength = arrlength;
		 arr = new int[_arrlength];
		 top2 = _arrlength-1;
	}
	
	public void push1(int x)
	{
		if (top1 < top2)
		{
			arr[top1] = x;
			top1++;
		}
		else
		{
			System.out.println("Stack 1 - Overflow");
		}
		
	}
	public void push2(int x)
	{
		if (top1 < top2+1)
		{
			arr[top2] = x;
			top2--;	
		}
		else
		{
			System.out.println("Stack 2 - Overflow");			
		}
	}
	
	public void display1()
	{
		System.out.println("Stack 1 Elements - ");
		for (int i = 0;i<=top1-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void display2()
	{
		System.out.println("\n\nStack 2 Elements - ");
		for (int i = _arrlength - 1;i>top2;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	
}
