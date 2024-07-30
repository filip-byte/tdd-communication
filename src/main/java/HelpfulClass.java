public class HelpfulClass {

    public boolean ifAllElementsSame (int[] input){
        int first = input[0];
        for (int i=1; i<input.length; i++)
            if (input[i] != first)
                return false;
        return true;
    }


}
