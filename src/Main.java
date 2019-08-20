import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int i = input.nextInt();

        while (i > 0) {
            System.out.println("Podaj liczbe");
            i = input.nextInt();
            numbers.add(i);
        }
        sumNumbers(numbers);
        reverseNumbers(numbers);
    }

    private static void sumNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (i < numbers.size() - 1) {
                System.out.println(numbers.get(i) + "+");

            } else System.out.println(numbers.get(i) + "=" + sum);
        }

    }

    private static void reverseNumbers(List<Integer> numbers) {
        for (int i = numbers.size() - 1; i > 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
