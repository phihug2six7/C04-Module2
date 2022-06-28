package ss16_io_text_file.baitap.copy_file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriter {
    public static List<String> readFile(String filepath){
        List<String> list=new ArrayList<>();
        try {
            FileReader fileReader=new FileReader(filepath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String lame="";
            while ((lame=bufferedReader.readLine())!=null){
                list.add(lame);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("Đường dẫn không có ");
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String filepath,List<String> list){
        File file=new File(filepath);
        if (file.exists()){
            System.err.println("file đã có");
        }
        try {
            FileWriter fileWriter=new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (int i = 0; i <list.size() ; i++) {
                bufferedWriter.write(list.get(i));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> list=readFile("src/ss16_io_text_file/baitap/copy_file/laem.csv");
        writeFile("src/ss16_io_text_file/baitap/copy_file/new1.csv",list);
    }
}


