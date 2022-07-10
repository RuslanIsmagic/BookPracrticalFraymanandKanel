package PracticalBook700tasks;

import java.util.Scanner;

//public class Cycle_12_1_12_19 {
//    }
//}
//class Task_12_1{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int count = 0;
//        System.out.print("Введите 10 цифр: ");
//        for (int i = 0; i <= 10; i++) {
//            int numbers = scanner.nextInt();
//            if (numbers > 0)
//                count++;
//        }
//        System.out.print("Положительных чисел: " + count);
//    }
//}
//class Task_12_2 {
//    public static void main(String [] args){
//        Scanner scanner = new Scanner(System.in);
//
//        int ChetCount = 0;
//        int NeChetCount = 0;
//
//        System.out.print("Введите 15 любых чисел: ");
//        for (int i = 0; i < 15 ; i++) {
//            int numbers = scanner.nextInt();
//            if(numbers %2 == 0) {
//                ChetCount++;
//            } else NeChetCount++;
//        }
//        System.out.println("Четных чисел: " + ChetCount);
//        System.out.println("Нечетных чисел: " + NeChetCount);
//    }
//}
class Task_12_3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int A = 0;
        System.out.print("Введите 12 целых чисел: ");
        for (int i = 0; i < 12; i++) {
            int numbers = scanner.nextInt();
            if(i == 0) {
                 A = i;
            }
            if(numbers > A) {
                count++;
            }
        }
        System.out.println("Чисел больше первого значения: " + count);
    }
}