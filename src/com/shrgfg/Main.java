package com.shrgfg;

import java.util.Locale;

public  final  class Main {

   
    public static void main(String[] args) {
        /*

        String strr = "Welcome ";
        String splitArray[] = strr.split(" ");
        //split method will break the  statemnt in multile parts
        for (int i = splitArray.length - 1; i >= 0; i--) {
            System.out.println(splitArray[i]);
        }
        /*

        Scanner sc = new Scanner(System.in);
        System.out.println("  enter the string");
        String s = sc.nextLine();
        int count = countnumberwords(s);
        System.out.println(+countnumberwords("" + count));
    }


    private static Integer countnumberwords(String s) {
        int count = 0;
        if (s.charAt(0) != ' ') {
            count++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;

    }

     */

        /*
        // wap to check first repeated elemnt in string
        char c = getfirstNonRepeatedChar("ofjghsghrsg");
        System.out.println("Non repeated     character " + c);

    }

    //to check first    repeated character in string
    public static char getfirstNonRepeatedChar(String str) {

        Map<Character, Integer> countMap = new LinkedHashMap<Character, Integer>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.containsKey(ch) ? countMap.get(ch) + 1 : 1);
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            return entry.getKey();




        //throw new RuntimeException("didnt   find   any ne   repeated chaaracter");


        // getting revrs of the string

        String input, reverse = " ";
        System.out.println("Enter the string : ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        for (int i =  input.length() -1; i>=0;i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println("  reverse string " + reverse);
   
        String reverse = " ";
        Scanner sc = new Scanner(System.in);
                String origianl = sc.nextLine();

        for (int i = origianl.length() - 1; i >= 0; i--) {
            reverse = reverse + origianl.charAt(i);
        }
        if (origianl.equals(reverse)) {
            System.out.println("  given string is pallindrome");
        } else {
            System.out.println("  given string   is not eh pallindrome");
        }

        *
          // method  one  for anagram

        String s1 = " ";
        String s2 = " ";
        System.out.println(anagram( s1, s2));
    }

        public static boolean   anagram(String s1,  String s2){
          char[]    charString1 =  s1.toCharArray();
           StringBuilder  sb = new StringBuilder(s2);
             for( char c :    charString1) {
                 int index = sb.indexOf(String.valueOf(c));
                 if (index != -1) {
                     sb.deleteCharAt(index);
                 } else {
                     return false;
                 }
             }
              return   sb.length() ==0 ;

         */

        String s1 = " abcd";
        String s2 = "dcaljnhjjoib ";
        System.out.println(anagram(s1, s2));
    }

    public static boolean anagram(String s1, String s2) {
        char[] charsring1 = s1.toCharArray();
        char[] charstring2 = s2.toCharArray();

        Arrays.sort(charsring1);
        Arrays.sort(charstring2);
        Arrays.compare(charsring1, charstring2);
        /*
        if (charstring1 == charstring2) {
            System.out.println("The given string are anagram");
        } else {
            return false;
        }

        return Arrays.equals(charsring1, charstring2);

       // return   true;
        // approach  :  2 for loop   i  for  outer lop   for each  sub
      
         String str = "abc";
           for(int  i=0;i<str.length();i++)
           {
                 for(int  j=i +1; j<  str.length() ; j++){
                     System.out.println(  str.substring(i ,j ));
                 }
           }
        //  same length
        //  contains the same character
        //  rotated around   of the character


        
        String s1 = " afh";

    }
         static void  rotate(int arr[], int  n){
          int tamp = arr[0];
          for( int i= 0; i < n ; i ++) {
              arr[i - 1] = arr[i];
          }
             arr[ n-1] =  temp;

         }


        /////////////////////////////////////////////////////////////////////////lf ////////
        String s1 = "hghv";
        System.out.println(rotationarray(s1,[]));
    }
       public  static void rotationarray(String s1, int arr[]) {
          char[]  charstring1 =  s1.toCharArray();

            int temp =  arr[0];

              for(int  i =0 ;i <arr.length;i++){
                  arr[i-1] =  arr[i];
              }
                arr[arr.length -1] =  temp;
       }

      
          public static  boolean  isRotation(  String str,  String rotatedString ){
         if(str == null ||  rotatedString  ==  null){
               return false;
         }
           else if(str.length() !=   rotatedString.length()){
         return false;
              }
           else{
      String     concatenated =  str+  str;
      return Boolean.parseBoolean(String.valueOf(concatenated.contains(rotatedString)));

              }

        String s1 = " shdc";
        // System.out.println( vowelcons(s1,5));
        //countvowel(s1);
        System.out.println(panagram(s1.toLowerCase(Locale.ROOT)));
    }

     /*


    public static int vowelcons(String s1, int n) {
          int  vowel = 5 ;
        String vowelString;
        switch (vowel) {
            case 1:
                vowelString = "  a";
                break;
            case 2:
                vowelString = " e";
                break;

            case 3:
                vowelString = " i ";
                break;

            case 4:
                vowelString = " o";
                break;

            case 5:
                vowelString = " u";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + vowel);
        }
        System.out.println(vowelString);
        return vowel;




     
    //   2nd   method'
     /*
     public static   void   countvowel(String    s1){
         int vowelCount = 0;
          int  consonantount = 0;
            for( int i= 0 ; i<s1.length();i++){
                  if(isVowel(s1.charAt(i))){
                       ++vowelCount;
                  }
                    else {
                      ++consonantount;
                  }
            }
         System.out.println("vowel count  " +   vowelCount);
         System.out.println( "  vowel  count" +    vowelCount);

     }
       public static  boolean  isVowel( char ch){
          ch =  Character.toUpperCase(ch);
            return  ( ch == 'A' || ch == 'E' ||  ch == 'I' ||  ch == 'O' ||  ch == 'U');

      */

    //  wap to find   check given  string is panagram or  not
    // panagram is a string which contains all the  alphabate characters


     //  wap to check  givem string is panagram or not
    public static boolean panagram(String s1) {

        if (s1.length() < 26) {
            return false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (s1.indexOf(ch) < 0) {
                    return false;
                }
            }
        }
        return true;

    }


}


