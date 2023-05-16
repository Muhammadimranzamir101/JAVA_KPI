package Arrays;

import java.util.Arrays;

public class arraysMethods {
    public static void main(String[] args) {

        int[] numbers = {12, 4, 5, 2, 5};

        //length: Returns the length of the array (the number of elements it can hold).
        System.out.println("The length of the array is: "+numbers.length);

        //clone: Creates a copy of the array.
        System.out.println("Clone of the array:");
        int[] numbersCopy = numbers.clone();
        for (int number:
             numbersCopy) {
            System.out.print(number+" ");
        }

        //toString: Converts the array to a string representation.
        String arrayStr = Arrays.toString(numbers);
        System.out.println("\nArray converted to string: "+ arrayStr);
        System.out.println(arrayStr + " is of type " + arrayStr.getClass().getSimpleName());

        //sort: Sorts the array elements in ascending order.
        System.out.println("Array in ascending order: ");
        Arrays.sort(numbersCopy);
        for (int i=0; i<numbersCopy.length; i++) {
            System.out.print(numbersCopy[i]+" ");
        }

        //fill: Assigns a specific value to each element of the array.
        System.out.println("\nArray after fill: ");
        Arrays.fill(numbersCopy, 0);
        for (int i=0; i<numbersCopy.length; i++) {
            System.out.print(numbersCopy[i]+" ");
        }

        //copyOf: Creates a new array with a specified length and copies elements from the original array.
        int n =3;
        int[] copyArr = Arrays.copyOf(numbers, n);
        System.out.println("\nNew array with first "+n+" digits:");
        for (int i=0; i<copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }
}
