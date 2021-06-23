package com.shrgfg;

import java.util.Arrays;

public class str {

     static boolean  Anagram(String s1, String s2){
          if(s1.length() !=    s2.length())
              return  false;

             char a1[] =  s1.toCharArray();
             Arrays.sort(a1);

          s1 =  new String(a1);
          //converting string to array first
          char a2[] =  s2.toCharArray();
          Arrays.sort(a2);
          s2 =  new String(a2);
            // returning the if equal value
          return  s1.equals(s2);
     }
    /*
    static boolean isPallindrome(String str) {

        int i = 0,   j =   str.length() -1;

        while( i < j){
            if(str.charAt(i) !=   str.charAt(j))
                return false;
            i ++;
            j--;

        }
        return true;

    }

     */
}
