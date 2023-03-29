//* //*/ // 주석 토글
//*
package ex02.datatype;

public class DataType2 {
	// 모든 자료형은 자신의 범위를 안벗어난다.
	public static void main(String[] args) {
		short sh = 3; // 범위 : -32,768 ~ 32,767
		int num = 50000;
		
		
		// 작은 자료형이 큰 자료형으로 형변환이 될 때는 자동으로 캐스팅된다.
		// 이것을 묵시적 형변환이라한다.
		num = sh; // int(4byte) = short(2byte)
		System.out.println(sh + " : " + num);
		
		//num = -32769;
		num = 32770;
		// 큰 자료형이 작은 자료형에 넣으려면 명시적 형변환이 필요하다.
		// 데이터 손실이 발생할 수 있다.
		sh = (short)num; // short(2byte) = int(4byte)
		
		System.out.println(sh + " : " + num);
	}
}
//*/