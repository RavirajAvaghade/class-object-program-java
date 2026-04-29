package ClassObjectPrograms;

public class order 
{

	public static void main(String[] args) 
	{
		OnlineOrder O1 = new OnlineOrder(0001,"Raviraj" ,"15/10/2025",200);
		O1.UpdateStatus("Laptop");
		O1.AddItems("Mouse");
		

	}
     static class OnlineOrder
    {
    	  public int OrderId;
    	  public String CustName;
    	  public String OrdDate;
    	  public int Total;
    	  public OnlineOrder(int OrderId,String CustName,String OrdDate,int Total)
    	  {
    		  this.OrderId = OrderId;
    		  this.CustName = CustName;
    		  this.OrdDate = OrdDate;
    		  this.Total = Total;
    	  }
       public void UpdateStatus(String Status)
       {
    	     System.out.println("Your order updated : " + Status);
       }
       public void AddItems(String Items)
       {
    	     System.out.println("Add item"+Items);
       }
       public void AllInfo()
       {  
    	      System.out.println("-------------------------");
    	      System.out.println("orderId  : "+OrderId);
    	      System.out.println("CustName : "+CustName);
    	      System.out.println("OrdDate  : "+OrdDate);
    	      System.out.println("Total    : "+Total);
    	      System.out.println("-------------------------");
       }
    }
}
