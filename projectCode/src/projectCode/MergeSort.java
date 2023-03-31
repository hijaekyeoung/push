package projectCode;

import java.util.Arrays;
//import java.util.Scanner;

public class MergeSort {
    
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid); // 왼쪽 부분 배열을 재귀적으로 정렬
            mergeSort(arr, mid + 1, right); // 오른쪽 부분 배열을 재귀적으로 정렬
            merge(arr, left, mid, right); // 정렬된 부분 배열들을 병합
        }
    }
    
    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[arr.length]; // 임시 배열 생성
        
        // 왼쪽 부분 배열의 첫 번째 인덱스와 오른쪽 부분 배열의 첫 번째 인덱스를 변수에 저장
        int leftIndex = left;
        int rightIndex = mid + 1;
        int tempIndex = left;
        
        // 왼쪽 부분 배열과 오른쪽 부분 배열을 비교하여 임시 배열에 병합
        while (leftIndex <= mid && rightIndex <= right) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                temp[tempIndex++] = arr[leftIndex++];
            } else {
                temp[tempIndex++] = arr[rightIndex++];
            }
        }
        
        // 남아 있는 왼쪽 부분 배열의 요소를 임시 배열에 복사
        while (leftIndex <= mid) {
            temp[tempIndex++] = arr[leftIndex++];
        }
        
        // 남아 있는 오른쪽 부분 배열의 요소를 임시 배열에 복사
        while (rightIndex <= right) {
            temp[tempIndex++] = arr[rightIndex++];
        }
        
        // 임시 배열에 저장된 값을 원래 배열에 복사
        for (int i = left; i <= right; i++) {
            arr[i] = temp[i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 7, 1, 3, 6};
        mergeSort(arr, 0, arr.length - 1);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}



