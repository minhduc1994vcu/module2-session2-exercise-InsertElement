import java.util.Scanner;

public class InsertElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        System.out.println("elements of array before insert");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\b");
        int index;
        do {
            System.out.println("enter the position which you want to insert (should be >= 0 and <= 9): ");
            index = scanner.nextInt();
            if (index < 0 || index > arr.length - 1) {
                System.out.println("couldn't insert element into the array");
            }
        }
        while (index < 0 || index > arr.length - 1);
        System.out.println("enter the value which you want to insert:");
        int value = scanner.nextInt();

        Insert(arr, index, value);

        System.out.println("elements of array after insert");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void Insert(int[] array, int index, int value) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
    }
}
