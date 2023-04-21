package str;

public class Ex01 {
	public static void main(String[] args) {
		String s = new String();
		s = "abcd";
		System.out.println(s);
		
		s = s.toUpperCase(); // 대문자로 변환
		System.out.println(s);
		System.out.println(s.toLowerCase()); // 소문자로 변환
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		
		char ch = s.charAt(0);
	}
}
