package arrayEx;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// 배열 항목의 최대값
		
		int max = 0;
		int[] array = {1,5,3,8,2};
		
		for (int i = 0; i<array.length;i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		
		System.out.println("max : " + max);
		
		// 항목의 합과 평균값
		
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int k = 0;
		
		for (int i = 0; i<array2.length;i++) {
			for (int j = 0; j<array2[i].length;j++) {
				System.out.printf("array2[%d][%d] = %d\n", i,j,array2[i][j]);
				sum += array2[i][j];
				k++;
			}
		}
		avg = (double) sum / k;
		
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		// 점수들을 입력받고 최고점수 및 평균점수 구하기
		
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		int sum2 = 0;
		
		while (true) {
			System.out.println("===============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("===============================================");
			System.out.print("선택> ");
			
			int selectNo = scan.nextInt();
			
			switch (selectNo) {
				case 1:
					System.out.print("학생수> ");
					studentNum = scan.nextInt();
					scores = new int[studentNum];
					break;
				case 2:
					if (studentNum == 0) {
						System.out.println("학생수를 설정하지 않았습니다.");
						break;
					}
					for (int i=0;i<scores.length;i++) {
						System.out.printf("scores[%d]> ", i);
						selectNo = scan.nextInt();
						scores[i] = selectNo;
						sum2 += scores[i];
					}
					break;
				case 3:
					for (int i=0;i<scores.length;i++) {
						System.out.printf("scores[%d]> %d\n", i, scores[i]);
					}
					break;
				case 4:
					System.out.println("최고 점수: " + sum2);
					System.out.println("최고 점수: " + (double)sum2/studentNum);
					break;
				case 5:
					scan.close();
					System.out.println("프로그램 종료");			
					System.exit(0);
					break;
			}
		}
	}
}
