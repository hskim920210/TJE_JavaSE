package tje.collection;

// LinkedList 클래스
// 링크 드 리스트를 구현하고 있는 클래스
// - 데이터를 참조값으로 연결하여 저장할 수 있는 클래스
// - 개수의 제약없이 저장할 수 있음
// - 데이터의 삽입과 삭제에 최적화되어 있는 클래스
// - 데이터 중복을 허용
// - 데이터 입력 순서를 유지
// - 검색에 취약
// - 데이터 저장 시, 참조값도 같이 저장되기 때문에
//   메모리 낭비가 발생

import java.util.*;

public class Collection_05 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		for( int i = 0 ; i < list.size() ; i++ )
			System.out.println(list.get(i));
	}

}
