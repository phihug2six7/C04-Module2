package ss16_io_text_file.baitap.doc_file;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ReadAndWriter {
    public static List<Country> readFile(String filepath) {
        List<Country> list=new ArrayList<>();
        FileReader fileReader= null;

        try {
            fileReader = new FileReader(filepath);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line="";
            while ((line=bufferedReader.readLine())!=null){
                String[] strings= line.split(",");
                Country country=new Country(Integer.parseInt(strings[0]),strings[1],strings[2]);
                list.add(country);
            }
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void writerFile(String filepath,List<Country> list,boolean append){
        try {
            FileWriter fileWriter=new FileWriter(filepath,append);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            for (Country country:list) {
                String line=country.getId()+","+country.getCode()+","+ country.getCountryName();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Country> list1= new LinkedList<>();
        list1.add(new Country(9,"vn","vietnam"));
        writerFile("src/ss16_io_text_file/baitap/doc_file/name.csv",list1,true);
        List<Country> list=readFile("src/ss16_io_text_file/baitap/doc_file/name.csv");
        for (Country country:list) {
            System.out.println(country);
        }
    }
}
