package Array.ArrayDiscussion;

public class TwoDimesionalArray {

    int[][] twoDimesionalArray =null;


    public TwoDimesionalArray(int rows, int coloumns){

       for(int row=0; row < twoDimesionalArray.length; row++){
        for(int coloumn=0; coloumn < twoDimesionalArray[0].length; coloumn++){

            twoDimesionalArray[row][coloumn] =Integer.MIN_VALUE;
        }
       }
    } 
    
}
