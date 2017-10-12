/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author malij6756
 */
public class Quiz {

    public String reverseString(String word) {

        // creates a char array that holds all the letters
        char[] array = word.toCharArray();

        // once the word has been deconstructed to the final letter, it returns it all the way up the method
        if (word.length() == 1) {
            return word;
        }
        // the last letter of the word at the time is saved as a char
        char lastletter = array[0];
        // the last letter is removed from the word
        word = word.substring(1);
        // the word is returned to be deconstructed further with the last letter being added when the method returns up the chain, thus reversing the word
        return reverseString(word) + lastletter;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz test = new Quiz();
        System.out.println(test.reverseString("hellothere"));
    }
}
