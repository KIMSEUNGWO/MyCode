package arrayEx;

public class Array8 {

	public static void main(String[] args) {
		int[][] scores = new int[2][];
		
		scores[0] = new int[] {1,2,3};
		scores[1] = new int[] {1,2};
		
		for (int i =0;i<scores.length;i++) {
			System.out.println("방번호" + i);
			System.out.println("int배열의 길이" + scores[i].length);
			int[] points = scores[i];
			
			for (int j=0;j<points.length;j++) {
				System.out.printf("(%d, %d)", i, j);
				System.out.println(points[j]);
				System.out.println(scores[i][j]);
			}
		}
	}
}
