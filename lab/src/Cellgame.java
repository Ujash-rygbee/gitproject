  import java.util.Scanner;
  import java.io.*;
  public class Cellgame {

     private Cell Cells[][];
	 private int m,n;
	 private String a[];
	 
	 
	 
	  public void getCellDetails() throws IOException{
		
		 Scanner y=new Scanner(new File("C:\\Users\\ujash\\Desktop\\Cells.txt"));
         String z=y.nextLine();
         Scanner scan=new Scanner(z);
         m=scan.nextInt();
         n=scan.nextInt();
         
		 a=new String[m];
		 
		 for(int i=0;i<m;i++)
		 {
			 a[i]=y.nextLine();
		 }
		 Cells=new Cell[m][n];
		
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 Cells[i][j]=new Cell();
				 Cells[i][j].setlifesymbol(a[i].charAt(j));
			 }
		 }
			 
		 
		 
	 }
	 
	
	/*public void getCellDetails()
	{
		
	    Scanner	y = new Scanner(System.in);
		m=y.nextInt();
		n=y.nextInt();
		Scanner z = new Scanner(System.in);
		Cells=new Cell[m][n];
		a=new String[m];
		for(int i=0;i<m;i++)
		{
			a[i]=z.nextLine();
		}
		
		for(int i=0;i<m;i++)
		  {
			for(int j=0;j<n;j++)
			{
				Cells[i][j]=new Cell();
				Cells[i][j].setlifesymbol(a[i].charAt(j));
			}
		  }
    }*/
	
	
	
	  public void assign()
	  {
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			Cells[i][j].assignNeighbours(i,j,Cells);
		}
	  }
	  
	  
	
	public void decide(Cellgame c)
	{    
		
     for(int i=0;i<m;i++)
      {
  	  for(int j=0;j<n;j++)
  	  Cells[i][j].setliveNeighbours();  
      }
		
		
		
     
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 //System.out.println("Cells["+i+"]["+j+"]");	
			
			 char o=Cells[i][j].getlifesymbol();
			 //System.out.println(o+"     "+Cells[i][j].liveNeighbours);
			  
			 if(o=='*')
			 {
				/* if(Cells[i][j].liveNeighbours==2 || Cells[i][j].liveNeighbours==3)
				 { 
					 //System.out.println("* on *");
					 Cells[i][j].setlifesymbol('*');
				 }*/
				 
				  if(Cells[i][j].liveNeighbours>=4 || Cells[i][j].liveNeighbours<=1)
				 {
					 //System.out.println("- on *");
					 Cells[i][j].setlifesymbol('-');
				 }
				 
			 }
			 
			 if(o=='-')
			 {
				 if(Cells[i][j].liveNeighbours==3)
				 {
				 //System.out.println("* on -");
				 Cells[i][j].setlifesymbol('*');
				 }
				 
				 /*else if(Cells[i][j].liveNeighbours<=2 || Cells[i][j].liveNeighbours>=4)
				 {
					// System.out.println("- on -");
					 Cells[i][j].setlifesymbol('-');
				 }*/
			 }
			}
		}
		c.assign();
	}
	
	public void show()
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
			 System.out.print(Cells[i][j].getlifesymbol()+"  ");	
			}
		System.out.println();
		}
	}
	
	
	
	
	}	


