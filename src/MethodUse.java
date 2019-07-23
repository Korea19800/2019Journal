
public class MethodUse {

		public static void main(String[]args) {
			
		    MethodStudying fuck = new MethodStudying();
		    fuck.method1(); // MethodStudying class의 method1을 불러옴!!
		    //1.메소드를 사용하려면 '클래스'와 '클래스 인스턴스'를 먼저 생성해야 합니다. >> 예를들어 위에서 MethodStudying이 클래스이름, fuck이라는 단어가 클래스인스턴스(class의 예시!)
		    //2.인스턴스를 생성했다면 .메소드명()처럼 메소드를 호출할 수 있습니다. >> =뒤에 new써주고 class명과 메소드 쓰겠다는 걸 의미하는 () 써주기!
		    //3. 리턴타입: int의 return5*y가 메소드5라면 int v= method5로 하고 v를 출력하면 5*y가 나옴
		    //   즉, int는 return뒤의 있는 값을 메소드가 갖는다는 소리
		    //4.반면, void는 메소드4안에 있는 System.out.같은 것들이 실행이 되지만 메소드 자체가 값을 갖진 않는다!!!
		    //5. JAVA 는 내가 만든 객체뿐만 아니라 이미 만들어진 객체들을 사용하는 방법도 매우 중요!!
		    //6. >> 여기서 배운게 다른 class에 있는 method를 불러와 사용하는 방법!!
		 			
		    
		    fuck.method2(10);// 다른 class에 있는 method2라는 메소드를 불러옴
		    int result= fuck.method3(); 
		    System.out.println("m3이 returtn한 값 "+result);
			fuck.method4(5, 10);
			int result2= fuck.method5(55);
			System.out.println("m5가 리턴한 값"+ result2); 
			
			
			
			
			
			
			
		}
	
	
	
	
}
