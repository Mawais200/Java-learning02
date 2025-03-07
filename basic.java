import java.util.Scanner;

public class basic {
    public static void main(String[] args){
        //chexk the condition is number even or odd?
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        sc.close();



        //check condition fail or pass by ternary operator
        int marks = 56;
        String Reportcards = marks>33? "pass":"fail";
        System.out.println(Reportcards);
    
        // use switch statement
        int n = 2;
        switch(n){
            case 1: System.out.println("samosa"); break;
            case 2: System.out.println("burger"); break;
            case 3: System.out.println("pizza"); break;
            default: System.out.println("Invalid choice");
        }
    }
}
