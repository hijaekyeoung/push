package ex05.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		int temp;
		
		System.out.println("sort 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("\nsort 후 출력 : ");
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] > a[j]) { // 교환
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				} // if end
			} //j end
		} // i end
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}

/*
 	기준이 있다.
 	작은 것이 앞으로 온다.
 */




















