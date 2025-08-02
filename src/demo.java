import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Ədədləri daxil et:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + 1);
            arr[i] = scanner.nextInt();
        }
        boolean tapildi = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    tapildi = true;
                    System.out.println(arr[i]);
                    break;
                }
            }
            if (tapildi) {
                break;
            }
        }
        if (!tapildi) {
            System.out.println("Duplicate yoxdur.");
        }

        scanner.close();
    }
}
