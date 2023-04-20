//Write a java program to find the maximum and minimum and how many times they both occur
//in an array of n elements. Find out the positions where the maximum first occurs and the
//minimum last occurs.

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = op.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = op.nextInt();
        }
        int max = arr[0], min = arr[0], maxCount = 1, minCount = 1, maxIndex = 0, minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = 1;
                maxIndex = i;
            } else if (arr[i] == max) {
                maxCount++;
            }
            if (arr[i] < min) {
                min = arr[i];
                minCount = 1;
                minIndex = i;
            } else if (arr[i] == min) {
                minCount++;
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
        System.out.println("Number of times maximum occurs: " + maxCount);
        System.out.println("Number of times minimum occurs: " + minCount);
        System.out.println("First occurrence of maximum element is at position: " + (maxIndex+1));
        System.out.println("Last occurrence of minimum element is at position: " + (minIndex+1));
    }
}
