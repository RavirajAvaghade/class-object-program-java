package ClassObjectPrograms;

public class vehicleMainClass
{

	public static void main(String[] args)
	{
       vehicle v1 = new vehicle("hero","Splendor",0,130000);
       Motorcycle m1 = new Motorcycle("Royal Enfield","Bullet",0,200000,"No",650);
       car c1 = new car("Mahindra","Thar",1,2500000,4,"Disel","yes");
       v1.Start();
       v1.Stop();
       v1.Displayinfo();
       m1.popwhile();
       m1.downwhile();
       c1.Openroof();
       c1.Drive();
       
		
		
	}

}
class vehicle
{
	public String Make;
	public String Model;
	public int Year;
	public double Price;
	public vehicle(String Make,String Model,int Year,double Price)
	{
		this.Make = Make;
		this.Model = Model;
		this.Year = Year;
		this.Price = Price;
	}
	public void Start()
	{   
		System.out.println("========================");
		System.out.println(Model +" bike will Start");
		System.out.println("========================");

	}
	public void Stop()
	{   		
	   System.out.println("==========================");
       System.out.println(Model +" bike will be Stop");
	   System.out.println("==========================");

	}
	public void Displayinfo()
	{   		
		System.out.println("======================");
        System.out.println("Make  :"+ Make);
		System.out.println("Model :"+ Model);
		System.out.println("Year  :"+ Year);
		System.out.println("Price :"+ Price);
	    System.out.println("======================");
	}

}
class Motorcycle extends vehicle
{
	public String hassidecar;
	public double enginCapacity;
	public Motorcycle(String Make,String Model,int Year,double Price, String hassidecar, double enginCapacity)
	{   super(Make,Model,Year,Price);
		this.hassidecar = hassidecar;
		this.enginCapacity = enginCapacity;
		
	}
	public void popwhile()
	{
		System.out.println(Model +" bike You just popewhile");
		System.out.println("has side car : "+hassidecar);
	}
	public void downwhile()
	{
		System.out.println(Model +" bike you just downwhile");
		System.out.println("Engin capacity of bike is :"+enginCapacity+"CC");
	}

}
class car extends vehicle
{
	public int Doors;
	public String FuelType;
	public String Covertable;
	public car(String Make,String Model,int Year,double Price,int Doors,String FuelType,String Covertable)
	{
		super(Make,Model,Year,Price);
		this.Doors = Doors;
		this.FuelType = FuelType;
		this.Covertable = Covertable;
	}
	public void Openroof()
	{   		
		System.out.println("================================");
        System.out.println(Model+" Car Roof will be opend");
	    System.out.println("================================");

	}
	public void Drive()
	{
		System.out.println("======================");
        System.out.println("You have drive "+ Model);
		System.out.println("======================");

	}
}
