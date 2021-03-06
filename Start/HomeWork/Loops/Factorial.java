import java.util.Scanner;

/*
     4)Вычислить с помощью цикла факториал числа - n введенного с
       клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
       этого числа до 1. Например 5!=5*4*3*2*1=120
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number n (4<n<16): ");
        int number = scanner.nextInt();

        if (number < 4 || number > 16) {
            System.out.println("Wrong Number!");
        } else {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of number " + number + " = " + factorial);
        }
        scanner.close();
    }
}
