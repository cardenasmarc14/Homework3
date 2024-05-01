import java.util.ArrayList;
import java.util.Scanner;

public class SortingNumbers {

    //Bubble sort Method to Sort 
    public static void sort(ArrayList<Integer> list) {
        // Variable to hold the size of the array list
        int size = list.size();

        // Iterate through the array list using bubble sort
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - 1; j++) {
                // Checking to see if j is greater than the element of j + 1
                if (list.get(j) > list.get(j + 1)) {
                    // Swap the elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
            // After each iteration the largest element will be at the end
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Prompting the user to enter 5 numbers
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            list.add(input.nextInt());
        }

        // Call the sort method
        sort(list);

        // Display the sorted results
        System.out.println("The sorted array list is: " + list);
    }
}