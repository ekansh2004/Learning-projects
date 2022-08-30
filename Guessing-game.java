import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         for (int n = 1; n < 4; n++){
            System.out.println("Enter your guess");
            int g = sc.nextInt();
            if (g == 7) {
                System.out.println("Your guess is right");
            }
            else switch (n){
                case 1: System.out.println("Your guess is wrong");
                    System.out.println("You have 2 guesses left");
                    System.out.println("Hint: It is greater than five");
                   break;
                case 2: System.out.println("Your guess is wrong"); 
                    System.out.println("You have 1 guess left");
                    System.out.println("Hint: It is an odd number");
                    break;
                case 3: System.out.println("Your guess is Wrong");
                    System.out.println("You are now out of guesses");
                    System.out.println("The number was 7");
                    break;
              
            }    
        }
    }
    
}
