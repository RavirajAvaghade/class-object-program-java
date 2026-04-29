package ClassObjectPrograms;

public class pepoleClass 
{

	public static void main(String[] args) 
	{
		person P1 = new person("Alice",21,"male");
		Student S1 = new Student("Alice",21,"male",501,"B tech","A");
		Teacher T1 = new Teacher("Priya",25,"Female","English",45000,12);
		P1.eat();
		P1.sleep(8);
		P1.getInfo();
		S1.StudentId();
		S1.Course();
		S1.Grade();
		T1.TechClass();       
        T1.Evaluate();
   
	}

}
class person
{
	public String name;
	public int age;
	public String Gender;
	public person(String name,int age,String Gender)
	{
		this.name = name;
		this.age = age;
		this.Gender = Gender;
	}
	public void eat()
	{
	   System.out.println(name+ " eat the food");
	}
	public void sleep(int hour)
	{
		System.out.println(name+" you have sleep " + hour+" houres");
	}
	public void getInfo()
	{   System.out.println("===================");
		System.out.println("name   :"+name);
		System.out.println("age    :"+age);
		System.out.println("Gender :"+Gender);
		System.out.println("===================");
	}
}
class Student extends person
{   
	public double  StudentId;
	public String Course;
	public String Grade;
	public Student(String name,int age,String Gender,double StudentId,String Course,String Grade)
	{
		super(name,age,Gender);
		this.StudentId = StudentId;
		this.Course = Course;
		this.Grade = Grade;
	}
	public void StudentId()
	{
		System.out.println("StudentId : "+StudentId);
	}
	public void Course()
	{
		System.out.println(" is attending class in :"+ Course);
	}
	public void Grade()
	{
		System.out.println(" your grade is :"+ Grade);
	}
}
class Teacher extends person
{
	public String Subject;
	public double Salary;
	public int yearsOfExperience;
	public Teacher(String name,int age,String Gender,String Subject,double Salary,int yearofExperience)
	{
		super(name,age,Gender);
		this.Subject = Subject;
		this.Salary = Salary;
		this.yearsOfExperience = yearofExperience;

	}
	public void TechClass()
	{
		System.out.println(name+" Madam Has Taken The"+Subject+" Class");
	}
	public void Evaluate()
	{
		System.out.println(name+" has been Evaluate  Student");
	}
}