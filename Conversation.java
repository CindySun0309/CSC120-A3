/** author = Cindy Sun
 * course = CSC120 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//import java.util.Arrays;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    System.out.print("How many rounds? ");

    Scanner userInput = new Scanner(System.in);
    int round = userInput.nextInt();

    System.out.println("Hi there!  What's on your mind?");

    ArrayList<String> responds = new ArrayList<String>();
    responds.add("Mmm-hm.");
    responds.add("Okay.");
    responds.add("I understand.");
    responds.add("Sure.");
    responds.add("I see.");
    responds.add("I can tell.");
    //System.out.println(responds);
    
    ArrayList<String> transcript = new ArrayList<String>();

    for (int i = 0; i < round; i++) {
      Scanner userInput2 = new Scanner(System.in);
      String text = userInput2.nextLine();
      transcript.add(text);

      Random rand = new Random();
      int rand_int = rand.nextInt(6);
      //System.out.println("Random Integer: " + rand_int);

      //System.out.println(responds.get(rand_int));
      //System.out.println("Mmm-hm.");


      String words[] = text.split(" ");

      Boolean use_random = true;

      for (int j = 0; j < words.length; j++){
        //System.out.println(Arrays.toString(words));
        //System.out.println(use_random);

        if (words[j].equals("I")) {
          use_random = false;
          words[j] = "you";
        }
        else if (words[j].equals("me")) {
          use_random = false;
          words[j] = "you";
        }
        else if (words[j].equals("am")) {
          use_random = false;
          words[j] = "are";
        }
        else if (words[j].equals("you")) {
          use_random = false;
          words[j] = "I";
        }
        else if (words[j].equals("my")) {
          use_random = false;
          words[j] = "your";
        }
        else if (words[j].equals("your")) {
          use_random = false;
          words[j] = "my";
        } 
      }
      if (use_random == true) {
        String random_response = responds.get(rand_int);
        System.out.println(random_response);
        transcript.add(random_response);
      }
      else {
        String result = String.join(" ", words);
        System.out.println(result);
        transcript.add(result);
      }
    }

    System.out.println("Thank you for talking with me!");


    System.out.println();

    
    System.out.println("Transcript:");
    System.out.print("How many rounds? ");
    System.out.println(round);
    System.out.println("Hi there!  What's on your mind?");
    for (int a = 0; a < transcript.size(); a++){
      System.out.println(transcript.get(a));
    }
    System.out.println("Thank you for talking with me!");





    
      
  }
}
