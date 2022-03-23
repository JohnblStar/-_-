import java.util.Scanner;

public class Baekjoon_2588 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 472
		// 385
		System.out.print("첫번째 숫자를 입력하시오.(세자리수 제한) : ");
		int a = scan.nextInt();
		System.out.print("두번째 숫자를 입력하시오.(세자리수 제한) : ");
		int b = scan.nextInt();
		
		int firstAnser, secondAnser, thirdAnser, finalAnser;
		
		firstAnser = a * (b % 10);
		secondAnser = a * ((b / 10) % 10);
		thirdAnser = (a * (b / 10 /10));
		
		finalAnser = firstAnser + (secondAnser * 10) + (thirdAnser * 100);
		
		System.out.println();
	
		System.out.println("첫번째 인자값");
		System.out.println(a);
		
		System.out.println("두번째 인자값");
		System.out.println(b);
		
		System.out.println("---------------------");
		
		
		System.out.println("결과값은?!");
		System.out.println(firstAnser);
		System.out.println(secondAnser);
		System.out.println(thirdAnser);
		System.out.println(finalAnser);
	}

}
