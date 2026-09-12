import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int [] moreNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.print("Nhập số thứ " + (i + 1) + ": ");
            moreNumbers[i] = scanner.nextInt();
        }
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println(moreNumbers[i]);
        }
        int [] Array2 = new int[]{10, 20, 30, 40, 50
        };
        for (int i = 0; i < Array2.length; i++) {
            System.out.println(Array2[i]);
        }
    }
}