package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int num =Integer.parseInt(scanner.nextLine());
        int [] arr=new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập 1 số cần xóa trong mảng");
        int del=Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <arr.length ; i++) {
            if (del==arr[i]){
                for (int j = i; j <arr.length-1 ; j++) {
                    arr[j]= arr[j+1];
                }
                arr[arr.length-1]=0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
