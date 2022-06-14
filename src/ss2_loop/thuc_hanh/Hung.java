package ss2_loop.thuc_hanh;
import java.util.Scanner;
public class Hung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int x1=x-1;
        int x2=x+1;
        int firth=1;
        for (int i = 1; i < x*2; i++) {
            for (int j = 0; j < x*2+1; j++) {
                if (j==x1||j==x2) {
                    System.out.print(firth);
                }else {
                    System.out.print(" ");
                }
            }if (i>=x) {
                firth--;
                x1++;
                x2--;
            }else {
                firth++;
                x1--;
                x2++;
            }
            System.out.println("");
        }
    }
}
