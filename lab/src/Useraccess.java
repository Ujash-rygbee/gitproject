

	import java.util.Scanner;
	public class Useraccess {
		
	      private String message[]=new String[2000];
		  private int j=0;         
		  private User Users[];
		  private chatroom cr;
		  
		   public void startChatConversation()
		  {
			int x=0;
			Scanner b=new Scanner(System.in);
			System.out.println("Start");
	        Scanner a;
			while(x!=1)
			{
				 message[j]=b.nextLine();
	             a=new Scanner(message[0]);  
	             while(a.hasNext())
	            	  {
	            		String h=a.next();
	            	    if(h.equalsIgnoreCase(message[j]))
	            	    {	
	            	     x++;
	            	     }
	            	  }
	             j++;
	           }
			
		  }
		   
		   
		  
		  public void constructuserbynames()
		  {
			   int u=0;
			   String z;
			   Scanner t;
			   t=new Scanner(message[0]);
			   
			   char me[]=new char[message[0].length()];
	           for(int i=0;i<me.length;i++)
				  {
					  me[i]=message[0].charAt(i);
				      if(me[i]==' ')
				      {
				    	  u++;
				      }
				  }
	           
			  int v=0;
			  Users=new User[u+1];
			  t=new Scanner(message[0]);
			  while(t.hasNext())
			  {
				  Users[v]=new User(cr);
				  z=t.next(); 
				  Users[v].setName(z);
				  v++;
			  }
			 
			 }
		  
		
		  public void sendData()
		  {
			  for(int i=1;i<j-1;i++)
			  { 
	   			  Scanner b=new Scanner(message[i]);
				  String z=b.next();
				  String y=b.next();
				  String x=b.nextLine();
				  
				  String u=y.substring(0,y.length()-1);
				  
				  for(int a=0;a<Users.length;a++)
				  {
					 if(z.endsWith(Users[a].getName()))
					 {
						 Users[a].givenMessage(y+x);
					 }
					 if(u.endsWith(Users[a].getName()))
					 {
						 Users[a].receivedMessage(z+":"+x);
					 }
				  }
				}
		  }
		  
		  public void giveData()
		  {
			  for(int i=0;i<Users.length;i++)
			  {
				  if(Users[i].getName().endsWith(message[j-1]))
				  {
					  Users[i].printMessagesbyOrder();
				  }
			  }
		   }
		  
		

	   }


