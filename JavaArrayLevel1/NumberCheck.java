import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int n : arr) {
            if (n > 0) {
                System.out.print(n + " is Positive and ");
                System.out.println(n % 2 == 0 ? "Even" : "Odd");
            } else if (n < 0) {
                System.out.println(n + " is Negative");
            } else {
                System.out.println(n + " is Zero");
            }
        }

        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and Last elements are Equal");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First element is Greater");
        else
            System.out.println("Last element is Greater");
    }
}
