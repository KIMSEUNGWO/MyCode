package board.jungang;

public class BoardEx {

	public static void main(String[] args) {
		// 게시글 생성
		Board[] boardList = new Board[5];
		for (int i=0;i<5;i++) {
			Board board = new Board("게시글"+i, "너무 어려워요", "홍길동"+1, "23-03-22", 10+i);
			boardList[i] = board;
			System.out.println("=============");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
		}
//		Board board1 = new Board("게시글1", "너무 어려워요", "홍길동", "23-03-22", 10);
//		Board board2 = new Board("게시글2", "너무 어려워요", "홍길동", "23-03-22", 10);
//		Board board3 = new Board("게시글3", "너무 어려워요", "홍길동", "23-03-22", 10);
//		Board board4 = new Board("게시글4", "너무 어려워요", "홍길동", "23-03-22", 10);
//		Board board5 = new Board("게시글5", "너무 어려워요", "홍길동", "23-03-22", 10);

		
		// 배열 생성
//		boardList[0] = board1;
//		boardList[1] = board2;
//		boardList[2] = board3;
//		boardList[3] = board4;
//		boardList[4] = board5;
		
//		System.out.println(boardList[0]);
//	
//		
//		// 게시글리스트 생성
////		BoardList list = new BoardList(boardList);
//
//		int[] intArr = new int[5];
//		
//		intArr[0] = 1;
//		intArr[1] = 2;
//		intArr[2] = 3;
//		intArr[3] = 4;
//		intArr[4] = 5;
//		
//		Board[] boardArr = new Board[5];
//		boardArr[0] = new Board("게시글1", "홍길동");
//		boardArr[1] = new Board("게시글2", "홍길동");
//		boardArr[2] = new Board("게시글3", "홍길동");
//		boardArr[3] = new Board("게시글4", "홍길동");
//		boardArr[4] = new Board("게시글5", "홍길동");
//		
//		for (Board a:boardArr) {
//			System.out.println("===============");
//			System.out.println(a.title);
//			System.out.println(a.content);
//			System.out.println(a.writer);
//			System.out.println(a.date);
//			System.out.println(a.hitcount);
//		}
		
		
	}
}
