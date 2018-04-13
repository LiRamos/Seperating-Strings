import java.util.Arrays; //importing Arrays class so I may use arrays
import java.util.Scanner; //importing Arrays class so I may use the scanner to take user input.
public class DelimiterInclusion {//Beginning of main class
public static void  main (String[] args){// Beginning of main method.


    Scanner reader = new Scanner(System.in); //Creating Scanner object.
    System.out.println("Please enter your text.");//Asking user for text to be split.
    String input = reader.nextLine(); //Collecting String
    System.out.println("Now please enter the character you want to use to split these characters"); //Asking user for their chosen delimiter.
    String splitter = reader.next(); //Collecting delimiter from user.

split(input, splitter); //Calling method defined below.
}
    private static void split(String input, String splitter) { //Declaring method with input and splitter arguments.

        System.out.println(Arrays.toString(input.split("((?<=" + splitter + ")|(?=" + splitter +"))"))); //Taking input string and printing it as array with delimiter splitting it, and appearing as well.



    }
}