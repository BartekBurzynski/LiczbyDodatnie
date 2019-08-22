import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();
        do {
            System.out.println("Podaj liczbe");

            if (i > 0) {
                i = input.nextInt();
                numbers.add(i);
            }
        } while (i > 0);


        maxNumbers(numbers);
        minNumbers(numbers);
        sumNumbers(numbers);
        reverseNumbers(numbers);

    }

    private static int maxNumbers(List<Integer> numbers) {
        int max = 0;
        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
            System.out.println(max);
        }
       return max;
    }

    private static int minNumbers(List<Integer> numbers) {
        int min = 0;
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
            System.out.println(min);
        }
        return min;


    }


    private static void sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() - 1) {
                System.out.println(numbers.get(i) + "+");
                sum += i;
            } else System.out.println(numbers.get(i) + "=" + sum);
        }

    }

    private static void reverseNumbers(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
