package sem3;

public class main3b {

	public static void main(String[] args) 
	{
		stack_reverse sq=new stack_reverse(6);
		sq.s1.push(1);
		sq.s1.push(2);
		sq.s1.push(3);
		sq.s1.push(6);
		sq.s1.push(4);
		sq.s1.push(5);
		
		sq.s1.show();
		sq.reverse(1,5);
		sq.s1.show();

	}

}
