
public class Operator_07 {

	public static void main(String[] args) {
		// 비트연산자
		// 정수 값, 변수에만 사용할 수 있는 연산자
		// 정수타입의 값 또는 변수에 비트연산을 적용한 결과를 반환
		// &(AND), |(OR), ^(XOR), ~(NOT)
		// 정수타입의 값 또는 변수가 포함하고 있는 각 비트에 연산을 적용
		
		// 변수에 각 비트를 사용하여 이진(0/1, true/false) 데이터를 저장할 수 있는 방법을 제공
		// 1 바이트의 변수를 사용하여 8개의 데이터를 저장할 수 있다.
		// &(AND) 연산자는 특정 위치의 비트가 1인지 확인하는 역할
		// |(OR) 연산자는 특정위치의 비트를 1로 설정하는 역할
		// ^(XOR) 연산자는 특정위치의 비트를 스위칭하는 역할
		
		int n1 = 10;
		int n2 = 5;
		int result;
		
		// 		16 8 4 2 1
		// n1 :  0 1 0 1 0
		// n2 :  0 0 1 0 1
		//  r :
		
		// 비트연산자 & (AND) 
		// 좌항과 우항의 각 비트를 비교하여 모두 참(1)인 경우 참(1)을 반환하는 연산자
		
		// 		16 8 4 2 1
		// n1 :  0 1 0 1 0
		// n2 :  0 0 1 0 1
		//  & :  0 0 0 0 0
		
		result = n1 & n2;
		
		System.out.printf(" %d & %d = %d\n", n1, n2, result);

		
		// 비트연산자 | (OR) 
		// 좌항과 우항의 각 비트를 비교하여 둘 중 하나라도 참(1)인 경우 참(1)을 반환하는 연산자
				
		// 		16 8 4 2 1
		// n1 :  0 1 0 1 0
		// n2 :  0 0 1 0 1
		//  | :  0 1 1 1 1
				
		result = n1 | n2;
				
		System.out.printf(" %d | %d = %d\n", n1, n2, result);
		
		
		// 비트연산자 ^ (XOR) 
		// 좌항과 우항의 각 비트를 비교하여 서로 다른 값을 가지는 경우 참(1)을 반환하는 연산자
				
		// 		16 8 4 2 1
		// n1 :  0 1 0 1 0
		// n2 :  0 0 1 0 1
		//  ^ :  0 1 1 1 1
				
		result = n1 ^ n2;
				
		System.out.printf(" %d ^ %d = %d\n", n1, n2, result);
		
		
		// 비트연산자 ~ (NOT)
		// 단항연산자
		// 해당 변수의 각 비트를 부정한 결과를 반환. (0은 1로, 1은 0으로)
				
		// 		16 8 4 2 1
		// n1 :  0 1 0 1 0
		// ~n1:  1 0 1 0 1
		// n2 :  0 0 1 0 1
		// ~n2:  1 1 0 0 0
		//  & :  0 0 1 0 1
				
		result = ~n1 & n2;
				
		System.out.printf(" ~%d & %d = %d\n", n1, n2, result);
		
		
	}

}
