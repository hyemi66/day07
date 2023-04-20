package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 문제
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		String na,ph;
		int num, index=0;
		while(true) {
			System.out.println("1. 연락처등록");
			System.out.println("2. 연락처보기");
			System.out.println("3. 연락처삭제");
			System.out.println("4. 모든 연락처보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if (num==1) {
				System.out.print("이름 입력 : ");
				na = sc.next();
				System.out.print("전화번호 입력 : ");
				ph = sc.next();
				boolean bool01 = name.contains(na);
				boolean bool02 = phone.contains(ph);
				if (bool01 || bool02) {
					System.out.println("중복입니다");
				} else {
					name.add(na);
					phone.add(ph);
					System.out.println("등록완료");
				}
			}      
			else if (num==2) {
				System.out.print("이름 입력 : ");
				na = sc.next();
				boolean bool03 = name.contains(na);
				if (!bool03) {
					System.out.println("목록에 없습니다");
				} else {
					index = name.indexOf(na);
					System.out.println("이름 : "+name.get(index));
					System.out.println("전화번호 : "+phone.get(index));
				}
				System.out.println("연락처보기");
			}
			else if (num==3) {
				System.out.print("이름 입력 : ");
				na = sc.next();
				boolean bool04 = name.contains(na);
				if (!bool04) {
					System.out.println("목록에 없습니다");
				} else {
					index = name.indexOf(na);
					name.remove(index);
					phone.remove(index);
				}
				System.out.println("연락처삭제");
			}
			else if (num==4) {
				System.out.println(name);
				System.out.println(phone);
				System.out.println("모든연락처보기");
			}
			else if(num==5) { System.out.println("종료"); break; }
			else { System.out.println("다시 번호 입력"); }
		}
	}
}
