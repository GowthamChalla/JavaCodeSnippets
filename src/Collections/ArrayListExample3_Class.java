package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample3_Class {

	public static void main(String[] args)
	{
		Employee E1 = new Employee(101,"Employee1");
		Employee E2 = new Employee(101,"Employee2");
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(E1);
		al.add(E2);
		
		System.out.println(al);
		
		for (Employee e : al)
		{
			System.out.println(e);
		}
		
		System.out.println("\n\n Use Iterator interface to display records one at a time.");
		Iterator<Employee> x = al.iterator();
		while (x.hasNext())
		{
			System.out.println(x.next());
		}		
	}

}
class Employee
{
	int _empno = 0;
	String _empName = "";
	public Employee(int empno,String empName)
	{
		this._empno = empno;
		this._empName = empName;
	}
	
	public String toString()
	{
		return "EmpNo - "+_empno+" EmpName - "+_empName;
	}
}
