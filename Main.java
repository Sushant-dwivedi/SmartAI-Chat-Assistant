import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartAI ai = new SmartAI();
        Scanner sc = new Scanner(System.in);

        System.out.println("SmartAI Assistant Ready!");
        System.out.println("Ask anything. Type 'exit' to quit.
");

        while (true) {
            System.out.print("You: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("AI: Goodbye!");
                break;
            }

            String response = ai.getResponse(input);
            System.out.println("AI: " + response);
        }

        sc.close();
    }
}
