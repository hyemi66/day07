package str;

import java.util.ArrayList;

public class Ex04 {
	public static void main(String[] args) {
		// 문제01
		String a = "Have a nice day Have a nice day Have a nice day";
		String[] aa = a.split("");
		ArrayList<String> num = new ArrayList<>();
		for (int i=0; i<aa.length; i++) {
			if(aa[i].equals("a")) {
				num.add(i+"");
			}
		}
		System.out.println(num);
		
		// 문제02
		String b = "It is a fun java programming";
		int count01=0,count02=0;
		String[] bb = b.split("");
		for (int i=0; i<bb.length; i++) {
			if (bb[i].equals("a")) { count01++; }
			if (bb[i].equals("g")) { count02++; }
		}
		System.out.println("총 개수 : "+bb.length);
		System.out.println("a 개수 : "+count01);
		System.out.println("b 개수 : "+count02);
		
		// 문제03
		String str = new String("tESt  sTring   change  first");
		System.out.println("변경 전 : "+str);
		String changeStr = new String();
		String[] cc = str.split("");
		String[] cc1 = new String[str.length()];
		for (int i=0; i<cc.length; i++) {
			if (cc[i]!=" ") {
				cc[i].toLowerCase();
				
			}
		}
		System.out.println("변경 후 : "+changeStr);
		
		// 문제04
		String str2 = "김개똥-2017년\n홍길동구리-2015년\n선우선녀-2018년";
		System.out.println("====변경전 str2====");
		System.out.println(str2);
		str2 = str2.replace("-", ":");
		str2 = str2.replace("2017", "1999");
		str2 = str2.replace("2015", "1999");
		str2 = str2.replace("2018", "1999");
		System.out.println("====변경후 str2====");
		System.out.println(str2);
	}
}
