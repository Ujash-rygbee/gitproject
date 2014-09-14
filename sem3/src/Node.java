
public class Node
{
   public int key;
   private Node previous;
   private Node Next;
   
   public Node getPrevious()
   {
	return previous;
    }

  public void setPrevious(Node previous)
  {
	this.previous = previous;
  }

  public Node getNext() 
  {
	return Next;
  }

  public void setNext(Node next) 
  {
	Next = next;
   }

  public Node(int x)
   {
	   this.key=x;
	   this.Next=null;
	   
   }
   
   
   
   
	
	
	
}
