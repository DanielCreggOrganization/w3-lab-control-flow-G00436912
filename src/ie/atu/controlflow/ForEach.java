package ie.atu.controlflow;

public class ForEach {
    public static void main(String[] args) {
 
        //create an array
        int[] numbers ={3,2,6,4,9};
        int sum =0 ;

        for(int number: numbers) {
            sum += number;
        }
            System.out.println("Sum = " +sum);
        }
    }

