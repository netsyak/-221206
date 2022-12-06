import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("두자리 정수를 하나 입력해주세요.>");
		String input = scanner.nextLine();// 넥스트라인- 문자열을 입력받는 것
		//String input = scanner.next(); 넥스트- 빈공간 전까지 문자열을 입력받는다
		//int input = scanner.nextInt(); //정수만 받는다.
		//double input = scanner.nextDouble(); 실수 값을 받기에 정수 값도 포함하여 진행가능
		//char input = scanner.next().charAt(0);  //next는 문자 1개만 받음. 추가 charAt(0); 로 별도로 여러 문자중 제일 앞에 것만 출력가능
		scanner.close();

		int num = Integer.parseInt(input);

		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d\n", num);
	}
}
