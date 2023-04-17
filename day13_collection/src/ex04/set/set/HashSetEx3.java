package ex04.set.set;
import java.util.*;
class HashSetEx3 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abc");
		set.add("abc");
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		System.out.println(set);
	}}
class Person {
	String name;
	int age;
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	public String toString() {
		return name +":"+ age;
	}
}