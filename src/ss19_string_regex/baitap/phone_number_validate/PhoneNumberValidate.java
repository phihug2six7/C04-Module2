package ss19_string_regex.baitap.phone_number_validate;

import java.util.Scanner;

public class PhoneNumberValidate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập số điện thoại cần kiểm tra");
        String phone=scanner.nextLine();
        String regexPhone="\\(\\d{2}\\)-\\(0[0-9]{9}\\)";
        boolean check=phone.matches(regexPhone);
        if (check==true){
            System.out.println("số điện thoại hợp lệ");
        }else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }
}
