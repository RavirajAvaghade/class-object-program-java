package ClassObjectPrograms;

public class EmpMainClass 
{

	public static void main(String[] args) 
	{
		Developer d1 = new Developer(501,"Arun,",50000,"java",40);
		Developer d2 = new Developer(502,"keziya",40000,".net",50);
		Tester t1 = new Tester(503,"faruq",35000,"AutomationTester",15);
		Tester t2 = new Tester(504,"Bhavya",30000,"Manualtestinh",7);
		d1.Startproject();
		t1.Startproject();
		System.out.println(d1.empid);
		System.out.println(d2.empid);
		System.out.println(t1.empid);
		System.out.println(t2.empid);

	}

}
class Employee
{
	public int empid;
	public String name;
	public double salary;
	public int numberofdays;
	public Employee(int empid,String name,double salary,int numberofdays)
	{
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		this.numberofdays = numberofdays;
		
	}

	
	public void Startproject()
	{
		System.out.println("Project has been Started");
	}
	public void finishproject() 
	{
		System.out.println("your project has been finished");
	}
	public void deadline(int numofdaysComplete)
	{
		System.out.println("No of days ramaining:"+(numberofdays-numofdaysComplete));
	}
}
class Developer extends Employee
{
	public String language;
	public Developer(int empid,String name,double salary, String language,int numberofdays)
	{
		super(empid,name,salary,numberofdays);
		this.language = language;
	}
}
class Tester extends Employee
{
	public String jobRole;
	public Tester(int empid,String name,double salary,String jobRole, int numberofdays)
	{ 
		super(empid,name,salary,numberofdays);
		this.jobRole=  jobRole;
		
	}

}
