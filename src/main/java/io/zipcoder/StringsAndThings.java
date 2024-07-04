package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {

        int count = 0;
        String[] counter = input.split(" ");//split the words into an array of word
        for (int i = 0; i < counter.length; i++) {
            if (counter[i].trim().endsWith("y") || counter[i].trim().endsWith("z")) {//iterating through words, trim white spaces, and checked if the word ends with y or z
                count++;
            }
        }

//        for (int i = 0; i < input.length() - 1; i++) {
//            if (((input.charAt(i)) == 'z' || input.charAt(i) == 'y') && !Character.isLetter(input.charAt(i + 1))) {
//                count++;
//            }
//        }
//            if (input.charAt(input.length() - 1) == 'z' || input.charAt(input.length() - 1) == 'y') {
//                count++;
//            }


        return count;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {

        System.out.println(base.replace(remove, ""));

        return base.replace(remove, "");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {

        String is = input.replaceAll("is", "");//remove all occurences of is
        String not = input.replaceAll("not", "");//remove all occurences of not

        int notCount = ((input.length() - not.length()) / 3);//count how many times not appears
        int isCount = ((input.length() - is.length()) / 2);//count how many times is appears

        return notCount == isCount;//return true if not and is appears the same amount of times
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {

    int g = input.length(); //getting length of input to use in the loop
        boolean found = false; //setting found to equal true
        char letterG = 'g';
        for (int i = 0; i < input.length(); i++) {

            if ( input.charAt(i) == letterG && input.charAt(i+1)==letterG){
                found = true;

            }


            else if (input.charAt(i) == letterG && input.charAt(i-1)==letterG){
               found = true;
            }
            else if (input.charAt(i)==letterG){
                found = false;
            }
        }
//            char g = input.charAt(i);
//            String g = String.valueOf(input.charAt(i));
////            String gString = input.substring(i, i+1);//exctract each character
//            if (gString.equals("g") ) {// check if there is a character before and after g
//                if (letterG == gString.charAt(i-2)) {
//                    found = true;
//                } else if (letterG == gString.charAt(i - 1)) {
//                    found = true;
//                } else found = false;
//            }
////
//        }

            return found;
        }


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */
        public Integer countTriple (String input){

            int s = input.length();//getting length of string to put in loop
            int count = 0;

            for (int i = 0; i < s - 2; i++) {//iterating through the string
                char c = input.charAt(i);//getting character at index i
                if (c == input.charAt(i + 1) && c == input.charAt(i + 2)) {//counting if i character is the same as the next 2 characters
                    count++;
                }

            }


            return count;
        }

}