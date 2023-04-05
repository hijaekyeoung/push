package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
   public static void main(String[] args) {
      // 학생수, 과목: 국어,영어,수학, 합계, 평균(double),학점,석차
      Scanner sc = new Scanner(System.in);
      int n; // 학생 수
      String[] name; // 학생 이름
      int[][] score; // 국,영,수
      int[] sum; // 총점
      double[] avg; // 평균
      int[] rank; // 석차
      char[] grade; // 학점

      System.out.print("인원 수 입력 > ");
      n = sc.nextInt();
      
      name = new String[n];
      score = new int[n][3];
      avg = new double[n];
      sum = new int[n];
      rank = new int[n];
      grade = new char[n];
      
      for (int i = 0; i < n; i++) {
         System.out.print("학생 이름 : ");
         name[i] = sc.next();
         for (int j = 0; j < score[i].length; j++) {
            System.out.print("점수 : ");
            score[i][j] = sc.nextInt();
            sum[i] += score[i][j]; // 국,영,수 합계 넣기
         }
         
         avg[i] = (double)sum[i]/3;
         
         switch((int)avg[i]/10) {
         case 10 : case 9 :
            grade[i] = 'A'; break;
         case 8 : 
            grade[i] = 'B'; break;
         case 7 : 
            grade[i] = 'C'; break;
         case 6 : 
            grade[i] = 'D'; break;
         case 5 : 
            grade[i] = 'E'; break;
         default : 
            grade[i] = 'F'; break;
         }
         
//         for (int j = 0; j < rank.length; j++) {
//            rank[i] = 1;
//         }
//         
//         for (int j = 0; j < rank.length; j++) {
//            for (int k = j; k < rank.length; k++) {
//               if(sum[j] < sum[k]) {
//                  rank[j]++;
//               } 
//            }
//         }
         
      }
      
      int[] sorted = Arrays.copyOf(sum, sum.length);
      Arrays.sort(sorted); //오름차순
      for (int i = 0; i < n; i++) {
         for (int j = n-1; j >= 0; j--) { // 내림차순
            if (sum[i] == sorted[j]) {
               rank[i] = n - j;
               break;
            }
         } 
      }
      
      for (int i = 0; i < score.length; i++) {
    	 System.out.println();
         System.out.println(name[i] + "학생의 성적표");
         System.out.println("국어 : " + score[i][0] + "\t영어 : " 
               + score[i][1] + "\t수학 : " + score[i][2]);
         System.out.printf("합계 : %d\t평균 : %.2f\t학점 : %c\t석차 : %d등\n",
               sum[i],avg[i],grade[i],rank[i]);
      }
   }
}























































