public class Mean {

   public double meanValueOfAllIntegers(int[] input) {

       if(input.length == 0) {
           return 0;
       }

       // iterate through elements in array and add them up then assign to a variable

       int result = 0;

       for(int element : input) {
           result += element;
       }

   // divide by the number of elements in array

       double mean = (double) result / input.length;

       return mean;
// account for doubles



    }
}
