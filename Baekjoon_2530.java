import java.util.Scanner;
public class Baekjoon_2530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt(); //시
		int b = scan.nextInt(); //분
		int c = scan.nextInt(); //초
		int d = scan.nextInt(); //요리 시간
		
		b += d / 60; // 1분 = 60초
		c += d % 60; // 나머지 대입
		
		b += c / 60; // 60초 아래일 경우
		c = c % 60; //몫, 나머지 초 대입
		
		a += b / 60; //60분 아래일 경우
		b = b % 60; //몫, 나머지 분 대입
		
		a = a % 24; //시를 초과할 경우
		
		System.out.println(a + " " + b + " " + c);
	}

}
