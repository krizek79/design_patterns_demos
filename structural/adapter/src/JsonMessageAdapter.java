public class JsonMessageAdapter implements Message {

    private JsonMessage jsonMessage;

    public JsonMessageAdapter(JsonMessage jsonMessage) {
        this.jsonMessage = jsonMessage;
    }


    @Override
    public String getContent() {
        return "Parsed from JSON: " + this.jsonMessage.getJson();
    }
}
