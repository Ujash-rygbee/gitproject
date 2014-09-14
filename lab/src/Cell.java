
public class Cell {

	public Cell Neighbours[];
	private char lifesymbol;
	int liveNeighbours;
	
	
	public void setlifesymbol(char x)
	{
		this.lifesymbol=x;
	}
	
	public void assignNeighbours(int x,int y,Cell k[][])
	{
	  int m=k.length;
	  int n=k[0].length;
      if(m>1 && n>1)
      {
	   if(x==0 && y==0)
		{
			    Neighbours=new Cell[3];
		        Neighbours[0]=k[1][1];
				Neighbours[1]=k[0][1];
				Neighbours[2]=k[1][0];
		}
		
		else if(x==m-1 && y==0)
		{
			Neighbours=new Cell[3];
			Neighbours[0]=k[m-1][1];
			Neighbours[1]=k[m-2][1];
			Neighbours[2]=k[m-2][0];
		}
		
		else if(x==m-1 && y==n-1)
		{
			//System.out.println("done 3");
			Neighbours=new Cell[3];
			Neighbours[0]=k[m-1][n-2];
			Neighbours[1]=k[m-2][n-1];
			Neighbours[2]=k[m-2][n-2];
		}
		
		else if(x==0 && y==n-1)
		{
			//System.out.println("done 4");
			Neighbours=new Cell[3];
			Neighbours[0]=k[0][n-2];
			Neighbours[1]=k[1][n-2];
			Neighbours[2]=k[1][n-1];
		}
		
		   else if(x<=m-2 && x>0 && y==0)
	    	{
			    //System.out.println("done 5");
                Neighbours=new Cell[5];
				Neighbours[0]=k[x-1][0];
				Neighbours[1]=k[x+1][0];
				Neighbours[2]=k[x-1][1];
				Neighbours[3]=k[x][1];
				Neighbours[4]=k[x+1][1];
			}
		
		   else if(x==m-1 && y<=n-2 && y>0)
		   {
			   //System.out.println("done6");
			   Neighbours=new Cell[5];
			   Neighbours[0]=k[m-1][y-1];
			   Neighbours[1]=k[m-1][y+1];
			   Neighbours[2]=k[m-2][y-1];
			   Neighbours[3]=k[m-2][y];
			   Neighbours[4]=k[m-2][y+1];
		   }
		 
		   else if(x<=m-2 && x>0 && y==n-1)
		   {
			   //System.out.println("done7");
			   Neighbours=new Cell[5];
			   Neighbours[0]=k[x-1][n-1];
			   Neighbours[1]=k[x+1][n-1];
			   Neighbours[2]=k[x-1][n-2];
			   Neighbours[3]=k[x][n-2];
			   Neighbours[4]=k[x+1][n-2];
		   }
		
		   else if(x==0 && y<=n-2 && y>0)
		     {
			   //System.out.println("done 8");
			    Neighbours=new Cell[5];
				Neighbours[0]=k[0][y-1];
				Neighbours[1]=k[0][y+1];
				Neighbours[2]=k[1][y-1];
				Neighbours[3]=k[1][y];
				Neighbours[4]=k[1][y+1];
		     }
		
		   else 
		   {
			   //System.out.println("done 9");
			   Neighbours=new Cell[8];
			   Neighbours[0]=k[x][y-1];
			   Neighbours[1]=k[x][y+1];
			   Neighbours[2]=k[x-1][y-1];
			   Neighbours[3]=k[x-1][y];
			   Neighbours[4]=k[x-1][y+1];
			   Neighbours[5]=k[x+1][y-1];
			   Neighbours[6]=k[x+1][y];
			   Neighbours[7]=k[x+1][y+1];
		   }
      }
      else  if(m==1 && n>1)
      {
    	  if(x==0 && y==0)
    	  {
    		  Neighbours=new Cell[1];
    		  Neighbours[0]=k[0][1];
    	  }
    	  
    	  else if(x==0 && y==n-1)
    	  {
    		  Neighbours=new Cell[1];
    		  Neighbours[0]=k[0][n-2];
    	   }
    	  
    	  else if(x==0 && y<=n-2 && y>0)
    	  {
    		  Neighbours=new Cell[2];
    		  Neighbours[0]=k[0][y-1];
    		  Neighbours[1]=k[0][y+1];
    	  }
      
      }
      
      else if(m==1 && n==1)
      {
    	  if(x==0 && y==0)
  		  Neighbours=new Cell[0];
       }
      
      
	   }
	
	  public char getlifesymbol()
	  {
		return this.lifesymbol;
	   }
	
	 public void setliveNeighbours()
	 {
		int a=0;
		for(int i=0;i<Neighbours.length;i++)
		{
			char o=Neighbours[i].getlifesymbol();
			if(o=='*')
			{
				a++;
			}
		}
		liveNeighbours=a;
	 }
	
	
}
       