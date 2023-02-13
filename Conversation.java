import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
//import java.util.Arrays;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    System.out.print("How many rounds?");

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
    
    for (int i = 0; i < round; i++) {
      Scanner userInput2 = new Scanner(System.in);
      String text = userInput2.nextLine();

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
        System.out.println(responds.get(rand_int));
      }
      else {
        String result = String.join(" ", words);
        System.out.println(result);
      }
    }
    
      
  }
}
