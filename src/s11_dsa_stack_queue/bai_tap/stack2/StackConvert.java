package s11_dsa_stack_queue.bai_tap.stack2;


import java.util.Scanner;
import java.util.Stack;

public class StackConvert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Stack<Integer> stack=new Stack<>();
        System.out.println("Nhập 1 số thập phân để chuyến sang hệ nhị phân");
        int num=Integer.parseInt(scanner.nextLine());
        String string =" ";
        do {
            stack.add(num%2);
            num=num/2;
        }while (num!=0);
        while (!stack.isEmpty()){
            string += stack.pop();
        }
        System.out.println("Số nhị phân là "+string);
    }
}
