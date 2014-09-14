
public class User {
	static int autoId=0;
	private int userId;
	private chatroom assignedchat;
    public  String name;
    private int max_Total_chats=1000;
    private int a,b,s=0;
    private String storerecievechat[]=new String[max_Total_chats];
    private String storechat[]=new String[max_Total_chats];
    private String chathistory[]=new String[2*max_Total_chats];
	
    
    User(chatroom x)
     {   
    	++autoId;
    	this.userId=autoId;
    	assignedchat=x;
     }
    
    public void receivedMessage(String x)
    {
    	storerecievechat[s]=x;
    	chathistory[b]=x;
    	s++;
    	b++;
    }
    
    
    public void givenMessage(String x)
    {
    	storechat[a]=x;
    	chathistory[b]=x;
    	a++;
    	b++;
    	
    }
    
    public void printallMessages()
    {
    	System.out.println(this.name+"'s chat history");
    	for(String x:chathistory)
    	{
    		System.out.println(x);
    	}
    		
    }
    
    
    public void printMessagesbyOrder()
    {
    	System.out.println();
    	System.out.println(this.name+"'s sent messages");
    	for(int i=0;i<a;i++)
    	{
    		System.out.println(storechat[i]);
    		
    	}
    	System.out.println();
    
    	
    	System.out.println(this.name+"'s recieved messages");
    	for(int i=0;i<s;i++)
    	{
    		System.out.println(storerecievechat[i]);
    		
    	}
    	
    }
    
    public void setName(String x)
    {
    	 this.name=x;
    }
    
    public String getName()
    {
    	return this.name;
    }

}
