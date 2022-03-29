/*
 * 사용자로부터 입력받은 값을 비트 반전 연산 하라.
 */
import java.util.Scanner;
public class ChangeBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a = 0;
		
		System.out.print("값을 입력하세요: ");
		a = scan.nextInt();
			
		
		System.out.println(toBinaryString(a));
	}

	private static String toBinaryString(int val) {
		String str = Integer.toBinaryString(val);
		return str;
	}

}
