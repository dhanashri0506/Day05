package Day05;

import java.util.Scanner;
public class displayPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};



        Scanner scanner = new Scanner(System.in);
        


        System.out.print("Enter the element to search for: ");
        int searchElement = scanner.nextInt();


        int position = searchElementInArray(array, searchElement);

        
        if (position != -1) {
            System.out.println("Element " + searchElement + " found at index: " + position);
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }



        scanner.close();
    }

    public static int searchElementInArray(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i; 
            }
        }
        return -1; 

	}

}
