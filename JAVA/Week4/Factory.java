/*
 * 팩토리얼 기능의 프로그램
 */
import java.util.Scanner;
public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("팩토리얼 연산할 수를 입력하세요: ");
		int input = scan.nextInt();
		System.out.println(input + "! = " + factorial(input));
	}
	
	static int factorial(int i) {
		if(i == 1) return i;
		return i * factorial(i - 1);
	}
}
