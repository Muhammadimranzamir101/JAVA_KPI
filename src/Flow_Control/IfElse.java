package Flow_Control;

public class IfElse {
    public static void main(String[] args) {

        int a = 10;

        //if statement --> It executes the if block, if condition is true.
        if (a > 10) {
            System.out.println("A is greater than 10");
        }

        //if-else statement --> It executes the if block if condition is true otherwise else block is executed.
        if (a > 10) {
            System.out.println("A is greater than 10");
        } else {
            System.out.println("A is not greater than 10");
        }

        //if-else-if ladder --> executes one condition from multiple statements.
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }

        //Nested if statement --> the inner if block condition executes only when outer if block condition is true.
        int age = 20;
        int weight = 80;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            }
        }


    }
}
