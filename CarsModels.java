package ClassObjectPrograms;

public class CarsModels 
{
	public static void main(String[]args)
	{
		Car C1 = new Car("BMW","xz",2011,"Red",205);
		C1.Accelerate(20);
		C1.Break(30);
		C1.displayStatus();
	}
}
class Car
{
	public String Name;
	public String Model;
	public int Year;
	public String Color;
	public int Speed;
	public Car(String Name,String Model,int Year,String Color,int Speed)
	{
		this.Name=Name;
		this.Model=Model;
		this.Year=Year;
		this.Color=Color;
		this.Speed=Speed;
	}
	public void Accelerate(int increment)
	{
		System.out.println("speed of car is incresed from" +Speed+"to"+(Speed+increment));
		Speed = Speed+increment;
	}
	public void Break(int decrement)
	{
		System.out.println("Speed of car is decresed from" +Speed+"to"+(Speed-decrement));
		Speed = Speed -decrement;
		
	}
	public void displayStatus()
	{
		System.out.println("Name :"+Name);
		System.out.println("Model :"+Model);
		System.out.println("Color :"+Color);
		System.out.println("Speed :"+Speed);

	}
}
