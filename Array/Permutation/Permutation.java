package Array.Permutation;

/**
 * permutation is used to see if two array have the same value no matter what
 * index they are in.
 * Use the sum and multiplication of each array to see if they are alike
 * 
 */
public class Permutation {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5 };
        int[] array2 = { 5, 4, 3, 2, 1, 0 };

        boolean value = permutation(array1, array2);

        if (value == true) {
            System.out.println("They are permutation of each other");
        } else {
            System.out.println("They are not permutation of each other");

        }
    }

    // Permutation of two array
    public static boolean permutation(int array1[], int array2[]) {
        boolean value = false;

        if (array1.length != array2.length) {
            value = false;
        }

        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            mult1 *= array1[i];

        }

        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
            mult2 *= array2[i];

        }

        if ((sum1 == sum2) && (mult1 == mult2)) {
            value = true;
        }

        return value;

    }
}
