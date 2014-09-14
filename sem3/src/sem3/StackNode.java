package sem3;

public class StackNode
{
   private Node top=null;
    
   public void push(int data)
   {
	   Node newnode=new Node(data);
	   newnode.setNext(top);
	   top=newnode;
	   System.out.println("pushed is "+top.getData());
	}
   
   public Node pop()
   {
	   Node foo=new Node(0);
	   if(!(this.isEmpty()))
	   {	   
	    foo=new Node(top.getData());
	   top=top.getNext();
	   System.out.println("popped is "+foo.getData());
	   }
	   
	   else
		   System.out.println("empty");
		   
	   return foo;
   }
   
   
   public boolean isEmpty()
   {
	   return top==null;
	   
	   
   }




}
