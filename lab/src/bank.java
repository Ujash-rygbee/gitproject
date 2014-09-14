import java.util.Scanner;
public class bank {
	
	public static void main(String[] args)
	{
	bankbalance b=new bankbalance();
	Scanner scan=new Scanner(System.in);
	int x=scan.nextInt();
	b.setbalance(scan.nextDouble());
	b.withdraw(x);
	scan.close();
	 
	 
	}

}
