package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][]arr=new int[3][3];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("Nhập phần tử "+i+j+"vào mảng");
                arr[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int max=arr[0][0];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
