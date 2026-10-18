import java.util.Scanner;

public class käyttäjänsyöte2 {
    public static void main(String[] args) throws Exception {
        //if, else, kysy nimi, jos ei vastausta=error, jos vastaus printtaa
        Scanner in = new Scanner(System.in);
        String input ; 
        System.out.println("What is your name?");
        input = in.nextLine();

        if (input.equals(""))
        {
            System.out.println("Error");
        }
        else
        {
            System.out.println("Your name is " + input + ".");
        }

    }
}            
