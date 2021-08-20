package code250;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person {
	
	private String name;
	private int score;
	
	Person(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString( ) {
		return "(" + name +","+ score + ")";
	}
}

public class Code250 {
	
	public static void main(String[] args) {
		TreeMap<Integer, Person> map = new TreeMap<>( );
		map.put(3, new Person("David", 80));
		map.put(1, new Person("Bob", 90));
		map.put(2, new Person("Alice", 88));
		map.put(5, new Person("Cindy", 77));
		map.put(4, new Person("Jenny", 93));
		Set<Integer> keySet = map.keySet( );// key�� �̾Ƴ�
		System.out.println(keySet); // �̾Ƴ� key ���
		System.out.println("-------------------------------");
		for ( Map.Entry<Integer, Person> e : map.entrySet( ) ){
			Integer key = e.getKey( );
			Person value = e.getValue( );
			System.out.println(key + " : " + value);
		}
		System.out.println("-------------------------------");
		Person val = (Person)map.get(3); // map.get(Ű)
		System.out.print("key 3 -> ");
		System.out.println(val);
	}
}