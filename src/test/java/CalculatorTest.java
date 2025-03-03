
import org.example.calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        calculator calculator = new calculator();
        assertEquals(5, calculator.add(2, 3));
    }

}
