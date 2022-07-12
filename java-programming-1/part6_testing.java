import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class part6_testing {
    
    /* Stack Trace */

    /* Unit Testing */
    @Test
    public void calculatorInitialValueZero() {
        WordSet calculator = new WordSet();
        assertEquals(0, calculator.contains("Helllo"));
    }
}
