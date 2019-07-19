
public class MethodUse {

		public static void main(String[]args) {
			
		    MethodStudying methods = new MethodStudying();
		    methods.method1(); // MethodStudying class의 method1을 불러옴!!
		    //메소드를 사용하려면 '클래스'와 '클래스 인스턴스'를 먼저 생성해야 합니다. 
		    //인스턴스를 생성했다면 .메소드명()처럼 메소드를 호출할 수 있습니다.
		    // JAVA 는 내가 만든 객체뿐만 아니라 이미 만들어진 객체들을 사용하는 방법도 매우 중요!!
		    // >> 여기서 배운게 다른 class에 있는 method를 불러오는 방법!!
		 			
		    
		    methods.method2(10);// 다른 class에 있는 method2라는 메소드를 불러옴
		    int result= methods.method3(); 
		    System.out.println("m3이 returtn한 값 "+result);
			methods.method4(5, 10);
			int result2= methods.method5(55);
			System.out.println("m5가 리턴한 값"+ result2); 
			
			
			
			
			
			
			
		}
	
	
	
	
}
