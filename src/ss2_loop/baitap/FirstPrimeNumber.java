package ss2_loop.baitap;

import java.util.Scanner;

public class FirstPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số nguyên tố cần in ra:");
        int number=Integer.parseInt(scanner.nextLine());
        int count=0;
        int num=2;
        while (count<number){
            boolean flag=true;
                for (int i = 2; i < num; i++) {
                    if (num%i==0){
                        flag=false;
                        break;
                    }
                }
            if (flag==true){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}
