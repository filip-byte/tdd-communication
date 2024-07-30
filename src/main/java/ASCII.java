public class ASCII {

    public int calculateAsciiValue(String input) {

        int sumOfAscii = 0;

        // iterate through input String
        for (int i = 0; i < input.length(); i++) {
            sumOfAscii += (int) input.charAt(i);
        }

        // for each of the characters calculate ascii value by casting char to an int
        // return the value

        return sumOfAscii;
    }

}
