package Arrays;

public class arraysBasics {
    public static void main(String[] args) {
        //Declaration ---> dataType[] arrayName;
        double[] data = new double[10];

        //Initialization
        data[0] = 1.5;
        data[1] = 2.5;

        //declare and initialize and array
        int[] age = {12, 4, 5, 2, 5};

        // access array elements ----> array[index]
        System.out.println("Accessing Elements of Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for(int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }

    }

}
