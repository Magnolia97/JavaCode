package code235;

import java.util.ArrayList;
import java.util.Iterator;

public class Code235 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>( );
		list.add(100);
		list.add(200);
		list.add(50);
		list.add(1, 55);
		list.add(3, 77);
		Iterator<Integer> iter = list.iterator( ); // iterator(반복자)를 얻습니다.
		while (iter.hasNext( )) {
			Integer t = iter.next( );
			System.out.println(t);
		}
	}
}