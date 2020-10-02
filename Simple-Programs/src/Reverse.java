public class Reverse {

  public static void main(String[] args) {
    //Sample Input
    String sentence = "Go work";
    String reversed = reverse(sentence);
    System.out.println("The reversed sentence is: " + reversed);
  }
// Reverse Method for reversing String
  public static String reverse(String sentence) {
    //Recusion Break Condition
    if (sentence.isEmpty())
      return sentence;

    return reverse(sentence.substring(1)) + sentence.charAt(0);
  }
}
