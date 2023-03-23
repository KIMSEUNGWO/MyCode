package arrayEx;

public class ArrayEx6 {

	public static void main(String[] args) {
		
		// 2차원 배열 
		// 타입[][] 변수명 = 타입[행][열];
		
		int[][] scores = new int[3][3];
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {4,5,6};
		scores[2] = new int[] {7,8,9};
		
		System.out.println("scores.length : " + scores.length);
		System.out.println("scores.length[0] : " + scores[0].length);
		System.out.println("scores.length[1] : " + scores[1].length);
		// 변수이름[행][열]
		System.out.println("scores[0][0] : " + scores[0][0]);
		
		for (int i = 0; i<scores.length; i++) {
			int[] points = scores[i];
			for (int j=0; j<scores.length; j++) {
				System.out.printf("(%d,%d) = %d\n", i, j, points[j]);
			}
		}
	}
}
