/*
 * 입력받은 값을 각 자릿수마다 더해서 결과값을 출력하라.
 */
import java.util.Scanner;
public class CutNumber {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int input;
		int result = 0;
		input = scan.nextInt();
		int count = (int)( Math.log10(input)+1);
		int[] arr = new int[count];
		int i = 0;
		
		if (input > 0 && input < 2100000000) {
			while (input > 0) {
				arr[i] = input % 10;
				input = input / 10;
				result = result + arr[i];
				i++;
			}
			while(count > 0) {
				if (count > 1) {
					System.out.print(arr[count-1] + "+");

				} else {
					System.out.print(arr[count-1]);
				}
				count--;
			}
			System.out.print("=" + result);
		} else {
			System.out.println("입력값을 확인하세요!");
		}
	}

}
