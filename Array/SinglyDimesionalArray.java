package Array;

/**
 * One dimensional array : an array with a bunch of values having been declared
 * with a single index
 * 
 * 
 */

public class SinglyDimesionalArray {
    int arr[] = null; // create a null array

    // constructor than create an array
    public SinglyDimesionalArray(int size) {
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE; // Hold lowest value integer can have
        }
    }

    // insert to a specific location in an array
    public void arrayInsertion(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
            } else {
                System.out.println("The cell is already accopied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The array is full");
        }

    }

    // traverse an array to print out all the element
    public void traveringAnArray() {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (Exception e) {
            System.out.println("Array doesnt exist");
        }

    }

    // Locate an element in array
    public void LocateElement(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Value was found at index: " + i);
                return;
            } else {
                System.out.println("Value was not found");
            }
        }

    }

}
