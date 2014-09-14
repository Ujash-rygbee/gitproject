
public class chatroom {

	private final  int MAX_LENGTH=1000;
	private int totalchats=0;
	private String Stringchat[]=new String[MAX_LENGTH];
	
    public void receiveUserChat(String x)
    {
    	Stringchat[totalchats]=x;
    	++totalchats;
    }
    
    public void printlog()
    {
    	for(int i=0;i<totalchats;i++)
    	{
    		System.out.println(Stringchat[i]);
    	}
    }
}
