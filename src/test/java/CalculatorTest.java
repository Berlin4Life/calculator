import de.berlin.beuth.calc.api.CalculatorApi;
import de.berlin.beuth.calc.impl.CalculatorImpl;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private CalculatorApi calculatorApi = new CalculatorImpl();

    @Test
    public void testCalculatorComputePaymentByText(){
        try {
            int i = calculatorApi.computePaymentByText("src/test/resources/inputtext.txt");
            Assert.assertEquals(0,i);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testCalculatorCountPictures(){
        try {
            int i = calculatorApi.countPictures("src/test/resources/inputtext.txt");
            Assert.assertEquals(0,i);
        } catch (Exception e) {
            Assert.fail();
        }
    }
}
