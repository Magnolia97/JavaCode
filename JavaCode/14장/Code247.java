package code247;

import java.util.HashSet;

class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString( ) {
		return name +":"+ age;
	}
}

public class Code247 {
	
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>( );
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new Person("Robert",10));
		set.add(new Person("Robert",10));
		System.out.println(set);
	}
}