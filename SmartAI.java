import java.util.HashMap;

public class SmartAI {

    HashMap<String, String> responses = new HashMap<>();

    public SmartAI() {
        responses.put("hello", "Hello! How can I assist you today?");
        responses.put("hi", "Hi! What would you like to know?");
        responses.put("java", "Java is a high-level, object-oriented programming language.");
        responses.put("ai", "AI stands for Artificial Intelligence, used to build smart systems.");
        responses.put("your name", "I am SmartAI, your Java-based assistant.");
    }

    public String getResponse(String input) {
        input = input.toLowerCase();

        for (String key : responses.keySet()) {
            if (input.contains(key)) {
                return responses.get(key);
            }
        }
        return "Sorry, I don't understand that yet. But I'm learning!";
    }
}
