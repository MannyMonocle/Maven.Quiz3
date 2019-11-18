package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        return null;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return null;
    }

    public static String[] getAllSubStrings(String string) {
        int size = getNumberOfSubStrings(string);
        String[] ans = new String[size];
        int count = 0;

        for(int i = 0; i < string.length() - 1; i++){
            for (int j = 0; j < string.length() + 1 - i; j++){
                ans[count] = string.substring(i, j);
                count++;
            }
        }

        return ans;
    }

    public static Integer getNumberOfSubStrings(String input){
        int count = 0;

        for(int i = 1; i < input.length(); i++){
            for (int j = 0; j < input.length() + 1 - i; j++){
                count++;
            }
        }
        return count;
    }
}
