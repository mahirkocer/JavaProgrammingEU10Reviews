package week05_10_08_2022;

public class StringMethods {

    public static void main(String[] args) {
        //if we want to get specific char. charAt();
                  //0123
        String str="Adam";
        System.out.println(str.charAt(0)); //first char
        System.out.println(str.charAt(3)); //fourth char

        // if we want to get the length of String length()
        System.out.println(str.length());
        // get the last character
        int lengthOfTheString = str.length();
        int indexOfLastChar=lengthOfTheString-1;
        System.out.println(str.charAt(indexOfLastChar));

        // in order to make letters lower case toLowerCase()
        System.out.println(str.toLowerCase());

        // in order to make letters upper case toUpperCase()
        System.out.println(str.toUpperCase());

        // in order to remove spaces before and after your string trim()
        String str1="    Adam    ";
        System.out.println(str1.trim());

        System.out.println(str1); // we will ahve spaces in here bacause String class is immutable

        // if you want to get index of char or string we need to ise indexOf() method
              //indexes0123456
        String number="0123456";
        // get the index of 3
        System.out.println(number.indexOf('3')); // index of 3 is three
        // get the index of 56
        System.out.println(number.indexOf("56"));
        //get the index of 14
        System.out.println(number.indexOf("14")); //  it will return -1 means that there is no 14 in that string

        String sentence="Java is a programming language";

        System.out.println(sentence.indexOf(" programming "));
                       //01234567891011
        String sentence1="Java is Java";
        System.out.println(sentence1.indexOf("Java")); // return me 0
        System.out.println(sentence1.lastIndexOf("Java")); //return me 8
        // if we want to replace some part of the string we need to use replace() or replaceFirst()
        
        String sentence3="Java is a hard prog language";
        System.out.println(sentence3.replace("hard", "easy"));
        System.out.println(sentence3.replace("hard","fun"));


        String sentence4="java is not same  with java";
        System.out.println(sentence4.replaceFirst("java", "c#"));




    }
}
