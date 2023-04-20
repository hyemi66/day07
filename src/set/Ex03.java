package set;

import java.util.HashSet;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<String> name = new HashSet<>();
		String n;
		while(true) {
			System.out.print("이름 입력 : ");
			n = sc.next();
			boolean bool = name.add(n);
			if(!bool) { // bool == false
				System.out.println("존재하는 이름입니다");
			} else {
				System.out.println("저장 완료");
			}
		}
	}
}
