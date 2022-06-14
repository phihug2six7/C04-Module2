package ss4_class_object.baitap;

import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        int num=0;
        for (int i = 0; i <100000 ; i++) {
            num+=i;
        }
        stopWatch.end();
        System.out.println(stopWatch.getElapsedTime());
    }
}
