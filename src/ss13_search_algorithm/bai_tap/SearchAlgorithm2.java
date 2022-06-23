package ss13_search_algorithm.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class SearchAlgorithm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập chuỗi");
        String str = scanner.nextLine();

        LinkedList<Character> listMax = new LinkedList<>();
        LinkedList<Character> linkedList = new LinkedList<>();

        for (int i = 1; i < str.length(); i++) {
            if (linkedList.getLast() >= str.charAt(i) && linkedList.size() > 1) {
                linkedList.clear();
            }
            linkedList.add(str.charAt(i));
            if (linkedList.size() > listMax.size()) {
                listMax.clear();
                listMax.addAll(linkedList);
            }
        }
        for (Character character : listMax) {
            System.out.println(character);
        }
    }
}
