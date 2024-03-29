// 일반 클래스의 객체 생성 과정
// 0. 클래스 파일의 로딩
// 1. 클래스의 모든 멤버 필드들이 HEAP 메모리에 로딩
// 2. 생성자 메소드 실행
// 3. 생성된 객체의 참조값 반환

// 상속 관계를 구현한 자식클래스의 객체 생성과정
// 0. 클래스 파일의 로딩(부모/자식 클래스가 로딩)
// 1. 클래스의 모든 멤버 필드들이 HEAP 메모리에 로딩
//	  (부모 클래스/자식 클래스의 모든 멤버 필드들이 로딩)
// 2. 생성자 메소드 실행(자식 클래스의 생성자)
// 3. 자식 클래스의 생성자 메소드 1번째 실행 코드인 
//	  super()에 의해서 부모클래스의 생성자가 실행
// 4. 부모 클래스의 생성자 모세드가 실행 종료 후,
//	    자식 클래스의 생성자 메소드가 실행
// 5. 생성된 객체의 참조값 반환
class SuperB {
	private int super_num;
	public SuperB() {
		System.out.println("부모클래스의 생성자 메소드 실행");
	}
}
class SubB extends SuperB {
	
	public SubB() {
		// 상속관계를 구현하는 자식클래스의 생성자는
		// 컴파일러에 의해서 첫번째 실행코드가 
		// super();로 지정된다.
		// super();는 부모클래스의 디폴트 생성자를 실행하는 코드이다.
		// 안적어도 자동으로 실행됨
		
		// 상속관계를 구현하는 자식 클래스에서 부모클래스의 생성자를 사용하는 이유
		// - 부모 클래스의 private 멤버와 같이 접근이 차단된 멤버들을 초기화하기 위해서.
		super();
		System.out.println("자식클래스의 생성자 메소드 실행");
	}
}


public class Class_29_Extends {
	public static void main(String[] args) {
		SubB b = new SubB();
	}
}
