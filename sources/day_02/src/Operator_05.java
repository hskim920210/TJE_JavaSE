
public class Operator_05 {

	public static void main(String[] args) {
		// 증가/감소 연산자 ( 후위 / 전위 )
		// ++ / --
		// 증가/감소 연산자는 선언되는 위치에 따라서 증가/감소 시키는 시점이 변경된다.
		// 변수명의 앞에 사용되는 경우 전위, 변수명의 뒤에 사용되는 경우 후위라 한다.
		
		// 후위 증가/감소 연산자는 연산자의 실행 시점을 1번 늦게 실행한다.
		
		// 아래의 코드는 n2 변수의 n1의 값을 대입한 후, n1의 값을 나중에 증가시킨다.
		int n1 = 10;
		int n2 = n1++; // 원래는 우항이 먼저 결정된 뒤에 대입 = 가 진행되는데 여기서는 =먼저 실행하고 그다음에 ++을 진행한다.
		System.out.printf("n1 -> %d, n2 -> %d\n", n1, n2);

		// 아래의 코드는 n3 변수의 값인 30을 먼저 출력한 후, n3의 값을 1 증가시킨다.
		int n3 = 30;
		System.out.printf("n3 -> %d\n", n3++);
		System.out.printf("n3 -> %d\n", n3);
		
		// 전위 증가/감소 연산자는 즉시 실행한다.
		
		// 아래의 코드는 n4의 값은 먼저 증가시킨 후, n5 변수에 대입한다.
		int n4 = 10;
		int n5 = ++n4; // 바로 n4를 증가하는걸 실행.
		System.out.printf("n4 -> %d, n5 -> %d\n", n4, n5);
		
		int a = 10;
		System.out.printf("%d %d %d %d %d %d\n", a++, ++a, a--, ++a, a++, a); // 왼쪽부터 %d에 들어가면서 연산자가 실행된다.
		
		
	}

}
