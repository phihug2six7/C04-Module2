package s11_dsa_stack_queue.bai_tap.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack <Integer> stack =new Stack<>();
        System.out.println("Nhập độ dài của danh sách stack");
        int size=Integer.parseInt(scanner.nextLine());
        int [] arr =new int[size];

        for (int i = 0; i <size ; i++) {
            System.out.println("Thêm phần tử thứ "+i);
            int num=Integer.parseInt(scanner.nextLine());
            stack.push(num);
        }

        for (int i = 0; i <size ; i++) {
            arr[i]=stack.pop();
        }

        System.out.println(Arrays.toString(arr));
    }
}
