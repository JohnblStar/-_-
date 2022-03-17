import java.util.Scanner;

public class Baekjoon_10430 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int result1;
		int result2;
		int result3;
		int result4;		
		
		result1 = (a+b)%c;
		result2 = ((a%c) + (b%c))%c;
		result3 = (a*b)%c;
		result4 = ((a%c)*(b%c))%c;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
	}

}
