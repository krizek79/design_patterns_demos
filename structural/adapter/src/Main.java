public class Main {

    public static void main(String[] args) {
        Client client = new Client();

        Message textMessage = new TextMessage("Hello world!");
        client.printMessage(textMessage);

        JsonMessage jsonMessage = new JsonMessage("{\\\"message\\\":\\\"Hello world!\\\"}");
        Message adaptedMessage = new JsonMessageAdapter(jsonMessage);
        client.printMessage(adaptedMessage);
    }
}