package Basic_Syntax;

public class variables {
    public static void main(String[] args) {
        //Syntax type variableName = value;
        String name = "John";
        System.out.println(name);

        int myNum = 15;
        System.out.println(myNum);

        myNum = 20;  // myNum is now 20
        System.out.println(myNum);

        final int myNum1 = 15;
        //myNum1 = 20;  // will generate an error: cannot assign a value to a final variable
    }
}
