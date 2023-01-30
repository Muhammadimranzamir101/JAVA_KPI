package Basic_Syntax;

public class operators {
    public static void main(String[] args) {

        // Unary Operator
        int x=10;
        System.out.println(x++); // postfix Inc --> first used in program and then increased
        System.out.println(++x);// prefix Inc --> first increased and then used in program
        System.out.println(x--);// first used in program and then dec
        System.out.println(--x);// first dec and then used in program.
        // ~ is bitwise not operator, converts each bit of the binary representation of the input
        System.out.println(~10);

        //Arithmetic operation
        System.out.println(10*10/5+3-1*4/2);

        //LeftShift Operator (Multiply with 2^n)
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        //RightShift Operator (Divided with 2^n)
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        //Logical && and ||
        int a=10;
        int b=5;
        int c=20;
        System.out.println(a<b&&a<c);//false && true = false
        System.out.println(a<b&a<c);//false & true = false
        System.out.println(a>b||a<c);//true || true = true
        System.out.println(a>b|a<c);//true | true = true

        //Ternary Operator --> (condition) ? (return if true) : (return if false);
        int min=(a<b)?a:b;
        System.out.println("Min : "+min);


    }
}
