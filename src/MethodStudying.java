
public class MethodStudying {
	// public 리턴타입 메소드명 (매개변수) { 구현 할것}
	
	//5가지 형태의 Method 선언 
	public void method1 () {
		// void는 return type이 없는 경우!!
	} 

	public void mehtod2(int k) {
	
	}
	public int method3() { 
		System.out.println("m3실행");
		return 10;
	}
	
	public void method4(int x, int y) {
		System.out.println(x+y+"m4");
	}
	
	public int method5 (int y) {
		System.out.println(y+"m5");
		return y*2;
	}
	
}
 