package shake_n_bacon;

import java.util.*;

public class TestHarness {

	public static void main(String[] args) {
		//StringComparator TEST
		StringComparator sc = new StringComparator();
		
		String test = "abcdefghijklmnopqrstuvwxyz";
		
		boolean exact = true;
		
		for(int i = 0; i < 10000; i ++) {
			String t1 = "";
			String t2 = "";
			
			for(int j = 0; j < 10; j ++) {
				Random r = new Random();
				char c1 = test.charAt(r.nextInt(26));
				char c2 = test.charAt(r.nextInt(26));
				
				t1 = t1 + c1;
				t2 = t2 + c2;
			}
			
			if(sc.compare(t1, t2) != t1.compareTo(t2))
				exact = false;
		}
		
		System.out.println(exact);
	}
}
