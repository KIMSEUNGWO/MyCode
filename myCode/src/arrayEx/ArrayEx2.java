package arrayEx;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 배열을 생성
		int[] score = {90, 5, 10};
		int sum = 0;
		String[] strArray = {"가나다","라마바","사아자"};
		// 반복문을 이용해서 배열에 입력된 값을 출력
		for (int i = 0;i<strArray.length;i++) {
			System.out.println(score[i] + " : " + strArray[i]);
			sum += score[i];
		}
		System.out.println("평균 : " + sum/score.length);
		
	
	}
}
