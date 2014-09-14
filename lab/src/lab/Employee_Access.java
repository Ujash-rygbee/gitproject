package lab;
import java.util.Scanner;
import java.io.*;

public class Employee_Access
{
	private int total_Employees;
	private Employee employees[];
	private int max_limit_of_shift;
	private int total_opted_for_shift;
	private Employee opted_employees[];
	Scanner scan;
	
	public void read_Employee_data()throws IOException
	{
		scan=new Scanner(new File("C:\\Users\\ujash\\Desktop\\employees.txt"));
		String y=scan.nextLine();
		total_Employees=Integer.parseInt(y);
		employees=new Employee[total_Employees];
		int x=0;
		while(x<employees.length)
		{
			String s=scan.nextLine();
			String a[]=new String[4];
			a=s.split(", ");
			int m=Integer.parseInt(a[0]);
			int n=Integer.parseInt(a[2]);
			int o=Integer.parseInt(a[3]);
			employees[x]=new Employee(m,a[1],n,o,"HQ");
			x++;
		}

		/*for(int i=0;i<employees.length;i++)
		{
			System.out.println(employees[i].get_Id());
			System.out.println(employees[i].get_Name());
			System.out.println(employees[i].get_tenure());
			System.out.println(employees[i].get_Salary());
		}*/
		
		y=scan.nextLine();
		Scanner z=new Scanner(y);
		total_opted_for_shift=z.nextInt();
		max_limit_of_shift=z.nextInt();
		opted_employees=new Employee[total_opted_for_shift];
		
		for(int i=0;i<total_opted_for_shift;i++)
		{
			y=scan.nextLine();
			int m=Integer.parseInt(y);
			for(int j=0;j<employees.length;j++)
			{
				int n=employees[j].get_Id();
				if(m==n)
				opted_employees[i]=employees[j];
			}
		 }
		
		/*for(int i=0;i<opted_employees.length;i++)
		{
			System.out.println(opted_employees[i].get_Id());
			System.out.println(opted_employees[i].get_Name());
			System.out.println(opted_employees[i].get_tenure());
			System.out.println(opted_employees[i].get_Salary());
		}*/
		
	}
	
	    public void shiftEmployees()
	    {
	    	if(max_limit_of_shift<=(total_opted_for_shift)/2)
	    	{
	    	 Employee e;
	    	 for(int i=0;i<opted_employees.length;i++)
	    	 {
	    		 for(int j=i+1;j<opted_employees.length;j++)
	    		 {
	    			 int x=opted_employees[j].get_tenure();
	    			 int y=opted_employees[i].get_tenure();
	    			 int m=opted_employees[j].get_Salary();
	    			 int n=opted_employees[i].get_Salary();
	    			 if(x>y)
	    			 {
	    				e=opted_employees[j];
	    				opted_employees[j]=opted_employees[i];
	    				opted_employees[i]=e;
	                  }
	    			 
	    			 else 
	    			 {
	    				 if(m>n && x==y)
	    				 {
	    					 e=opted_employees[j];
	 	    				 opted_employees[j]=opted_employees[i];
	 	    				 opted_employees[i]=e; 
	    				 }
	    			 }
	    	  	  }
	           }
	    	 
	    	 //for(int i=0;)
	    	 see();
	    	 show_final_result();
	    	 
	          }
	    	
	    	   else
	         	System.out.println("Employee limit exeeded");	    
	    	}
	  
	    public void see()
	    {
	      for(int i=0;i<max_limit_of_shift;i++)
	      {
	    	  int n=opted_employees[i].get_Id();
	    	  opted_employees[i].set_workplace("New");
	    	  for(int j=0;j<employees.length;j++)
	    	  {
	    		  int m=employees[j].get_Id();
	    		  if(m==n)
	    		  {
	    			  employees[j].set_workplace("New");
	    		  }
	    	  }
	        }
	     }
	
         public void show_final_result()
         {
        	 System.out.println("HQ");
        	 for(int i=0;i<employees.length;i++)
        	 {
        		 if(employees[i].get_workplace().equals("HQ"))
        		 {
        			 System.out.println(employees[i].get_Id());
        		 }
        	 }
        	 
        	 System.out.println("New");
        	 for(int i=0;i<employees.length;i++)
        	 {
        		 if(employees[i].get_workplace().equals("New"))
        		 {
        			 System.out.println(employees[i].get_Id());
        		 }
        	 }
           }
         
         public int getMax_shifted()
         {
        	 return this.max_limit_of_shift;
         }
         
         public int get_total_Employees()
         {
        	 return this.total_Employees;
         }

   }
