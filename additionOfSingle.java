package Day05;

public class additionOfSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10, 20, 30, 40, 50};
		
        int sum = addArrayElements(numbers);
        
        System.out.println("The sum of the array elements is: " + sum);
    }

    
    public static int addArrayElements(int[] array) {
        int sum = 0; 
       
        for (int number : array) {
            sum += number;
        }
        return sum; 
    

	}

}
