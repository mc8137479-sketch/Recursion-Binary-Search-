import java.util.Arrays;
import java.util.Scanner;

/*
 Description: Performs recursive binary search and displays low, high,
              and mid at every recursive call.
 Programmed by: <Jezrel Dacanay> <BSIT> <CN 48079> <Data Structure & Algorithms>
 Last Modified: September 11, 2026
 Version: 1.0
 Acknowledgements: OpenAI GPT-5.6 Luna was used for code drafting and explanation.
*/

public class BinarySearchTrace {
    public static int binarySearch(int[] array, int low, int high, int target) {
        if (low > high) {
            System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");
            System.out.println("  low > high -> return -1");
            return -1;
        }

        int mid = low + (high - low) / 2;

        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");
        System.out.println("  mid = " + mid + ", array[mid] = " + array[mid]);

        if (array[mid] == target) {
            System.out.println("  target found -> return " + mid);
            return mid;
        } else if (target < array[mid]) {
            System.out.println("  target < array[mid] -> search left half");
            return binarySearch(array, low, mid - 1, target);
        } else {
            System.out.println("  target > array[mid] -> search right half");
            return binarySearch(array, mid + 1, high, target);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number of elements: ");
        int n = input.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        System.out.print("Target: ");
        int target = input.nextInt();

        System.out.println("\nRecursive Search Trace:");
        int index = binarySearch(array, 0, array.length - 1, target);

        if (index != -1) {
            System.out.println("\nTarget found.");
            System.out.println("Index: " + index);
        } else {
            System.out.println("\nTarget not found.");
            System.out.println("Index: -1");
        }

        input.close();
    }
}