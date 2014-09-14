package lab;

public class Employee {
	
	private int Id;
	private String Name;
	private int tenure;
	private int Salary;
	private String workplace;
	
	
	Employee(int x,String y,int z,int m,String h)
	{
		this.set_Id(x);
		this.set_Name(y);
		this.set_tenure(z);
		this.set_Salary(m);
		this.set_workplace(h);
	}
	
	public void set_Id(int x)
	{
		this.Id=x;
	}
	
	public void set_Name(String y)
	{
		this.Name=y;
	}
	
	public void set_tenure(int x)
	{
		this.tenure=x;
	}
	
	public void set_Salary(int x)
	{
		this.Salary=x;
	}
	
	public void set_workplace(String x)
	{
		this.workplace=x;
	}
	

	public String get_Name()
	{
		return this.Name;
	}
	
	public int get_Id()
	{
		return this.Id;
	}
	
	public int get_Salary()
	{
		return this.Salary;
	}
	
	public int get_tenure()
	{
		return this.tenure;
	}
	
	public String get_workplace()
	{
		return this.workplace;
	}
	
	

}
