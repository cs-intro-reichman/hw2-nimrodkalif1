// Prints a crowd cheering output.
public class Cheers {
    public static void main(String[] args) {
            String word = args[0].toUpperCase();
            int repetitions = Integer.parseInt(args[1]);

            for (char c: word.toCharArray()) {
                if ("AEFHILMNORSX".indexOf(c) != -1)
                    System.out.println("Give me an " + c  + ": " + c + "!");
                else
                    System.out.println("Give me a  " + c  + ": " + c + "!");
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < repetitions; i++)
                System.out.println(word + "!!!");
    }
}
