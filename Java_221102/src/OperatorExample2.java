
public class OperatorExample2 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz= x * y;
		long lz1 = (long)x * (long)y; // 타입변환이 사칙연산보다 우선 순위가된다.
		long lz2 = (long)(x * y); // 타입변환보다 사칙연산을 우선 시되어 int값으로 오버플로어가 됨
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
		
	}

}
