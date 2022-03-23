import java.util.Scanner;

public class Baekjoon_2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if (h >= 0 && h <= 24) {
			
			if (m >= 0 && m <= 59 && h != 0 && (m-45) >= 0) {
				
				System.out.println(h + " " + (m-45));
				
			} else if(m >= 0 && m <= 59 && h != 0 && (m-45) < 0){
				
				System.out.println((h-1) + " " + (60-(45-m)));
				
			} else if(m >= 0 && m <= 59 && h == 0 && (m-45) >= 0){
				
				System.out.println((24-1) + " " + (m-45));
				
			} else if(m >= 0 && m <= 59 && h == 0 && (m-45) < 0){
				
				System.out.println((24-1) + " " + (60-(45-m)));
				
			} else {
				
				System.out.println("입력 시간을 확인해주세요.");
				
			}
			
		} else {
			
			System.out.println("입력 시간을 확인해주세요.");
			
		}
		
	}

}
