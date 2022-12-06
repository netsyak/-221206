public class OperatorExample4 {
	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = "JDK";
		
		String str3 = str1 + str2;
		String str4 = str1 + " " + str2;
		
		String str5 = "JDK" + 3 + 3.0 + 2; // 문자열로 시작연산이 되면 모두 문자열 식
		String str6 = 3 + 3.0 + "JDK"; // 실수끼리 더하기 연산이 되어 합산 후 나머지 문자열이 붙어진다. 
		String str7 = 3 + "JDK" + 3.0;// 
				
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str7);
		
		
	}
}
