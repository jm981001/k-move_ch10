package ch10;

public class NumberFomatException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data1 = "100";
		String data2 = "a100";
		//String data2 = "100"; 이렇게 하면 오류 안뜸
		int value1= Integer.parseInt(data1);
		int value2= Integer.parseInt(data2);
		
		int result = value1+ value2;
		System.out.println(data1+"+"+data2 +"="+result);
	}

}