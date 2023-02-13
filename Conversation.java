import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {
    // You will start the conversation here.
    System.out.print("How many rounds?");

    Scanner userInput = new Scanner(System.in);
    int round = userInput.nextInt();

    System.out.println("Hi there!  What's on your mind?");

    for (int i = 0; i < round; i++) {
      Scanner userInput2 = new Scanner(System.in);
      String text = userInput2.nextLine();
      System.out.println("Mmm-hm.");


      String words[] = text.split(" ");
      /*for (int j = 0; j < words.length; j++){
        if (words[j] == "I") {
          words[j] = "you";
        }
        else if (words[j] == "me") {
          words[j] = "you";
        }
        else if (words[j] == "am") {
          words[j] = "are";
        }
        else if (words[j] == "you") {
          words[j] = "I";
        }
        else if (words[j] == "my") {
          words[j] = "your";
        }
        else if (words[j] == "your") {
          words[j] = "my";
        } 
        System.out.print(text);
      }*/
      
    }
  }
}