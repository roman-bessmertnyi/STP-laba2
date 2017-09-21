package arrays;

import java.util.Random;
import java.util.Scanner;

public class TaskTwo {
    public static  void main(String args[]){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Введите N, размер матрицы ");
        int size = in.nextInt();

        int[][] baseMatrix = new int[size][size];
        for(int j = 0; j < size; j++)
            for(int i = 0; i < size; i++) baseMatrix[i][j] = rand.nextInt()%100;

        int[][] bMatrix = new int[size][];
        boolean isNegative = false;
        for(int i = 0; i < size; i++) {
            for(int k = 0; k < size; k++){
                if (baseMatrix[i][k] <0 ) {
                    bMatrix[i] = new int[k];
                    for(int j = 0; j < k; j++) {
                        
                    }
                }
            }
        }




        for(int j = 0; j < size; j++){
            cur = 0;
            for(int i = 0; i < 8; i++) {
                cur += Math.abs(baseMatrix[i][j]);
            }
            if(cur > max) {
                max = cur;
                colNum = j;
            }
        }
        for(int i = 0; i < 8; i++) {
            if(baseMatrix[i][colNum] < min) {
                min = baseMatrix[i][colNum];
            }
        }
        showMatrix(baseMatrix);
        System.out.println("Value: " + min);

        int n = 0;
        while(n <= 0) {
            System.out.print("Elements num: ");
            n = in.nextInt();
        }

        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) matrix[i][j] = rand.nextInt()%100;
        showMatrix(matrix);
        int minEl;
        System.out.print("Min: ");
        for(int i = 0; i < n ; i++){
            minEl = matrix[i][0];
            int j = 0;
            while(j <= i){
                if(matrix[i][j] < minEl) minEl = matrix[i][j];
                j++;
            }
            System.out.print(minEl + " ");
        }

        int[] arrayB = new int[n];
        System.out.print("First positive: ");
        for(int i = 0; i < n ; i++){
            arrayB[i] = 1;
            int j = 0;
            while(j < n && matrix[i][j] <= 0) j++;
            arrayB[i] = matrix[i][j];
            System.out.print(arrayB[i] + " ");
        }
    }

    public static void  showMatrix(int[][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
