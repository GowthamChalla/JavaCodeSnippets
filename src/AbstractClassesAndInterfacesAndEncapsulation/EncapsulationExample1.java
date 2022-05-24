package AbstractClassesAndInterfacesAndEncapsulation;

public class EncapsulationExample1 
{
	public static void main(String[] args) 
	{
	  Employee e1 = new Employee();
	  e1.setEmpno(101);
	  e1.setName("Gowtham");
	  e1.setSalary(10100);
	  
	  System.out.println(e1.getEmpno()+" - "+e1.getName()+" - "+e1.getSalary());

	}
}
class Employee
{
	private int empno;
	private String name;
	private float salary;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
