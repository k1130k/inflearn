package array.ex;

import java.util.Scanner;

public class  ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int input = sc.nextInt();
        int[] numbers = new int[input];
        int minNumber, maxNumber;

        System.out.println(input + "개의 정수를 입력하세요:");
        for(int i = 0; i < input; i++) {
            numbers[i] =  sc.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < input; i++ ) {
            if (numbers[i] < minNumber) {
                    minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }
        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}
