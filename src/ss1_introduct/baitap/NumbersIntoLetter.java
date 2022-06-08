package ss1_introduct.baitap;

import java.util.Scanner;

public class NumbersIntoLetter {
    public static void main(String[] args) {
        System.out.println("Cần đọc số bao nhiêu?");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        String numbersIntoLetter = "";
        if (numbers < 10) {
            switch (numbers) {
                case 1:
                    numbersIntoLetter = "one";
                    break;
                case 2:
                    numbersIntoLetter = "two";
                    break;
                case 3:
                    numbersIntoLetter = "three";
                    break;
                case 4:
                    numbersIntoLetter = "four";
                    break;
                case 5:
                    numbersIntoLetter = "five";
                    break;
                case 6:
                    numbersIntoLetter = "six";
                    break;
                case 7:
                    numbersIntoLetter = "seven";
                    break;
                case 8:
                    numbersIntoLetter = "eight";
                    break;
                case 9:
                    numbersIntoLetter = "nine";
                    break;
                default:
                    numbersIntoLetter = "ngoài khả năng";
            }
        }else if (numbers<20){
            switch (numbers){
                case 10:
                    numbersIntoLetter="ten";
                    break;
                case 11:
                    numbersIntoLetter="eleven";
                    break;
                case 12:
                    numbersIntoLetter="twelve";
                    break;
                case 13:
                    numbersIntoLetter="thirteen";
                    break;
                case 14:
                    numbersIntoLetter="fourteen";
                    break;
                case 15:
                    numbersIntoLetter="fifteen";
                    break;
                case 16:
                    numbersIntoLetter="sixteen";
                    break;
                case 17:
                    numbersIntoLetter="seventeen";
                    break;
                case 18:
                    numbersIntoLetter="eighteen";
                    break;
                case 19:
                    numbersIntoLetter="nineteen";
            }
        }else if (numbers<100){
            int dozens=numbers/10;
            int units=numbers%10;
            switch (dozens){
                case 2:
                    numbersIntoLetter="twenty";
                    break;
                case 3:
                    numbersIntoLetter="thirty";
                    break;
                case 4:
                    numbersIntoLetter="forty";
                    break;
                case 5:
                    numbersIntoLetter="fifty";
                    break;
                case 6:
                    numbersIntoLetter="sixty";
                    break;
                case 7:
                    numbersIntoLetter="seventy";
                    break;
                case 8:
                    numbersIntoLetter="eighty";
                    break;
                case 9:
                    numbersIntoLetter="ninety";
                    break;
            }
            switch (units){
                case 1:
                    numbersIntoLetter+="one";
                break;
                case 2:
                    numbersIntoLetter+="two";
                    break;
                case 3:
                    numbersIntoLetter+="three";
                    break;
                case 4:
                    numbersIntoLetter+="four";
                    break;
                case 5:
                    numbersIntoLetter+="five";
                    break;
                case 6:
                    numbersIntoLetter+="six";
                    break;
                case 7:
                    numbersIntoLetter+="seven";
                    break;
                case 8:
                    numbersIntoLetter+="eight";
                    break;
                case 9:
                    numbersIntoLetter+="nine";
                    break;

            }
        }else if (numbers<1000){
            int hundreds=numbers/100;
            int dozens=numbers/10%10;
            int units=numbers%10;
            switch (hundreds){
                case 1:
                    numbersIntoLetter="one hundreds";
                    break;
                case 2:
                    numbersIntoLetter="two hundreds";
                    break;
                case 3:
                    numbersIntoLetter="three hundreds";
                    break;
                case 4:
                    numbersIntoLetter="four hundreds";
                    break;
                case 5:
                    numbersIntoLetter="five hundreds";
                    break;
                case 6:
                    numbersIntoLetter="six hundreds";
                    break;
                case 7:
                    numbersIntoLetter="seven hundreds";
                    break;
                case 8:
                    numbersIntoLetter="eight hundreds";
                    break;
                case 9:
                    numbersIntoLetter="nine hundreds";
            }
            if (dozens==1){
                switch (units){
                    case 0:
                        numbersIntoLetter+=" ten";
                        break;
                    case 1:
                        numbersIntoLetter+=" eleven";
                        break;
                    case 2:
                        numbersIntoLetter+=" twelve";
                        break;
                    case 3:
                        numbersIntoLetter+=" thirteen";
                        break;
                    case 4:
                        numbersIntoLetter+=" fourteen";
                        break;
                    case 5:
                        numbersIntoLetter+=" fifteen";
                        break;
                    case 6:
                        numbersIntoLetter+=" sixteen";
                        break;
                    case 7:
                        numbersIntoLetter+=" seventeen";
                        break;
                    case 8:
                        numbersIntoLetter+=" eighteen";
                        break;
                    case 9:
                        numbersIntoLetter+=" nineteen";
                        break;
                }
            }
            else {
                switch (dozens){
                    case 2:
                        numbersIntoLetter+=" twenty";
                        break;
                    case 3:
                        numbersIntoLetter+=" thirty";
                        break;
                    case 4:
                        numbersIntoLetter+=" forty";
                        break;
                    case 5:
                        numbersIntoLetter+=" fifty";
                        break;
                    case 6:
                        numbersIntoLetter+=" sixty";
                        break;
                    case 7:
                        numbersIntoLetter+=" seventy";
                        break;
                    case 8:
                        numbersIntoLetter+=" eighty";
                        break;
                    case 9:
                        numbersIntoLetter+=" ninety";
                        break;
                }
                switch (units){
                    case 1:
                        numbersIntoLetter+=" one";
                        break;
                    case 2:
                        numbersIntoLetter+=" two";
                        break;
                    case 3:
                        numbersIntoLetter+=" three";
                        break;
                    case 4:
                        numbersIntoLetter+=" four";
                        break;
                    case 5:
                        numbersIntoLetter+=" five";
                        break;
                    case 6:
                        numbersIntoLetter+=" six";
                        break;
                    case 7:
                        numbersIntoLetter+=" seven";
                        break;
                    case 8:
                        numbersIntoLetter+=" eight";
                        break;
                    case 9:
                        numbersIntoLetter+=" nine";
                        break;
                }
            }

        }
        System.out.println(numbersIntoLetter);
    }
}
