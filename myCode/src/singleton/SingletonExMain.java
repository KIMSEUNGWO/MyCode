package singleton;

public class SingletonExMain {

	public static void main(String[] args) {
		/* 컴파일 에러
		 SingletonEx obj1= new SingletonEx() 
		*/
		
		SingletonEx obj1 = SingletonEx.getInstance();
		SingletonEx obj2 = SingletonEx.getInstance();
		
		if (obj1 == obj2) {
			System.out.println("같은 객체입니다");
		} else {
			System.out.println("다른 객체입니다");
			
		}
	}
}
