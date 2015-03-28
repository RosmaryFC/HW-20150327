package nyc.c4q.RosmaryFC;

/**
 * Created by c4q-rosmary on 3/26/15.
 *
 * 3. Cryptography : Caesar Cipher

 The Roman General Julius Caesar used to correspond with his generals using a secret code.
 He devised a way of encrypting his messages using a simple encryption scheme now known as Caesar Cipher or Shift Cipher.
 You can read more about it here

 You are given a class called CaesarCipher with static methods encode and decode
 Being amateur codebreakers, we want to know if two distinct looking ciphers correspond to the same input message.
 Write a function called codeBreaker, which accepts two cipher strings and returns a boolean value which tells us
 whether they are actually the same input message encoded using two different offsets.
 There are multiple ways to do this. Try to come up with as many solutions as you can.
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Class for Encoding and Decoding CaesarCiphers
 */
public class CaesarCipher {
    public static Boolean codeBreaker(String cipherOne, String cipherTwo){
    ArrayList<String> canditateText = new ArrayList<String>();

        for(int i = 0; i < 26 ; i ++) { // this loop will go through all 26 possible decryption shifts.
            //System.out.println(CaesarCipher.encode(cipherOne, i));
            canditateText.add(CaesarCipher.encode(cipherOne, i));
        }

        if(canditateText.contains(cipherTwo)) {// checks to  see if cipherTwo is equal to one of the Strings in the Array
            return true;
        }

        return false;
    }

    public static String decode(String enc, int offset) {
        return encode(enc, 26-offset);
    }

    public static String encode(String enc, int offset) {
        offset = offset % 26 + 26;
        StringBuilder encoded = new StringBuilder();
        for (char i : enc.toCharArray()) {
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encoded.append((char) ('A' + (i - 'A' + offset) % 26 ));
                } else {
                    encoded.append((char) ('a' + (i - 'a' + offset) % 26 ));
                }
            } else {
                encoded.append(i);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string to encode");
//
//        String input = sc.nextLine();
//        String encoded = CaesarCipher.encode(input, 25);
//        System.out.println(encoded);
//
//        String decoded = CaesarCipher.decode(encoded, 25);
//        System.out.println(decoded);

        System.out.println("Enter two strings to determine whether they are the same input with different offsets");

        String cipherOne = sc.nextLine();
        String cipherTwo = sc.nextLine();

        System.out.println(codeBreaker(cipherOne, cipherTwo));
    }
}