import java.util.ArrayList;
import  java.lang.Math;
import java.util.Arrays;

public class Numbers {

    HelpfulClass helpful = new HelpfulClass();

    /*Using Test-Driven Development, create a class which has a
    method to sum all the numbers of a given array, except for the
    lowest and highest elements.

    Ensure your tests cover as many cases as possible.
     */

    public int sumNumbersWithoutTheMaxAndMin (int [] inputArray) {

        // Checking if the array isn't a null
        if (inputArray == null){
            return 0;
        }

        // Checking if the array isn't empty
        if (inputArray.length == 0 || inputArray.length == 1){
            return 0;
        }

        // Check if all elements are the same return an array with one element "0"

        if (helpful.ifAllElementsSame(inputArray)) {
            return 0;
        }

        // Move all numbers to the list

        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int number : inputArray) {
            listOfNumbers.add(number);
        }

        // Remove max and min from the list

        int smallestNumber = inputArray[0];

        for (int number: inputArray) {
            smallestNumber = Math.min(smallestNumber, number );
        }

        int largestNumber = inputArray[0];

        for (int number: inputArray) {
            largestNumber = Math.max(largestNumber, number );
        }

        for (int i = 0; i < listOfNumbers.size(); i++) {
            // if the i element of the list is equal to the smallestNumber then we remove it
            if (listOfNumbers.get(i) == smallestNumber) {
                listOfNumbers.remove(listOfNumbers.get(i));

                // if the i element of the list is equal to the largest number then we remove it
            } if (listOfNumbers.get(i) == largestNumber) {
                listOfNumbers.remove(listOfNumbers.get(i));
            }

        }

        // Sum up all the numbers

        int sumOfNumbers = 0;

        for (int element : listOfNumbers) {
            sumOfNumbers += element;
        }

        // Convert to an array with a single object

        return sumOfNumbers;
    }


}
