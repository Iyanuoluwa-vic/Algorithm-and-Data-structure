package Array;

public class ArrayInterview2 {
    public static void main(String[] args) {
        int[] intArray = { 2, 7, 13, 15 };

        twoSum(intArray, 20);
    }

    // sum of two number to get a specific target number.
    public static void twoSum(int intArray[], int target) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {

                if ((intArray[i] + intArray[j]) == target) {
                    System.out.println("[" + i + " , " + j + "]"); /// return the index of the two sum
                    return;
                }

            }

        }

    }
}
