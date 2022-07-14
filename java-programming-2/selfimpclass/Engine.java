package selfimpclass;
// inheritance class using extends
public class Engine extends Part{
    
    // only need extra instance variables
    private String engineType;

    public Engine(String engineType, String identifier, String manufacturer, String description) {
        // super() will call superclass constructor and pass in variable
        super(identifier, manufacturer, description);
        this.engineType = engineType;
    }

    // inheritance all methods of superclass and only need extra method
    public String getEngineType() {
        return engineType;
    }
}
