package ss15_exception_debug.baitap;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String message) {
        super(message);
    }

}
