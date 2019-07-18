
public class VariableScopeExample {
	public static void main(String[]args) {
		//variable scope 공부!!
		int num=50; //2.
		
		int iarray[]=new int[100];
		
		for(int i=0;i<iarray.length;i++) {
			iarray[i]=i+1;	
		}
		for(int i=0;i<iarray.length;i++) {
			 	} //3.
		
		for(int i=1;i<=100;i++) {
			int sum=0;
			sum=sum+i;
		}
		// 4. System.out.println(sum);
		
		
		
	}
	public static void fail() {
		int num=100;//2.
	}  
	// >> 정리 1. Variable은 Scope이 있는데 {} 안에서 int num을 정의를 내리면 {}안에서만 영향을 줌
	//       2. 따라서 위와 같이 main과 main밖의 method에서 variable정의 내리면 이름은 num으로 같지만 값이 다른걸 볼 수 있음!!
	//       3. 위에 i가 2번 나와도 문제없는 이유? 변수는 선언될때 생성되었다가 해당 블록이 끝날때 소멸된다. 따라서 첫번째 for문 {} 이후 소멸되어 두번째 for쓸때 또 선언가능한것
	//		 4. sum이라는 변수를 for밖에다 선언하면 문제가 없지만 안에다 선언하고 print하면 에러가 생김
	//			그 이유는 sum이 안에서 +되도 결국 for밖에 나가면 소멸되기에 System.out.시 sum이라는 변수는 없는 걸로 인식함
	// 	즉, Variable의 범위는 variable이 있는 블록{}이다
}
