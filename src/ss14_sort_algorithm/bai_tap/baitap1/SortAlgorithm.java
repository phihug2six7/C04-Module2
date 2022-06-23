package ss14_sort_algorithm.bai_tap.baitap1;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlgorithm {
    public static void main(String[] args) {
        int [] arr={12,11,15,21};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] array){
        int pos, x;
        for(int i = 1; i < array.length; i++){ //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while(pos > 0 && x < array[pos-1]){
                array[pos] = array[pos-1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }
    }
}
