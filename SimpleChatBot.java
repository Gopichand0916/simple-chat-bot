/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class SimpleChatBot {

    public static String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        } else if (input.contains("how are you")) {
            return "I'm just a bot, but I'm functioning as expected!";
        } else if (input.contains("your name")) {
            return "I am your Java ChatBot.";
        } else if (input.contains("bye")) {
            return "Goodbye! Have a nice day.";
        } else if (input.contains("weather")) {
            return "I'm not connected to weather data yet, but it's always a good day to code!";
        } else if (input.contains("time")) {
            return "Sorry, I can't tell time yet, but you can check your system clock.";
        } else {
            return "I'm sorry, I don't understand that. Can you rephrase?";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ChatBot: Hello! I am your Java ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("bye")) {
                System.out.println("ChatBot: Goodbye!");
                break;
            }

            String response = getResponse(userInput);
            System.out.println("ChatBot: " + response);
        }
        scanner.close();
    }
}
