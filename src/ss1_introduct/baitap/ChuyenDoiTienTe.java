package ss1_introduct.baitap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Đổi từ usd sang vnd,hãy nhập giá tiền muốn đổi");
        int usd = Integer.parseInt(scanner.nextLine());
        System.out.println(usd + "usd=" + usd * 23000 + "vnd");
    }
}
