/*
 * 사용자로부터 x, y좌표값을 입력받아 행렬에서 각각의 맞는 원소값을 찾아내는 프로그램
 */
import java.util.Scanner;
public class LineOfLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int inputNumStart = 0; // 행렬 설정 값
		System.out.print("만들고 싶은 행렬 원소 수를 작성하시오 : ");
		inputNumStart = scan.nextInt();
		
		int inputNumX = 0; // x값 입력
		int inputNumY = 0; // y값 입력
		int[][] arr = new int[inputNumStart][inputNumStart]; // 이중 배열 생성
		int count = 1; // 배열 원소값을 위한 변수
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = arr[i][j] + count; // 배열의 좌표 증가에 따라 1씩 증가된 원소값 넣기
				if (arr[i][j] < 10) { // 표 형태를 맞추기 위한 
					System.out.print(arr[i][j] + "  ");
				} else {
					System.out.print(arr[i][j] + " ");
				}
				count++;
			}
			System.out.println(); // 고성지 회장님 :  기초적으로 생각하기. (바깥쪽 루프가 한번 돌 때 입력값만큼 안쪽 루프가 돈다.)
		}
		
		System.out.println();
		System.out.print("찾고자 하는 배열의 x좌표를 입력하시오. : ");
		inputNumX = scan.nextInt();
		System.out.print("찾고자 하는 배열의 y좌표를 입력하시오. : ");
		inputNumY = scan.nextInt();
		
		System.out.println("입력 받은 x좌표 : " + inputNumX);
		System.out.println("입력 받은 y좌표 : " + inputNumY);
		System.out.println("----------------------------");
		System.out.println("찾은 원소값은? : " + arr[inputNumY-1][inputNumX-1]); // 배열의 주소값은 0부터 시작, 때문에 -1
		// 배열의 주소값은 이중 배열일 경우 앞자리가 행, 뒷자리가 열
		
	}

}
