package str;

public class Ex03 {
	public static void main(String[] args) {
		String id = "test           ";
		id = id.trim(); // 양쪽 공백을 지워준다. 일회성으로 다른 변수에 다시 저장해야함
		System.out.println(id+"!");
		if (id.equals("test")) {
			System.out.println("인증통과");
		} else {
			System.out.println("인증실패");
		}
		String addr = "우편번호/주소/상세주소";
		String[] s = addr.split("/");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		
		System.out.println("addr : "+addr);
		addr = addr.replace("/", "=");
		System.out.println("addr : "+addr);
	}
}
