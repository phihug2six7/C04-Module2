package ss3_array_method.baitap;

import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử ở trong mảng");
        int num=Integer.parseInt(scanner.nextLine());
        int [] arr=new int[num];
        for (int i = 0; i <num ; i++) {
            arr[i]=Integer.parseInt(scanner.nextLine());
        }
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
             if (min>arr[i]){
                 min=arr[i];
             }
        }
        System.out.println(min);
    }
}
