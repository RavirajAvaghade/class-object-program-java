package ClassObjectPrograms;

public class SmartPhoneMainClass 
{

	public static void main(String[] args) 
	{
		Phone P1 = new Phone("iPhone",17,130000,512,5000);
				P1.MakeCall(8459867542L);
				P1.InstallApP("pubg");
				P1.Charge(30);
				P1.Info();

	}
	 static class Phone
	{
		public String Brand;
		public int Model;
		public double Price;
		public double Storage;
		public double Battary;
		public Phone(String Brand,int Model,double Price,double Storage,double Battary)
		{
			this.Brand = Brand;
			this.Model = Model;
			this.Price = Price;
			this.Storage = Storage;
			this.Battary = Battary;
		}
		public void MakeCall( long Number)
		{
			System.out.println("Calling:"+Number);
			
		}
		public void InstallApP( String AppName)
		{
			System.out.println("You are Downloading :" +AppName);
		}
		public void Charge(int Minute)
		{
			System.out.println(" Your Mobile Charge in "+Minute+"Min");
		}
		public void Info()
		{
			System.out.println("Mobile Brand :"+Brand);
			System.out.println("Mobile Model :" +Model+"Pro Max");
			System.out.println("Mobile Price :"+(int)Price);
			System.out.println("Mobile Storage :"+(int)Storage+"GB");
			System.out.println("Mobile Battary :"+(int)Battary+"mah");
		}
		
	}

}
