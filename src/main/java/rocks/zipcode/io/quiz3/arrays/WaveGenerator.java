package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    //LOGIC MAKES MORE SENSE BUT FAILS MORE TESTS
    public static String[] wave(String str) {
        String[] ans = new String[str.length()];
        if (str.length() == 0) {
            return ans;
        }

        ans[0] = Character.toUpperCase(str.charAt(0)) + str.substring(1, str.length()).toLowerCase();

        for (int i = 1; i < str.length() - 1; i++) {
            ans[i] = str.substring(0, i).toLowerCase() + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1, str.length()).toLowerCase();
        }

        ans[str.length() - 1] = str.substring(0, str.length() - 1).toLowerCase() + Character.toUpperCase(str.charAt(str.length() - 1));


        return ans;
    }

}