package ex02.datatype;

public class MainEntry {

	// 클래스변수(static변수)는 초기화 유무 상관없음
	static int Num; // 정수형 : 0, 실수형 : 0.0
	static String str; // 문자형 : null

	public static void main(String[] args) { // 시작점(진입점)

		int y = 11; // 지역변수는 반드시 초기화하고 써야한다.
		System.out.println(y);

		System.out.println("static value : " + Num + ", " + str);
		int su = 30;
		System.out.println(su); // 4byte
		System.out.println(100); // 4byte default로 int형

		long num = 20;
		System.out.println(num); // 8byte
		System.out.println(1000L); // 접미사L에 의해 long형이 된다.

		double d = 12.34;
		System.out.println(d); // 8byte
		System.out.println(34.56); // ? double
		System.out.println(12.34f); // 접미사f에 의해 float형이 된다.

		float f = 12.34f; // default로 double이기 때문에 접미사f를 붙어야한다.
		System.out.println(f);

	} // main end

} // 클래스 end
