package s11_dsa_stack_queue.bai_tap.stack3;

import java.util.Scanner;
import java.util.Stack;

public class RoundBracketCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập đại");
        String string=scanner.nextLine();
        System.out.println(checkSympol(string));
    }

    public static boolean checkSympol(String string){
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i <string.length() ; i++) {
            if (string.charAt(i)=='(')
            {
                stack.push(string.charAt(i));
            }else if (string.charAt(i)==')')
            {
                if (stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
           return true;
        }else {
            return false;
        }
    }
}


