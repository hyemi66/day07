package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		// switch이용
		Scanner sc = new Scanner(System.in);
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		int num, index=0;
		String inputId=null, inputPwd=null;
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			switch(num) {
			case 1 : 
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				if (id.size()==0) {
					System.out.println("회원가입부터 진행해주세요");
				} else {
					index = id.indexOf(inputId);
					if (id.get(index)==pwd.get(index)) {
						System.out.println("인증완료");
					} else {
						System.out.println("아이디나 비밀번호가 틀렸습니다");
					}
				}
				
				
				System.out.println("로그인"); break;
			case 2 : 
				
				
				
				System.out.println("회원가입"); break;
			case 3 : 
				System.out.println("나가기");
				System.exit(1);
			}
		}
	}
}
