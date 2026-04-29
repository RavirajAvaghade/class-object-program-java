package ClassObjectPrograms;

public class Movies 
{ 
	public static void main(String[]args)
	{
		Movie M1 = new Movie("Sholy","Ramesh Sippy",204, 5.0, "Action/Adventure","Amitab bachan Dharmendra Sanjeev Kumar Hema Malini Jaya Bacchan");
        M1.play();
        M1.Pause();
        M1.Stop();
        M1.Rating(8);
        M1.Details();
        M1.Character();
	}

}
class Movie
{
	public String title;
	public String Director;
	public double Duration;
	public double  Rating;
	public String Type;
	public String Cast;
	public Movie(String title,String Director,double Duration,double Rating,String Type,String Cast)
	{
		this.title = title;
		this.Director = Director;
		this.Duration = Duration;
		this.Rating = Rating;
		this.Type = Type;
		this.Cast = Cast;
	}
	public void play()
	{
		System.out.println( title  +  " has been playing.......!!");
	}
	public void Pause()
	{
		System.out.println(title +  " has been paused..........!!");
	}
	public void Stop()
	{
		 System.out.println(title + " has stopped.");
	}
	public void Rating(double r)
	{
		if(r<10)
		{
			Rating = r;
			System.out.println("Thanks for Rating movie");
		}
		else
		{
			System.out.println("invalid rating");
		}
	
	}
	public void Details()
	{
		System.out.println("title:" +title);
		System.out.println("Director:" +Director);
		System.out.println("Duration:" +Duration+"Min");
		System.out.println("Rating : "+Rating);
		System.out.println("Type:" +Type);
		

		
	}
	public void Character()
	{
		System.out.println("Cast: " +Cast);
	}
}

