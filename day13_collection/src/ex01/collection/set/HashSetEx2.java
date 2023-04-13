package ex01.collection.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return false;
	}
	
	// Set은 원래 중복허용이 불가능하지만 예외적으로 가능할 경우
	// hashCode 함수를 사용하여 중복을 배제해준다.
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
		//return name.hashCode() + age;
	}
}

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new Person("jk",31)); // 우리가 만든 객체
		set.add(new Person("jk",30));
		set.add(new Person("jk",30));
		set.add(new Person("jkaa",20));
		set.add(new Person("jk3",25));
		set.add(new String("happy"));
		set.add(new String("happy"));
		
		System.out.println(set);
	}
}


















