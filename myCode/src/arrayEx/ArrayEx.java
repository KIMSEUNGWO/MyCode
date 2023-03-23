package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열 - 같은 타입의 데이터를 연속된 공간에 나열하고, 각 데이터에 인덱스를 부여한 자료구조
		// 한번 생성된 배열은 길이를 줄이거나 늘릴 수 없음 / 보통 변수뒤에 Array나 Arr 을 넣어줌
		
		// 배열의 선언
		// 타입[] 변수; 또는 타입 변수[];
		
		int[] score = {90, 80, 60, 85, 50, 60, 70, 55, 99, 80};
		// int score[];
		// 배열의 값을 참조 하는 방법
		// 변수이름[index]
		int sum = 0;
		for (int i=0;i<score.length;i++) {
			sum += score[i];
//			System.out.println(score[i]);
		}
		System.out.println("점수 총 합계 : " + sum);
		System.out.println("평균 : " + sum/score.length);
		
		
	}
}
