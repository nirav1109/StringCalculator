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


    //Method will return their sum of numbers

    public static int add(final String numbers) 
    {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) 
        {
            throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
        }
        for (String number : numbersArray) 
        {
            if (!number.trim().isEmpty()) { // After refactoring
                returnValue += Integer.parseInt(number);
            }
        }
        return returnValue;
    }

    //Allow the Add method to handle an unknown amount of numbers
    public static int add(final String numbers) 
    {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");   
        for (String number : numbersArray) 
        {
            if (!number.trim().isEmpty()) 
            { 
                returnValue += Integer.parseInt(number);
            }
        }
        return returnValue;
    }

    //Allow the Add method to handle new lines between numbers (instead of commas).
    public static int add(final String numbers) 
    {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",|n"); 
        for (String number : numbersArray) 
        {
            if (!number.trim().isEmpty()) 
            {
                returnValue += Integer.parseInt(number.trim());
            }
        }
        return returnValue;
    }



}