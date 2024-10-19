import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Quiz data: questions, options, and correct answers
        String[] questions = {
                "how many bones are in the human body?",
                "what is the hardest  natural substance on earth? ",
                "At what tempertature are fahrenheit and celcius equal?",
                "What is the largest ocean on Earth?"
        };

        String[][] options = {
                { "1) 250", "2) 300", "3) 208", "4) 206 " },
                { "1) diamond", "2) Tungsten", "3) vanadium", "4) Zirconium" },
                { "1) -40", "2) 0", "3) 100", "4) 100.1" },
                { "1) Atlantic", "2) Indian", "3) Pacific", "4) Arctic" }
        };

        int[] answers = { 3, 2, 1, 3 }; // Correct answers (by option number)
        int score = 0;

        System.out.println("Welcome to the Quiz Game!");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            ;

            long startTime = System.currentTimeMillis();
            System.out.print("Enter your answer (1-4): ");

            // Wait for answer with a 10-second timer
            while (System.currentTimeMillis() - startTime < 10000 && !scanner.hasNextInt()) {
                System.out.println("Time's running out! Please enter a number.");
            }
            ;

            if (scanner.hasNextInt()) {
                int userAnswer = scanner.nextInt();
                if (userAnswer == answers[i]) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong answer.");
                }
            } else {
                System.out.println("Time's up! Moving to the next question.");
                scanner.next(); // Clear invalid input if any
            }
        }

        // Display final score
        System.out.println("\nQuiz Over! Your score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
