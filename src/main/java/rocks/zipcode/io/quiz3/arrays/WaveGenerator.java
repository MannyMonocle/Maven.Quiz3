package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    //LOGIC MAKES MORE SENSE BUT FAILS MORE TESTS
    public static String[] wave(String str) {
        int num = sizer(str);
        int count = 0;
        String[] ans = new String[num];
        if (str.length() == 0) { return ans; }


        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                ans[count] = str.substring(0, i).toLowerCase() + Character.toUpperCase(str.charAt(i)) + str.substring(i + 1, str.length()).toLowerCase();
                count++;
            }
        }

        return ans;
    }



    private static int sizer(String str){
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                count++;
        }
        return count;
    }

}