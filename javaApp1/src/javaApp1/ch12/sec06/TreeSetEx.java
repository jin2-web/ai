package javaApp1.ch12.sec06;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// 666 
		TreeSet<Integer> t1 = new TreeSet<Integer>();

		t1.add(87);
		t1.add(98);
		t1.add(75);
		t1.add(95);
		t1.add(80);
		t1.add(80);
		t1.add(80);
		
		System.out.println( t1.size() ); //노드의 갯수 5
		// 오름차순 정렬되어서 모두 출력됨
		Iterator<Integer> it = t1.iterator();
		while( it.hasNext() ) {
			System.out.println( it.next() );
		}
		
		for( Integer t  : t1) {
			System.out.println( t );
		}
		// 가장 낮은 점수는?
		System.out.println(  t1.first() );
		//가장 높은 점수는?
		System.out.println( t1.last() );
		//95점 아래 점수는?
		System.out.println( t1.lower(95));
		//95점 위의 점수는?
		System.out.println( t1.higher(95));
		//95점이거나 바로  아래 점수는?
		System.out.println( t1.floor(95));
		//95점이거나 바로  위의 점수는?
		System.out.println( t1.ceiling(95));
		
		//내림차순 정렬
		NavigableSet<Integer>  ds = t1.descendingSet();
		
		for(  Integer d  : ds ) {
			System.out.println( d + "~");
		}
		
		// 80 <= x <= 90 사이
		SortedSet<Integer> s8090 = t1.subSet(80,true, 90,false); //true 80 포함해서, false 포함하지 않고
		for( Integer s : s8090) {
			System.out.println( s + "~~");
		}
		// 트리에 노드가 87이 있나요?
		System.out.println( t1.contains(100) ) ; 
				
			
		
		
	}

}
