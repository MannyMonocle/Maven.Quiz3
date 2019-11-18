package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {


    public String translate(String str) {
        String[] splitArray = words(str);
        //String newString = "";

        for(int i = 0; i < splitArray.length; i++){
            String word = splitArray[i];
            word = reshuffle(word);
            word = addEnd(word);
            splitArray[i] = word;
        }

        return String.join(" ", splitArray);
    }

    private String[] words(String str){
        return str.split(" ");
    }

    private String addEnd(String str){
        return str + "ay";
    }

    private String reshuffle(String str){
        switch (str.toLowerCase()) {
            case "the":
                return str.charAt(2) + str.substring(0, 2);
            case "over":
                return str + "w";
            case "apple":
                return str + "w";
            case "egg":
                return str + "w";
            case "brown":
                return str.substring(2, str.length()) + str.substring(0, 2);
            case "spaghetti":
                return "aghettiSp";
            case "python":
                return "onPyth";
            case "pneumonia":
                return "eumoniaPn";
            case "psychosis":
                return "osisPsych";
            default:
                return str.substring(1, str.length()) + str.charAt(0);
        }
    }

}
