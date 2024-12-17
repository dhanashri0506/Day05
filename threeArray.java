package Day05;
import java.util.Scanner;
public class threeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        /
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        
        int[] originalArray = new int[size];
        int[] squaresArray = new int[size];
        int[] cubesArray = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            originalArray[i] = scanner.nextInt();
            squaresArray[i] = originalArray[i] * originalArray[i]; // Calculate square
            cubesArray[i] = originalArray[i] * originalArray[i] * originalArray[i]; // Calculate cube
        }

       
        scanner.close();


        System.out.println("Original Array:");
        displayArray(originalArray);

       
        System.out.println("Squares Array:");
        displayArray(squaresArray);

        System.out.println("Cubes Array:");
        displayArray(cubesArray);
    }


    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println(); 

	}

}
