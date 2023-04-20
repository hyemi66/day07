package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 로그인
		Scanner sc = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		String[] id = new String[5];
		String[] pwd = new String[5];
		String inputId = null, inputPwd = null, na,ph;
		int num, index=0, count=0;
		while (true) {
			System.out.println("=== 로그인 ===");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			num = sc.nextInt();
			if (num==1) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				for (index=0; index<id.length; index++) {
					if (inputId.equals(id[index])) {
						if (inputPwd.equals(pwd[index])) {
							System.out.println("로그인 성공");
							while (true) {
								System.out.println("1. 연락처등록");
								System.out.println("2. 연락처보기");
								System.out.println("3. 연락처삭제");
								System.out.println("4. 모든 연락처보기");
								System.out.println("5. 로그아웃");
								System.out.print(">>> ");
								num = sc.nextInt();
								if (num==1) {
									System.out.println("연락처등록");
								}
								else if (num==2) {
									System.out.println("연락처보기");
								}
								else if (num==3) {
									System.out.println("연락처삭제");
								}
								else if (num==4) {
									System.out.println("모든 연락처보기");
								}
								else if(num==5) {
									System.out.println("로그아웃");
								}
								else {
									System.out.println("다시선택");
								}
							}
						}
						else { System.out.println("비밀번호 틀림"); }
						break;
					}
				}
				if (index == id.length) {
					System.out.println("존재하지않는 아이디입니다");
					System.out.println("회원가입 먼저 진행해주세요");
				}
				System.out.println("로그인");
			}
			else if (num==2) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				if (count<id.length) {
					for (index=0; index<count; index++) {
						if (inputId.equals(id[index])) {
							System.out.println("존재하는 아이디입니다.");
							break;
						}
					}
					if (index == count) {
						id[count] = inputId;
						pwd[count] = inputPwd;
						count++;
						System.out.println("회원가입 완료");
					}
				} else {
					System.out.println("저장공간부족");
				}
				System.out.println("회원가입");
			}
			else if (num==3) { System.out.println("나가기"); break; }
			else { System.out.println("다시 선택"); }
		}
	}
}
