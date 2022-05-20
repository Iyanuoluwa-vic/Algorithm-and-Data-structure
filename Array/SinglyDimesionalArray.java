package Array;

/**
 * Singly Linked List
 * One dimensional array represents one row or one column of array
 * elements that share a common name and is distinguishable by index values.
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
            if (arr[location] == arr[Integer.MIN_VALUE]) {
                arr[location] = valueToInsert;
            } else {
                System.out.println("The cell is already accopied");
            }
        } catch (Exception e) {
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
}
