package ClassObjectPrograms;

public class EmployyeMainClass 
{

	public static void main(String[] args) 
	{
        Employee e1 = new Employee("nit123", "suresh", "HR", 50000, "suresh@123");
		e1.raisedSalary(100);
		e1.ChangeDept("hr");

	}
	 static class Employee
	{
		public String empid;
		public String empName;
		public String dept;
		public double Salary;
		public String emailid;
		public Employee(String empid,String empName,String dept,double Salary,String emailid)
		{
			this.empid = empid;
			this.empName = empName;
			this.dept = dept;
			this.Salary = Salary;
			this.emailid = emailid;
		}
		public void raisedSalary(double percent)
		{
			System.out.println("Congratulations you hike of" +percent+"% in your salary");
			Salary = Salary*(1+percent/100);
			System.out.println("your new Salary is :"+Salary);
		}
		public void ChangeDept(String newDept)
		{
			System.out.println("Your Dept has been changed to :"+newDept);
			dept = newDept;
		}
		public void ShowInfo()
		{
			System.out.println(" Employee Id :"+empid);
			System.out.println(" Employee name :"+empName);
			System.out.println(" Employee dept:"+dept);
			System.out.println(" Employee Salary :"+Salary);
			System.out.println(" Employee Id :"+emailid);



			
		}
	}

}
