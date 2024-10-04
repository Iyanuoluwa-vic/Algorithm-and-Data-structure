package Array.ArrayDiscussion;

public class Main {
    public static void main(String[] args) {
       
          SinglyDimesionalArray array1= new SinglyDimesionalArray(5);


          array1.ArrayInsertion(0, 30);
          array1.ArrayInsertion(1, 40);
          array1.ArrayInsertion(2, 50);


          var value1 = array1.array1[0];
          var value2 = array1. array1[1];

          System.out.println("Value 1 is " + value1 +"\n" + "value 2 is " + value2);

         
          array1.ArrayTraversal();


        // Two Dimesional Array
        TwoDimesionalArray twoDim = new TwoDimesionalArray(3, 3);

        
        twoDim.InsertInArray(0,2,25);

        twoDim.accessTwoDimesional(0,2);

        twoDim.ArrayTraversal();

    }
}
