package map;

import java.util.HashMap;

public class Ex02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("선풍기","100만원");
		map.put("에어컨","50만원");
		map.put("자동차","10만원");
		
		System.out.println(map);
		// containsKey() : 해당하는 키가 있는지 없는지 확인용
		System.out.println("결과 : "+map.containsKey("자동차"));
		// containsValue() : 해당하는 값이 있는지 없는지 확인용
		System.out.println("결과 : "+map.containsValue("50만원"));
		
		map.put("선풍기1","100만원");
		map.put("자동차","1000만원"); // 키가 중복되면 값만 변경됨
		System.out.println(map);
		
		map.remove("선풍기1"); // remove : 삭제기능
		System.out.println(map);
	}
}
