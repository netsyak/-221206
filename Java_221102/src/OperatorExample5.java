
public class OperatorExample5 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A'; // 아스키 65
		char char2 = 'B'; // 아스키 66
		boolean result4 = (char1 < char2); // 65 < 66  으로 판단하게됨
		System.out.println("result4 : " + result4);
		
	}

}
