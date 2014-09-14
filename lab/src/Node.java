
public class Node
{
	private Employee employee;
	private Node leftnode;
	private Node rightnode;
    private Node parent;
     int depth=1;
	
	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	Node(Employee e)
	{
		this.employee=e;
		this.leftnode=null;
		this.rightnode=null;
		
	}
	
	public Node getleftnode()
	{
		return this.leftnode;
	}
	
	public Node getrightnode()
	{
		return this.rightnode;
	}
	
	public void set_leftnode(Node x)
	{
		this.leftnode=x;
	}
	
	public void set_rightnode(Node x)
	{
		this.rightnode=x;
	}
	

}
