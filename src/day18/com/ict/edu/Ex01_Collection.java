package day18.com.ict.edu;

public class Ex01_Collection {
	// 제네릭 : 컬렉션이 어떤 객체들로 이루어졌는지를 표시한다. 또는 객체(클래스) 타입
	// 컬렉션 : 객체들을 모아서 관리하는 인터페이스를 말한다.
	// API : <T> => 객체 타입, <E> => 요소(Element) => 컬렉션 안에 존재하는 객체 하나를 뜻한다.
	//		Map 형식 : <K,V> => Key, Value
	//				   1:1 대응, Key를 호출하면 Value가 나온다.
	// 사용형식 : 컬렉션<제네릭>
	// 최상위 컬렉션은 Collection<E>, Map<K,V>
	// Collection<E>를 상속받아서 실제로 사용하는 인터페이스들은 : Set<E>, List<E>, Queue<E>
	
	// 컬렉션의 주요 메소드
	// 1. add(E e) : 반환형은 boolean => 해당 컬렉션에 객체 추가, 성공하면 true, 실패하면 false
	// 				 보통은 리턴을 받지 않는다. (set에서는 중복검사 시 받는다.)
	// 2. addAll(Collection<? extends E> c) : boolean => 특정 컬렉션에 있는 모든 요소들을 다른 컬렉션에 추가
	// 3. clear() void => 모든 요소 삭제
	// 4. contains(Object o) : boolean => 인자로 들어온 객체가 포함되어 있으면 true
	// 5. isEmpty() : boolean => 해당 컬렉션이 비어있으면 true
	// 6. iterator() : Iterator<E> => 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위해서 Iterator 객체를 변환
	// 								  요소들을 하나씩 꺼내서 작업할 때 사용 (for문도 사용 가능)
	// 7. remove(Object o)  boolean => 인자로 들어온 객체를 삭제, 성공하면 true
	// 8. size() : int => 컬렉션 안에 존재하는 요소의 수 (for문 사용가능)
	// 9. toArray() : 
	
	
}
