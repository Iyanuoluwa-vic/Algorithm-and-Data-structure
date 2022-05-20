package Array;

/**
 * Singly Linked List
 * One dimensional array represents one row or one column of array
 * elements that share a common name and is distinguishable by index values.
 */

public class SinglyDimesionalArray {
    int arr[] = null; // create a null array

    public SinglyDimesionalArray(int size) {// constructor than create an array
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE; // Hold lowest value integer can have
        }
    }

    public void arrayInsertion(int location, int valueToInsert) { // insert to a specific location in an array
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
}
