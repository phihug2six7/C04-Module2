package ss16_io_text_file.thuchanh.tim_gia_tri_lon_nhat_va_ghi_ra_file;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            File file =new File(filePath);

            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line="";
            int sum=0;

            while ((line=bufferedReader.readLine())!=null) {
                System.out.println(line);
                sum+=Integer.parseInt(line);
            }

            bufferedReader.close();
            System.out.println("Tổng = "+sum);

        } catch (IOException e) {
            System.out.println("file không tồn tại hoặc nội dung có lỗi");
        }

    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner=new Scanner(System.in);
        String lame=scanner.nextLine();

        ReadFileExample readFileExample =new ReadFileExample();
        readFileExample .readFileText(lame);
    }
}


