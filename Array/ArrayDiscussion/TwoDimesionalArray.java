package Array.ArrayDiscussion;

public class TwoDimesionalArray {

    int[][] twoDimesionalArray =null;


    public TwoDimesionalArray(int rows, int coloumns){

        twoDimesionalArray =new int[rows][coloumns];


       for(int row=0; row < twoDimesionalArray.length; row++){
        for(int coloumn=0; coloumn < twoDimesionalArray[0].length; coloumn++){

            twoDimesionalArray[row][coloumn] =Integer.MIN_VALUE;
        }
       }
    } 


    public void InsertInArray(int row , int column, int value){
        
        try{
            if(twoDimesionalArray[row][column] == Integer.MIN_VALUE){
                twoDimesionalArray[row][column] = value;
                System.out.println("The value was inserted in the cell");
            }
            else{
                System.out.println("the cell is already occupied");
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array is out of bound");
        } 

    }
    

    // Access a two dimesional array
    public void accessTwoDimesional(int row, int col){

            try{
               System.out.println(twoDimesionalArray[row][col]);
            }
            catch(ArrayIndexOutOfBoundsException e){
               System.out.println("Array is out of bound");
            }

    }

    // Array Traversal
    public void ArrayTraversal(){
        for(int row=0; row <twoDimesionalArray.length; row++){
            for(int col=0; col < twoDimesionalArray[0].length; col++){

                System.out.print(twoDimesionalArray[row][col] + " ");

            }
            System.out.println();
        }

    }

}
