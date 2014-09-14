package lab;

import java.io.IOException;


public class main {

	public static void main(String[] args) throws IOException{
     residentAccess m=new residentAccess();
     m.readData();
     m.find_howmany_elder();
     System.out.println();
     m.find_eldest();
     System.out.println();
     System.out.println();
     m.findbyaddress();
     
	}
}
