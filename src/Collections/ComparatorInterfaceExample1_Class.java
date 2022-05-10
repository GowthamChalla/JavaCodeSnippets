package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class ComparatorInterfaceExample1_Class {

	public static void main(String[] args) 
	{	  
       Employee1 e1 = new Employee1(101,"Employee1");
       Employee1 e4 = new Employee1(104,"Employee4");
       Employee1 e3 = new Employee1(103,"Employee3");
       Employee1 e2 = new Employee1(102,"Employee2");
       
       ArrayList<Employee1> arr = new ArrayList<>();
       arr.add(e1);
       arr.add(e4);
       arr.add(e3);
       arr.add(e2);
       System.out.println(arr);
       
       Collections.sort(arr, new EmpNoCompare());
       System.out.println(arr);
       
       Collections.sort(arr, new EmpNameCompare());
       System.out.println(arr);
    
       
	}

}
class Employee1
{
	int empno;
	String name = "";
	Employee1(int empno,String name)
	{
		this.empno = empno;
		this.name = name;
	}
	
	public String toString()
	{
		return empno+" - "+name;
	}
}
class EmpNoCompare implements Comparator<Employee1>
{
	public int compare(Employee1 e1,Employee1 e2)
	{
		if (e1.empno>e2.empno)
			return 1;
		else if (e1.empno < e2.empno)
			return -1;
		else
			return 0;
	}	
}
class EmpNameCompare implements Comparator<Employee1>
{
	public int compare(Employee1 e1,Employee1 e2)
	{
		return e1.name.compareTo(e2.name);
	}	
}
