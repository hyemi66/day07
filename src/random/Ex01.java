package random;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Ex01 {
	public static void main(String[] args) {
//		System.out.println(Math.random());
//		
//		for(int i=0; i<5; i++) {
//			double ran = Math.random();
//			System.out.println((int)(ran*45)+1);
//		}
		
		// 문제05
		// ArrayList 방식
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i=0; i<6; i++) {
			double ran = Math.random();
			arr.add((int)(ran*6)+1);
		}
		System.out.println(arr);
		
		// HashSet 방식
		HashSet<Integer> hs = new HashSet<>();
		
		
		// HashMap 방식
		HashMap<Integer, Integer> hm = new HashMap<>();
		
	}
}
