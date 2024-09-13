import java.util.Scanner;

class NumberGuessing {
    public static void guessingNumberGame() {
        int number = 1 + (int) (100 * Math.random());
        int trail = 5, i;
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println(
                    "\n-------------------------------------- WELCOME IN NUMBER GUESSING GAME -------------------------------------------------------");
            System.out.println("\nGuess a number  between 1 to 100  within 5 trails.");
            Scanner s = new Scanner(System.in);

            for (i = 0; i < trail; i++) {
                System.out.print("Enter The Guess Number: ");
                int guess = s.nextInt();

                if (guess == number) {
                    System.out.println("Congratulations!!.. You guessed the number.");
                    break;
                } else if (number > guess) {
                    System.out.println("Opps!! Wrong Guess! The number is greater than " + guess);
                } else if (number < guess) {
                    System.out.println("Opps!! Wrong Guess! The number is less than " + guess);
                }
            }

            if (i == trail) {
                System.out.println("You have exhausted all the trials.");
                System.out.println("The number was " + number + "\n");
                System.out.println("Want to play again(Yes/No)?");
                String ch = s.next();
                choice = ch;
            }

        }
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}