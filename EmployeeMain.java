package ClassObjectPrograms;

public class EmployeeMain {

	public static void main(String[] args) 
	{
		Employee e = new Employee(1001, "Alice" , 5000.0);
		Manager m = new Manager(2001,"bob",7000.0,15000.0);
		m.displayinfo();
		System.out.println(m.)
		

	}

}
class Employee
{
	public int id;
	public String Name;
	public double Salary;
	public Employee(int id,String Name,double Salary)
	{
		this.id = id;
		this.Name = Name;
		this.Salary = Salary;
		
	}
	public void displayInfo()
	{
		System.out.println("id:"+id);
		System.out.println("Name :"+Name);
		System.out.println("Salary:"+Salary);
	}
	public double getAnnualSalary()
	{
		return 12* Salary;
	}
	class Manager extends Employee
	{
		public double bonus;
		public Manager(int id,String Name,double Salary,double bonus)
		{
			super(id,Name,Salary);
		    this.bonus = bonus; 
		}
		public void displayInfo()
		{
			System.out.println("id:"+id);
			System.out.println("Name :"+Name);
			System.out.println("Salary:"+Salary);
			System.out.println("bonus:"+bonus);
		
		}
		public double getAnnualSalary;
		public Manager(int id,String Name,double Salary,double bonus,double getAnnualSalary)
		{
			
		}
		
	}
}
