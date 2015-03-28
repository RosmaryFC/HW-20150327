package nyc.c4q.RosmaryFC;
/**
 * Created by c4q-rosmary on 3/25/15.
 * 1. Recap: Strings and loops

 Write a function uniqueCharacters which accepts as input a string S.
 Given the string S return a string S2 which contains all the distinct characters in S.
 The input string will only contain lowercase characters. The ordering of characters in the output string does not matter.
 Eg.

 abbcaabcaa --> abc
 apple --> aple or aepl
 microsoft --> microsft
 */

import java.util.Scanner;

public class recapStringsAndLoops {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(uniqueCharacters("microsoft")); //
    }

    public static String uniqueCharacters (String originalTxt) {
        String uniqueTxt = "";//will contain all the distinct characters in originalTxt
        uniqueTxt += originalTxt.charAt(0); // a -- since it is the first character it is automatically included

        for(int i = 0; i < originalTxt.length(); i ++) { // goes through String originalTxt
            boolean charIsUnique = true;

            for(int j = 0; j < uniqueTxt.length(); j++) {// goes through String uniqueTxt
                if(originalTxt.charAt(i) == uniqueTxt.charAt(j)) {
                    charIsUnique = false;
                    break;// break out of loop if uniqueTxt already contains charAt originalTxt
                }
            }
            if(charIsUnique) {
                uniqueTxt += originalTxt.charAt(i);
            }

        }


        return uniqueTxt;
    }
}
//char currentChar = S2.charAt(i);
//
//char[] chars = S.toCharArray(); // makes all characters in String be put into an array called chars
//Arrays.sort(chars);//sorts array into ascending numerical order