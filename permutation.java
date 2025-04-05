import java.util.Random;

public class permutation {
	public static void main(String[] args) {
		
	
	int[] numbers = {1,2,3,4};
	
	Random rand = new Random();



    for (int i = numbers.length-1 ; i > 0; i--) {
        int j = rand.nextInt(i+1 ); 

        
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
	
    System.out.println("\t Here are the permutation, dear.  ");
    System.out.print("\t\t ~ ");
	for (int k=0; k<numbers.length; k++) {
		
		System.out.print(numbers[k]+" "); 
		
	}
	System.out.print("~");
	}
}
