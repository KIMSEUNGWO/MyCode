package arrayEx;

public class ArrayindexOutOfBoundsEx {
	
	

	public static void main(String[] args) {
		
		// 1. 배열 선언후 생성하는 방법
		int[] score;
		score = new int[] {10,20,30};
		
		// 2. 배열 선언후 생성하는 방법
		// 값의 목록이 없지만 미리 배열을 만드는 경우
		// 타입[] 변수 = new 타입[길이]
		score = new int[10];
		
		// int sum = score[3]; ← 오류발생 길이초과 (java.lang.ArrayIndexOutOfBoundsException)
		
		
		// ============= for문을 이용한 배열의 확장 ==============
		int[] oldIntArray = {1,2,3};
		int[] newIntArray = new int[5];
		
		for (int i = 0;i<oldIntArray.length;i++) {
			newIntArray[i] = oldIntArray[i];
		}
//		
//		for (int i = 0;i<newIntArray.length;i++) {
//			System.out.println(newIntArray[i]);
//		}
		
		// ============== System.arraycopy를 이용한 배열의 확장 =================
		// System.arraycopy(원본배열, 원본배열의 시작인덱스, 새배열, 새배열의 시작인덱스, 복사할 개수)
		// 인덱스는 개수가 아니고 0,1,2 로 시작하는 인덱스를 말하는것임.
		
		System.arraycopy(oldIntArray, 1, newIntArray, 2, 2);
		for (int i = 0;i<newIntArray.length;i++) {
		System.out.println(newIntArray[i]);
		}
		
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 2, oldStrArray.length);
		for (int i = 0;i<newStrArray.length;i++) {
		System.out.print(newStrArray[i] + ", ");
		
		// ===========향상된 for 문============
		int[] scores1 = {95, 71, 84, 93, 87};
		
		int sum1 = 0;
		for (int score1 : scores1) {
			sum1 += score1;
		}
		System.out.println("점수총합 : " + sum1);
		
		double avg = (double) sum1 / scores1.length;
		System.out.println("점수평균 : " + avg);
		
		int[][] a = new int[2][3];
		System.out.println(a.length);
	}
		
	}
}
