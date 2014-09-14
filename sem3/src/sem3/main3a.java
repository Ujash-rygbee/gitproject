package sem3;

public class main3a {

	public static void main(String[] args) 
	{
		 Stack_elms_exchange sq=new Stack_elms_exchange(6);
			sq.s1.push(1);
			sq.s1.push(2);
			sq.s1.push(3);
			sq.s1.push(6);
			sq.s1.push(4);
			sq.s1.push(5);
			
			sq.s1.show();
			sq.ExchangeElements(1,6);

	}

}
