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