
package propoal;
import java.util.Scanner;

public class Propoal {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Did the guy come with flower? (yes/no): ");
   String hasFlower = scanner.next().trim().toLowerCase();
   
      
    System.out.print("Did the guy come with diamond ring? (yes/no): ");
    String hasDiamondRing = scanner.next().trim().toLowerCase();
    
    
    System.out.print("Enter the number of time the crowd shouted 'SAY YES':");
    int crowdshoutedYes = scanner.nextInt();
    
     
    }      
    
}
