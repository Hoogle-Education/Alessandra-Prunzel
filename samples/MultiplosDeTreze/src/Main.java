import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 10 = 7(divisor) * 1(quociente) + 3(resto)
        // 12 = 7 * 1 + 5
        // 14 = 2 * 7
        // 5 = 0 * 7 + 5

        // 12 % 5 + 3

        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();

        if (start > end) {
            // copy, aux, temp, x
            int copy =  start; // start = 3, end = 2, copy = 3
            start = end; // start = 2, end = 2, copy = 3
            end = copy; // start = 2, end = 3, copy = 3
        }

        int sum = 0;

        for(int current = start; current <= end; current++) {
            if(current%13 != 0) { // multiplo de 13 => resto zero por 13
                sum += current;
            }
        }

        System.out.println(sum);
    }
}