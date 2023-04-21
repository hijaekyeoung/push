package ex01.lambda;

import java.util.function.Consumer;

// Consumer는 1개의 Type T 인자를 받고 리턴값이 없는 함수형 인터페이스

public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
		consumer.accept("hello world");
	}
}
