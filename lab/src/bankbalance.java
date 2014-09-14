public class bankbalance
	{
	  private double bankbalance;
	  
	  public void setbalance(double x)
	   {
	   this.bankbalance=x;
	   }
	   
	   public double getbalance()
	   {
	   return this.bankbalance;
	   }
	  
	   public void withdraw(int x)
	   {
	     if(x%5==0 && x<=this.bankbalance-0.5)
	     {
	     
	     this.bankbalance-=(x+0.5);
	     }
	     
	     System.out.println(this.bankbalance);
	   }
	  
	 }
	 



