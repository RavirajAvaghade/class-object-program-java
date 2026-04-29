package ClassObjectPrograms;

public class FlightBookMainClass 
{

	public static void main(String[] args) 
	{
		Ticket T1 = new Ticket(179,"Airindia","Mumbai","sanfransisco",40000,20);
				T1.BookSeat();
				T1.FlightInfo();
		

	}
	 static class Ticket
	{
		public double Flightnum;
		public String Airline;
		public String Source;
		public String Destination;
		public double Price;
		public double Duration;
		public Ticket(double Flightnum,String Airline,String Source,String Destination,double Price,double Duration)
		{
			this.Flightnum = Flightnum;
			this.Airline = Airline;
			this.Source = Source;
			this.Destination = Destination;
			this.Price = Price;
			this.Duration = Duration;
		}
		public void BookSeat()
		{
			System.out.println("You Book The plane Seat : ");
		}
		public void CancellSeat()
		{
			System.out.println("You have Cancelled Seat");
		}
		public void FlightInfo()
		{   System.out.println("=====================================");
			System.out.println("Flight Number : "+"AI"+(double)Flightnum);
			System.out.println("Airline       : "+Airline);
			System.out.println("Source        : "+Source);
			System.out.println("Destination   : "+(String)Destination);
			System.out.println("Price         : "+Price+"₹");
			System.out.println("Duration      : "+(double)Duration+"h");
			System.out.println("=====================================");
		}
	}

}
