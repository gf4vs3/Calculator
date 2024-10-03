import java.util.Scanner; 

public class CostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 


        for (int i = 1; i<= 6; i++){ 

        System.out.println("Enter the cost per lb for bag " + i + ": "); 
        double costPerLb = scanner.nextDouble(); 

        System.out.println("Enter the weight of the bag" + i + " in lbs: "); 
        double weight = scanner.nextDouble(); 

        double totalCost = costPerLb * weight; 

        System.out.printf("The cost of bag %d is: $%.2f%n", i, totalCost); 
    }


    
    System.out.println("Thank you for shopping"); 
    } 
}
    
    
