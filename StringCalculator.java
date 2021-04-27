public class StringCalculator 
{
    public static final void add(final String numbers) 
    {
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else {
            for (String number : numbersArray) {
                Integer.parseInt(number); // If it is not a number, parseInt will throw an exception
            }
        }
    }


    //For an empty string the method will return 0
    public static final int add(final String numbers) 
    { 
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) 
        {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        } else 
        {
            for (String number : numbersArray) 
            {
                if (!number.isEmpty()) {
                    Integer.parseInt(number);
                }
            }
        }
        return 0; 
    }
}