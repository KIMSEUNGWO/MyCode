package arrayEx;

public class ArrayEx7 {

	public static void main(String[] args) {

	int[] oldIntArr = {1,2,3};
	int[] newIntArr = new int[5];
	
//	for (int i=0;i<oldIntArr.length;i++) {
//		newIntArr[i] = oldIntArr[i];
//	}
//	
//	for (int i=0;i<newIntArr.length;i++) {
//		System.out.println(newIntArr[i]);
//	}
	System.arraycopy(oldIntArr, 0, newIntArr, 0, 3);
	for (int i=0;i<newIntArr.length;i++) {
		System.out.println(newIntArr[i]);
	}
	String[] newstrArr = {"a", "b", "c"};
	for(String data : newstrArr) {
		System.out.println(data);
	}
}
}