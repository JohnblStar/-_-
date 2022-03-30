 * 문자열을 입력받아 문자열 속 모음의 개수와 단어의 개수를 출력하시오.
 * pen pineapple apple pen
 */
import java.util.Scanner;
public class BlankCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String input = scan.nextLine();
		char[] arr = new char[input.length()];
		int countMo = 0;
		int countBlank = 1;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.charAt(i);
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'i' || arr[i] == 'a' || arr[i] == 'o' || arr[i] == 'e' || arr[i] == 'u') {
				countMo++;
			}
			if (arr[i] == ' ') {
				countBlank++;
			}
		}
		System.out.println("모음의 개수는" + countMo + ", 단어의 개수는" + countBlank + "입니다.");
	}
}
