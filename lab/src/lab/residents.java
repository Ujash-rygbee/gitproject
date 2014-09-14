package lab;

public class residents {
	
	private String name;
	private String address;
	private String Authority;
	private String sex;
	private int  age;
	
	public residents(String x,String y,String z,int m,String a)
	{
		this.setName(x);
		this.setAuthority(y);
		this.setSex(z);
		this.setAge(m);
		this.setAddress(a);
		}
	
	public void setName(String x)
	{
		this.name=x;
	}
	
	public void setAddress(String x)
	{
		this.address=x;
	}
	
	public void setAuthority(String x)
	{
		this.Authority=x;
	}
	
	public void setSex(String x)
	{
		this.sex=x;
	}
	
	public void setAge(int x)
	
	{
		this.age=x;
	}
	
	public String getAuthority()
	{
		return this.Authority;
	}
	
	public String getSex()
	{
		return this.sex;
    }
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getName()
	{
		return this.name;
    }
	
}
