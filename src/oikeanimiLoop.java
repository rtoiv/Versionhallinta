import java.util.Scanner;

public class oikeanimiLoop {
    public static void main(String[] args) {
       //arvaa oikea nimi
       
        Scanner scanner = new Scanner(System.in);
        String oikeanimi = "Emma";
        int yritykset = 0;

        while (true) {
            
            System.out.println("Guess my name (type stop to exit)");
            String userInput = scanner.nextLine().trim();

            if (userInput.equalsIgnoreCase("stop")) {
                break;
            }

            yritykset++;

            if (userInput.equalsIgnoreCase(oikeanimi)) {
                System.out.println("Congratulations!");
                break;
            }
        }

        
        System.out.println("You guessed " + yritykset + " times.");
        scanner.close();
    }
}
