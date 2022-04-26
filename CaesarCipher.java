import java.io.*;
import java.util.*;
public class Solution { //to keep track of index
  public static final String alpha = "abcdefghijklmnopqrstuvwxyz";
  public static String encrypt(String message, int shiftKey) {
    message = message.toLowerCase();
    String cipherText = "";
    for (int ii = 0; ii < message.length(); ii++) {
      int charPosition = aplha.indexOf(message.charAt(ii));
      int keyVal = (shiftKey + charPosition) % 26;
      char replaceVal = aplha.charAt(keyVal);
      cipherText += replaceVal;
    }
    return cipherText;
} public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.next();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    System.out.println("\nEncrpyted msg:" + encrypt(message, key));
  } //main method ends
} //Solution Class End
import java.io.*;
import java.util.*;
public class Solution { //to keep track of index
  public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

  public static String decrypt(String cipherText, int shiftKey) {
    cipherText = cipherText.toLowerCase();
    String message = "";
    for (int ii = 0; ii < cipherText.length(); ii++) {
      int charPosition = ALPHABET.indexOf(cipherText.charAt(ii));
      int keyVal = (charPosition - shiftKey) % 26;
      if (keyVal < 0) {
        keyVal = ALPHABET.length() + keyVal;
      }
      char replaceVal = ALPHABET.charAt(keyVal);
      message += replaceVal;
    }
    return message;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String message = new String();
    int key = 0;
    System.out.print("Enter the String for Encryption:");
    message = sc.next();

    System.out.println("\n\nEnter Shift Key:");
    key = sc.nextInt();
    // System.out.println("\nEncrpyted msg:"+encrypt(message, key));
    System.out.println("\nDecrypted Message:" + decrypt(message, key));

  }
}