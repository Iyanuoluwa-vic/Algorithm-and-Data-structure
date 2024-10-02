package Array.ArrayDiscussion;

public class SinglyDimesionalArray{
    int[] array1=null;


    // CONSTRUCTOR THAT INTILIZE THE ARRAY
    public SinglyDimesionalArray(int sizeOfArray){
        array1 = new int[sizeOfArray];

        for(int i=0; i<array1.length; i++){
            array1[i] = Integer.MIN_VALUE;
        }

    }




    // Insertion into an Array
    public void ArrayInsertion(int location, int valueToInsert){

        if(array1[location] == Integer.MIN_VALUE){
            array1[location] =valueToInsert;
            System.out.println("The value was insert successfully in the array");
        }
        else{
            System.out.println("The array cell is already occupied");
        }

        
    }

    // THis Traverse an array
    public void ArrayTraversal(){
        try{
            for(int i =0; i < array1.length; i++){
            System.out.print(array1[i] + " ");
        }
        }
        catch(Exception e){
            System.out.println("The array does not exit");
        }

        
    }

}