package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		long start, end;
		start = System.currentTimeMillis();
		List<Integer> l = new ArrayList<>();
		for(int i = 0 ; i < 1000000 ; i++) {
			l.add(i);
		}		
		end = System.currentTimeMillis();
		System.out.println(end-start);
		
		
		start = System.currentTimeMillis();
		List<Integer> l2 = new LinkedList<>();
		for(int i = 0 ; i < 1000000 ; i++) {
			l2.add(i);
		}		
		end = System.currentTimeMillis();
		System.out.println(end-start);
	}
}
