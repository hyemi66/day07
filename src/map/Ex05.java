package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> menu = new HashMap<>();
		int num,price,index=1;
		String name=null;
		while(true) {
			System.out.println("1. 메뉴등록");
			System.out.println("2. 메뉴별 가격보기");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if (num==1) {
				System.out.print("메뉴이름 : ");
				name = sc.next();
				System.out.print(name+"의 가격 : ");
				price = sc.nextInt();
				if (menu.containsKey(name)) {
					System.out.println("중복된 메뉴입니다");
				} else { menu.put(name, price); }
				System.out.println("메뉴등록");
			}
			else if (num==2) {
				Iterator<String> menuIt = menu.keySet().iterator();
				if (!menuIt.hasNext()) {
					System.out.println("메뉴등록부터 해주세요");
				}
				else {
					while(true) {
						for (index=1;menuIt.hasNext();) {
							String key = menuIt.next();
							System.out.println(index+"."+key+" : "+menu.get(key)+"원");
							index++;
						}
						System.out.println("1.수정 2.삭제 3.나가기");
						System.out.print(">>> ");
						num = sc.nextInt();
						if (num==1) {
							System.out.print("수정할 가격 메뉴이름 : ");
							name = sc.next();
							if (menu.get(name)==null) {
								System.out.println("없는 메뉴입니다");
							} else {
								System.out.print("수정할 가격금액 : ");
								price = sc.nextInt();								menu.put(name, price);
								System.out.println("수정완료");
							}
						}
						else if (num==2) {
							System.out.print("삭제할 메뉴이름 : ");
							name = sc.next();
							if (menu.get(name)==null) {
								System.out.println("없는 메뉴입니다");
							} else {
								menu.remove(name);
								System.out.println("삭제완료");
							}
						}
						else if (num==3) { break; }
						else { System.out.println("다시선택"); }
					}
				}
				System.out.println("메뉴별 가격보기");
			}
			else if (num==3) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
		} 
	}
}
