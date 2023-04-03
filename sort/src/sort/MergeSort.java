package sort;

public class MergeSort {
    private static void mergeSort(int[] arr) {
        int[] tmp = new int[arr.length]; // 임시저장공간
        // 저장할 배열, 임시저장소,시작,끝인덱스 순으로 재귀호출
        mergeSort(arr, tmp, 0 , arr.length-1);
    }

    private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
        if (start < end) { // 시작 인덱스가 끝 인덱스보다 작은 경우만 호출
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end); // 왼쪽 배열과 오른쪽 배열이 정리 된 상태에서 병합
        }
    }

    // 두 개로 나뉜 배열방을 값에 따라 순서에 맞게 병합 해주는 메서드
    private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
    // 배열과 정렬된 결과를 반복적으로 저장하고 있는 배열의 포인터와 임시저장정소, 시작,중간,끝인덱스순
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i]; // 임시저장소에 정렬이 된 배열을 필요한 만큼 복사한다.
        }
        int part1 = start; // 첫번쨰 배열방의 첫번쨰 인덱스
        int part2 = mid + 1; // 두번째 배열방의 첫번째 인덱스
        int index = start; //
        while (part1 <= mid && part2 <= end) {
            if (tmp[part1] <= tmp[part2]){
                arr[index] = tmp[part1];
                part1++;
            } else {
                arr[index] = tmp[part2];
                part2++;
            }
            index++;
        }
        //앞쪽 배열의 데이터가 남아있는 경우
        for (int i = 0; i <= mid - part1; i++) {
            arr[index + i] = tmp[part1 + i];
        }
    }

    private static void printArray(int[] arr) {
        for(int data : arr) {
            System.out.print(data + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {3,9,4,7,5,0,1,6,8,2};
        printArray(arr);
        mergeSort(arr);
        printArray(arr);
    }
}
