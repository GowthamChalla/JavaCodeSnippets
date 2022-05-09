package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample 
{
	public static void main(String[] args) throws IOException , FileNotFoundException, ClassNotFoundException
	{
		Employee e1 = new Employee(101,10000.00f);
		e1.print();
		
		FileOutputStream fos = new FileOutputStream("c:\\java\\sample.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("c:\\java\\sample.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee e2 = (Employee)ois.readObject();
		System.out.println(e2.getEmpno()+ " "+e2.getSalary());
		fis.close();
		ois.close();
	}
}
class Employee implements Serializable
{
	Employee(int _empno, float _salary)
    {
          empno = _empno;
          salary = _salary;
    }      
    private int empno;
    public int getEmpno() {
          return empno;
    }
    public void setEmpno(int empno) {
          this.empno = empno;
    }
    public float getSalary() {
          return salary;
    }
    public void setSalary(float salary) {
          this.salary = salary;
    }
    private float salary;
    
    void print()
    {      
    System.out.println("Emp no :: "+empno +"\nEmp Salary :: "+salary);
    }

}
