// Problem-4: Get the total count of number listed in the dictionary which is multiple of [1,2,3,4,5,6,7,8,9]
// (examples)
// input: [1,2,8,9,12,46,76,82,15,20,30]
// Output: 
// {1: 11, 2: 8, 3: 4, 4: 4, 5: 3, 6: 2, 7: 0, 8: 1, 9: 1}

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int[] count = new int[10];

        for (int i = 0; i < size; i++) {
            int num = arr[i];
            for (int j = 1; j <= 9; j++) {
                if (num % j == 0) {
                    count[j]++;
                }
            }
        }

        System.out.println("\nCount of numbers divisible by 1 to 9:");
        for (int i = 1; i <= 9; i++) {
            System.out.println(i + ": " + count[i]);
        }
        sc.close();
    }
}
