package selfimpclass;
// This class implement Readable Interface
// An Interface Is a Contract of Behaviour
public class TextMessage implements Readable{
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Implement the Interface method
    public String read() {
        return this.content;
    }
}
