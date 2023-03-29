//*
package ex01.operator;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//관계연산자 : >, <, >=, <=, ==, !=
		
		int x = 20, y = 21;
		
		if(x != y) 
			System.out.println("같지 않다");
		else
			System.out.println("같습니다.");

		if(x == y) 
			System.out.println("같지 않다");
		else
			System.out.println("같습니다.");
	}
}
//*/

/*
package ex01.operator;

//최단산쉬관논삼대콤
public class OperatorTest {
	public static void main(String[] args) {
		//shift연산자 : <<, >>, <<<
		int x = 8, result;
		
		//result = x << 2; // left shift : 원래값 * 2^bit수 => 8*2^2
		//System.out.println("left shift : " + result);
		
		result = x >>> 3; // right shift : 원래값 / 2^bit수 => 8/2^3
		System.out.println("right shift : " + result);
	}
}
*/
