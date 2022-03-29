/*
 * 반지름의 값을 입력받아 각각의 값을 도출해내라.
 */
import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double half;
		double v, s;
		double pi = Math.PI;
		
		half = scan.nextDouble();
		
		v = (4/3)*(pi*(half*half*half));
		s = 4*(pi*(half*half));
		
		System.out.println(v);
		System.out.println(s);
	}

}
