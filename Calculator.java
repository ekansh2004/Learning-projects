import java.util.Scanner;

public class Lec3hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        float b = sc.nextFloat();
        System.out.println("enter operator");
        String op = sc.next();
        System.out.println("The answer is");
        switch (op){
            case "+": System.out.println(a + b);
                break;
            case "-": System.out.println(a - b);
                break;
            case "*": System.out.println(a * b); 
                break;
            case "x": System.out.println(a * b);
                break;
            case "/": if (b == 0){
                System.out.println("Can not divide by zero");
            } else 
                System.out.println(a / b);
                 break;
            case "%": System.out.println(a % b);
            default: System.out.println("Invalid operator");
        }
    }
}
