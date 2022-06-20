package s11_dsa_stack_queue.bai_tap.queue;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi để kiểm tra xem chuỗi đó có phải là chuỗi palindrome hay không? ");
        String string=scanner.nextLine();
        string=string.toLowerCase();
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();

        for (int i = 0; i <string.length() ; i++) {
//            System.out.println(string.charAt(i));
            queue.add(string.charAt(i));
            stack.push(string.charAt(i));
        }
        boolean compare
                =true;
        while (!queue.isEmpty()){
            if (queue.poll()==stack.pop()){
                compare =true;
            }else {
                compare =false;
                break;
            }
        }
        System.out.println(compare);
    }
}
