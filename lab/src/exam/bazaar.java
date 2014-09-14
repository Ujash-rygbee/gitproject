package exam;
import java.io.*;

public class bazaar {

	public static void main(String[] args)throws IOException {
		shopkeeper s=new shopkeeper();
		s.get_Input("C:\\Users\\ujash\\Desktop\\bazz.txt",9,3);
        s.sort_veggies();
        s.store_veggies();
        s.put_into_bag();
	}

}
