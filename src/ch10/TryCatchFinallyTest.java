package ch10;

public class TryCatchFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz= Class.forName("java.lang.String");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다");
		}
	}

}//실행해도 아무런 결과가 나타나지 않움 8에 String2로 하면 나옴
