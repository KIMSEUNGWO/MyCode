package board.jungang;

public class BoardMain {

	public static void main(String[] args) {

		Board[] arr = new Board[5];
		
		arr[0] = new Board("게시글1", "홍길동1");
		arr[1] = new Board("게시글2", "홍길동2");
		arr[2] = new Board("게시글3", "홍길동3");
		arr[3] = new Board("게시글4", "홍길동4");
		arr[4] = new Board("게시글5", "홍길동5");
		
		for (Board a : arr) {
			System.out.println(a.title);
			System.out.println(a.content);
		}
		
	}

}
