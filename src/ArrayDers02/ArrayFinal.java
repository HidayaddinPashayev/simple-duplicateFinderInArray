package ArrayDers02;

import java.util.HashSet;
import java.util.Scanner;

public class ArrayFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Neçə ədəd daxil edəcəksiniz?");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ədədləri daxil et:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            // esas kod
        }

        mainMethod(arr);
    }
    public static void mainMethod(int[] arr) {
        boolean duplicateFound = false;
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {  // arraydaki her element ucun:
            if (seen.contains(num)) {
                System.out.println("Cavab: Təkrar ədəd" + num);
                duplicateFound = true;
                break;
            }
            seen.add(num);
        }
        if (!duplicateFound) {
            System.out.println("Təkrar ədəd yoxdur.");
        }

    }
}
