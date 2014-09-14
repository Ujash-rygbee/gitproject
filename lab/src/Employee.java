
  public class Employee
 {
  private String Name;
  private int Id;
  private int Salary;
  private int Tenure;
  

  public String getName()
 {
	return Name;
 }

 public void setName(String name)
 {
	Name = name;
 }


 public int getId()
 {
	return Id;
 }

public void setId(int id) 
{
	Id = id;
}

public int getSalary() 
{
	return Salary;
}

public void setSalary(int salary)
{
	Salary = salary;
}

public int getTenure()
{
	return Tenure;
}

public void setTenure(int tenure)
{
	Tenure = tenure;
}
  
 Employee(String x,int a,int b,int c)
 {
	 this.setName(x);
	 this.setTenure(a);
	 this.setSalary(b);
	 this.setId(c);
 }
  
	
	
}
