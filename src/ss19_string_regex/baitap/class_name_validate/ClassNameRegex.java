package ss19_string_regex.baitap.class_name_validate;

import java.util.Scanner;

public class ClassNameRegex {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập tên lớp học để kiểm tra");
        String lass=scanner.nextLine();
        String regexClass="^[CAP]\\d{4}[GHIKLM]$";
        boolean check=lass.matches(regexClass);
        System.out.println(check);
    }
}
