/*
 * 입력값 n에 대한 n*n 크기의 배열을 생성하시오.
 */
import java.util.Iterator;
import java.util.Scanner;
public class NumberMap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int[] arr = new int[input*input]; // 배열 생성 및 길이 지정

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			if (arr[i] / 10 == 0) {
				System.out.print(arr[i] + "  ");
				if (arr[i] % input == 0) {
					System.out.println();
				}
			} else {
				System.out.print(arr[i] + " ");
				if (arr[i] % input == 0) {
					System.out.println();
				}
			}
		}
	}
	
}
