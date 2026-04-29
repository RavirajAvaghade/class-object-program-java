package ClassObjectPrograms;

public class ConstructorOverloading
{

	public static void main(String[] args)
	{
		Student S1 = new Student();
        Student S2 = new Student("Ravi",21,50);
        
	}
    class Student
    {
    	  public String name;
    	  public int age;
    	  public double percentage;
    	  public String city;
    	  public Student(String name,int age)
    	  {
    		  this.name = name;
    		  this.age = age;
    		  
    	  }
    	  public Student(String name,int age,double perceentage)
    	  {
    		  this(name,age);
    		  this.percentage = percentage;
    	  }
    	  public Student(String name,int age,double percentage,String City)
    	  {
    		  this(name,age,percentage);
    		  this.city=city;
    	  }
    	  
    }
}
