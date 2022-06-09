package ss3_array_method.baitap;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng");
        int num = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập vào một số để điền vào trong mảng");
        int add = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào vị trí index để điền số vào");
        int index = Integer.parseInt(scanner.nextLine());
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = add;
        System.out.println(Arrays.toString(arr));

    }
}
