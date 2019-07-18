
public class VariableScopeExample {
	public static void main(String[]args) {
		//variable scope 공부!!
		int num=50;
		
		int iarray[]=new int[100];
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i]=i+1;	
		}
		for(int i=0;i<iarray.length;i++) {
			 	}
		
		
	}
	public static void fail() {
		int num=100;
	}  
	// >> 정리 1. Variable은 Scope이 있는데 {} 안에서 int num을 정의를 내리면 {}안에서만 영향을 줌
	//       2. 따라서 위와 같이 main과 main밖의 method에서 variable정의 내리면 이름은 num으로 같지만 값이 다른걸 볼 수 있음!!
	//       3. 위에 i가 2번 나와도 문제없는 이유? 변수는 선언될때 생성되었다가 해당 블록이 끝날때 소멸된다. 따라서 첫번째 for문 {} 이후 소멸되어 두번째 for쓸때 또 선언가능한것
	// 즉, Variable의 범위는 variable이 있는 블록{}이다
}
