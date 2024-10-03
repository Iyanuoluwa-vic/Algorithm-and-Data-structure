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
    
}
