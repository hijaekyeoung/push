package ex06.breakContinue;

public class MultiBreak {
	public static void main(String[] args) {
		
		boolean flag = true;
		
		first : {
			second : {
				
				third : {
					int k = 100;
					System.out.println("Before the break");
					
					if(flag) break second; // break 식별자; 식별자 위치까지 탈출
					
					System.out.println("This won't execute");
					
				} // end third
				
				System.out.println("대보반 화이팅!");
			} // end second
			
			System.out.println("This is after second break!!");
		} // end first
		
		System.out.println("12345");
	}
}


//식별자1 : {
//
//	식별자2 : {
//	
//		break 식별자1;
//	}
//}