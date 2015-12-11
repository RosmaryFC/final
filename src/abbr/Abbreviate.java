package abbr;

public class Abbreviate {

    /**
     * Abbreviates a string by removing all vowels.
     *
     * Returns a new string that is equal to 'string' but with all vowels, both capital and
     * lower case, removed.  Other characters are unmodified.
     */
    public static String abbreviate(String string) {
        String abbreviatedString = "";
        for(int i = 0; i < string.length(); i ++){
            if (! isVowel(string.toLowerCase().charAt(i))){
                abbreviatedString += string.charAt(i);
            }
        }

        return abbreviatedString;
    }

    public static boolean isVowel(char letter){
        String vowels = "aeiou";
        for(int i = 0; i < vowels.length(); i ++){
            if (letter == vowels.charAt(i)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "The quick brown fox jumped over the lazy dogs.";
        System.out.println(abbreviate(s.toUpperCase()));

        System.out.println(abbreviate("The quick brown fox jumped over the lazy dogs."));
        System.out.println(abbreviate("It was the best of times, it was the worst of times."));

    }

}
