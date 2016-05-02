package tiy.week6;

/**
 * Created by Dominique on 5/2/2016.
 */
public class StringExercise {
    public String reserveString(String toReverse) {
        if (toReverse == null) {
            return toReverse;
        }

        char[] toReverseArray = toReverse.toCharArray();
//        char[] reversedArray = new char[toReverseArray.length];
        int charIndex = toReverseArray.length -1;
        StringBuilder reverseBuilder = new StringBuilder();
        for (char currentChar : toReverseArray) {
            reverseBuilder.append(toReverseArray[charIndex]);
            charIndex--;
        }

        return reverseBuilder.toString();
    }
}
