package ss2_loop.baitap;

import java.util.Scanner;

public class First100Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hiện thị các số nguyên tố nhỏ hơn 100");
        int num = 2;
        while (true) {
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                    }
                } if (flag==true){
                System.out.println(num);
            }
            num++;
            if (num>100){
                break;
        }
            }
        }
    }
