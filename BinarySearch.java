import java.util.Arrays;
import java.util.Scanner;

/*
 Description: Performs a recursive binary search on a user-provided array.
 Programmed by: <Jezrel Dacanay> <BSIT> <CN 48079> <Data Strucutures & Algorithms>
 Last Modified: September 11, 2026
 Version: 1.0
 Acknowledgements: OpenAI GPT-5.6 Luna was used for code drafting and explanation.
*/

public class BinarySearch {
    public static int binarySearch(int[] array, int low, int high, int target) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearch(array, low, mid - 1, target);
        } else {
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

        int index = binarySearch(array, 0, array.length - 1, target);

        if (index != -1) {
            System.out.println("Target found.");
            System.out.println("Index: " + index);
        } else {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        }

        input.close();
    }
}