package code248;

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
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			return name.equals(tmp.name) && age==tmp.age;
		}
		return false;
	}
	
	public int hashCode( ) {
		return name.hashCode( ) + age;
	}
}

public class Code248 {
	
	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>( );
		set.add(new String("Alice"));
		set.add(new String("Alice"));
		set.add(new Person("Robert",10));
		set.add(new Person("Robert",10));
		System.out.println(set);
	}
}