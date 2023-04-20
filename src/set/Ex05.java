package set;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		// 로그인받아 연락처 저장하기
		Scanner sc = new Scanner(System.in);
		ArrayList<String> id = new ArrayList<>();
		ArrayList<String> pwd = new ArrayList<>();
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> phone = new ArrayList<>();
		int num, index=0;
		String inputId = null, inputPwd = null, na, ph;
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
				index = id.indexOf(inputId);
				if (id.size()==0) {
					System.out.println("회원가입 먼저 진행해주세요");
				}
				else {
					if (id.indexOf(inputId)==pwd.indexOf(inputPwd)) {
						System.out.println("로그인되셨습니다");
						while (true) {
							System.out.println("=== 연락처 등록 ===");
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
									System.out.println("중복");
								} else {
									name.add(na);
									phone.add(ph);
									System.out.println("등록완료");
								}
								System.out.println("연락처등록");
							}
							else if (num==2) {
								System.out.print("이름 입력 : ");
								na = sc.next();
								boolean bool03 = name.contains(na);
								if (!bool03) {
									System.out.println("목록에 없습니다");
								} else {
									index = name.indexOf(na);
									System.out.println(na+"님의 연락처 : "+phone.get(index));
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
									System.out.println("삭제되었습니다.");
								}
								System.out.println("연락처삭제");
							}
							else if (num==4) {
								for (index=0; index<name.size(); index++) {
									System.out.println((index+1)+". 이름 : "+name.get(index));
									System.out.println("   전화번호 : "+phone.get(index));
								}
								System.out.println("모든 연락처보기");
							}
							else if (num==5) { System.out.println("로그아웃되셨습니다"); break; }
							else { System.out.println("다시 선택해주세요"); }
						}
					} else {
						System.out.println("틀렸습니다 다시 로그인해주세요");
					}
				}
				System.out.println("로그인");
			}
			else if (num==2) {
				System.out.print("아이디 : ");
				inputId = sc.next();
				System.out.print("비밀번호 : ");
				inputPwd = sc.next();
				
				id.add(inputId);
				pwd.add(inputPwd);
				System.out.println("회원가입 완료");
				System.out.println("회원가입");
			}
			else if (num==3) { System.out.println("나가기"); break; }
			else { System.out.println("번호를 다시 선택해주세요"); }
		}
	}
}
