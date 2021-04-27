import org.junit.Test;
import com.wordpress.technologyconversations.tdd.StringCalculator;
 
public class StringCalculatorTest {
    @Test(expected = RuntimeException.class)
    public final void whenMoreThan2NumbersAreUsedThenExceptionIsThrown() {
        StringCalculator.add("1,2,3");
    }
    @Test
    public final void when2NumbersAreUsedThenNoExceptionIsThrown() {
        StringCalculator.add("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void whenNonNumberIsUsedThenExceptionIsThrown() {
        StringCalculator.add("1,X");
    }


    //For an empty string the method will return 0
    @Test
    public final void whenEmptyStringIsUsedThenReturnValueIs0() 
    {
        Assert.assertEquals(0, StringCalculator.add(""));
    }

    //Method will return their sum of numbers
    @Test
    public final void whenOneNumberIsUsedThenReturnValueIsThatSameNumber() 
    {
        Assert.assertEquals(3, StringCalculator.add("3"));
    }    
    @Test
    public final void whenTwoNumbersAreUsedThenReturnValueIsTheirSum() 
    {
        Assert.assertEquals(3+6, StringCalculator.add("3,6"));
    }

     //Allow the Add method to handle an unknown amount of numbers

      @Test
    public final void whenAnyNumberOfNumbersIsUsedThenReturnValuesAreTheirSums() 
    {
        Assert.assertEquals(3+6+15+18+46+33, StringCalculator.add("3,6,15,18,46,33"));
    }

}