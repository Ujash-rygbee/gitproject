
public class linkedlist
{
   private Node first;
   private Node tail;
   
   
   public linkedlist()
   {
    first=null;
    tail=null;
   }
   
   public void add(int x)
   {
	   Node foo=null;
	   Node newnode=new Node(x);
	   if(first==null && tail==null)
	   {
		   newnode.setPrevious(first);
		   newnode.setNext(tail);
		   first=newnode;
		   tail=newnode;
		   
		}
	   
	   else
	   {
		   newnode.setPrevious(tail);
		   newnode.setNext(foo);
		   tail.setNext(newnode);
		   tail=newnode;
		   
		   
		   
	   }
	   
	   
	   
	   
   }
   
   
   public Node getFirst() {
	return first;
}

public void setFirst(Node first) {
	this.first = first;
}

public Node getTail() {
	return tail;
}

public void setTail(Node tail) {
	this.tail = tail;
}

public void show()
   {
	   Node current=first;
	   while(current!=null)
	   {
		   
		   System.out.print(current.key+"  ");
		   current=current.getNext();
		   
	   }
		   
	}
   
   
   public int delete(int a)
   {
	   int x=0;
	   
	   Node current=first;
	   while(current.key!=a && current!=null)
	   {
		   
		   current=current.getNext();
		   
		   
	   }
	   
	   
	   if(current.key==a && current.key!=first.key && current.key!=tail.key)
	   {
		   Node currentNext=current.getNext();
		   Node currentPrevious=current.getPrevious();
		   currentPrevious.setNext(currentNext);
		   currentNext.setPrevious(currentPrevious);
		   
		   
		   x=current.key;
		   return x;
	   }
	   
	   else if(current.key==first.key)
	   {
		   x=first.key;
		   first=first.getNext();
		   first.setPrevious(null);
		   return x;
		   
	   }
	   
	   else if(current.key==tail.key)
	   {
		   x=tail.key;
		   tail=tail.getPrevious();
		   tail.setNext(null);
		   return x;
	   }
		   
		   
	   
	   else
	   {
		   System.out.println("key not found");
		   return x;
		   
		   
	   }
	   
	   
	   
	   
   }
   




}
