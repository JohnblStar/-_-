/*
 * 입력받은 문장을 반전출력하는 프로그램
 */
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("반전할 문자열을 입력하세요: ");
		String input = scan.next();
		System.out.println("반전된 문자열: " + reverseStr(input));
		
	}
	static String reverseStr(String i) {
		String result = "";
		char[] arr = new char[i.length()];
		for (int j = arr.length-1; j >= 0 ; j--) {
			arr[j] += i.charAt(j);
			result += arr[j];
		}
		return result;
		
	}
}
