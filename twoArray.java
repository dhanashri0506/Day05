package Day05;

public class twoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        
		        int[] array1 = {1, 2, 3, 4, 5};
		        int[] array2 = {10, 20, 30, 40, 50};

		        
		        int[] sumArray = new int[array1.length];

		        
		        addArrays(array1, array2, sumArray);

		        
		        System.out.print("The sum of the two arrays is: ");
		        for (int sum : sumArray) {
		            System.out.print(sum + " ");
		        }
		    }

		    
		    public static void addArrays(int[] array1, int[] array2, int[] sumArray) {
	
		        if (array1.length != array2.length) {
		            System.out.println("Error: Arrays must be of the same length.");
		            return;
		        }

		        
		        for (int i = 0; i < array1.length; i++) {
		            sumArray[i] = array1[i] + array2[i];
		        }
		    }
	}
