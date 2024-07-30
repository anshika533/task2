import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class chatbot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anshika;
        System.out.println("chatbot: Hello! How can I help you today?");
        while (true) {
            System.out.print("Anshika: ");
            anshika = scanner.nextLine().toLowerCase();
            if (anshika.equals("exit") || anshika.equals("quit")) {
                System.out.println("chatbot: Goodbye!");
                break;
            }
            String response = generateResponse(anshika);
            System.out.println("chatbot: " + response);
        }
        scanner.close();
    }

    // private static String generateDay(String date){
    //     System.out.println(date);
    //     return "days";
    // }
    private static String generateResponse(String input) {
        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        } else if (input.contains("who are you") || input.contains("what are you")) {
            return "I am a simple rule-based chatbot. How can I assist you?";
        } else if (input.contains("help")) {
            return "Sure, I'm here to help! What do you need assistance with?";
        } else if (input.contains("time")) {
            return "The current time is " + LocalTime.now().toString() + ".";
        } else if (input.contains("bye") || input.contains("goodbye")) {
            return "Goodbye! Have a great day!";
        } else if (input.contains("date")) {
            return "Today's date is " + LocalDate.now().toString() + ".";
        }else if (input.contains("day")) {
           return (LocalDate.now().getDayOfWeek().toString());
            
        }else if (input.contains("month")) {
            return (LocalDate.now().getMonth().toString());
             
         }

         else {
            return "I'm sorry, I don't understand that. Can you please rephrase?";
        }
    }

    
}
