package ex04.For;

public class ForStar {
	public static void main(String[] args) {
		
		// 직각삼각형
//		for(int i = 1; i <= 5; i++) {
//			
//			for(int j = 1; j <= i; j++) {
//				
//				System.out.print("* ");
//			
//			}
//			
//			System.out.println();
//			
//		}
		
		// 역 직각삼각형
				for(int i = 1; i <= 5; i++) {
					
					for(int j = 5; j >= i; j--) {
						
						System.out.print("*");
					
					}
					
					System.out.println();
					
				} 
		
	}
}
