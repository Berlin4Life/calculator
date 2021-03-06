import de.berlin.beuth.calc.api.CalculatorApi;
import de.berlin.beuth.calc.impl.CalculatorImpl;
import de.berlin.beuth.calc.util.SizeOfText;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.AccessDeniedException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorTest {

    private CalculatorApi calculatorApi = new CalculatorImpl();

    @Test
    public void testCalculatorComputePaymentByTextSMALL(){
        try {
            int i = calculatorApi.computePaymentByText("src/test/resources/inputtext.txt");
            Assert.assertEquals(SizeOfText.SMALL.getMoney(),i);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testCalculatorComputePaymentByTextMEDIUM(){
        try {
            int i = calculatorApi.computePaymentByText("src/test/resources/inputtextMEDIUM.txt");
            Assert.assertEquals(SizeOfText.MEDIUM.getMoney(),i);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testCalculatorComputePaymentByTextLARGE(){
        try {
            int i = calculatorApi.computePaymentByText("src/test/resources/inputtextLARGE.txt");
            Assert.assertEquals(SizeOfText.LARGE.getMoney(),i);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test
    public void testCalculatorCountPictures(){
        try {
            int i = calculatorApi.countPictures("src/test/resources/inputtext.txt");
            Assert.assertEquals(8,i);
        } catch (Exception e) {
            Assert.fail();
        }
    }

    @Test(expected = AccessDeniedException.class)
    public void testCalculatorComputePaymentByTextexception() throws Exception {
            int i = calculatorApi.computePaymentByText("");

    }

    @Test
    public void testCalculatorCountPicturesMock(){
        try {

            CalculatorImpl mock = mock(CalculatorImpl.class);
            int one = mock.countPictures("one");

            when(mock.countPictures("one")).thenReturn(1);

            Assert.assertEquals(1,(mock.countPictures("one")));

        } catch (Exception e) {
            Assert.fail();
        }
    }
}