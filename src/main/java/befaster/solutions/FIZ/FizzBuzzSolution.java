package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        //throw new SolutionNotImplementedException();
        boolean multi3 = false;
        boolean multi5 = false;
        boolean deluxe = false;
        boolean fakeDeluxe = false;


        if(multipleOf(number, 3) || containsValOf(number, 3))
            multi3 = true;

        if(multipleOf(number, 5) || containsValOf(number, 5))
            multi5 = true;

        if( (isDeluxe(number, multipleOf(number, 3), 3)) ||
                (isDeluxe(number, multipleOf(number, 5), 5))) {
            deluxe = true;
            if(isOdd(number)){
                fakeDeluxe = true;
            }
        }




        if(!multi3 && !multi5 && !deluxe)
            return Integer.toString(number);

        if(multi3 && multi5 && deluxe) {
            if(fakeDeluxe)
                return "fizz buzz fake deluxe";
            return "fizz buzz deluxe";
        }
        else if(multi3 && multi5) {
            return "fizz buzz";
        }
        else if (multi3) {
            if(deluxe) {
                if(fakeDeluxe)
                    return "fizz fake deluxe";
                return "fizz deluxe";
            }
            return "fizz";
        }
        else if (multi5) {
            if(deluxe) {
                if(fakeDeluxe)
                    return "buzz fake deluxe";
                return "buzz deluxe";
            }
            return "buzz";
        }
        else if(fakeDeluxe) {
            return "fake deluxe";
        }
        else if (deluxe)
            return "deluxe";

        return Integer.toString(number);
    }

    private boolean multipleOf(Integer givenNumber, Integer multipleOf) {
        if((givenNumber % multipleOf) == 0 )
            return true;

        return false;
    }

    private boolean containsValOf(Integer givenNumber, Integer valOf) {
        String numStr = Integer.toString(givenNumber);
        char charToCheck = Integer.toString(valOf).charAt(0);
        boolean result = false;

        for(int i = 0; i < numStr.length(); i++) {
            if( numStr.charAt(i) == charToCheck) {
                result = true;
                break;
            }
        }
        return result;
    }

    private boolean isDeluxe(Integer givenNumber, boolean divisibleBy, Integer divisible) {
        boolean result = true;
        if (!divisibleBy)
            return false;

        String numStr = Integer.toString(givenNumber);
        char charToCheck = Integer.toString(divisible).charAt(0);

        result = containsValOf(givenNumber, divisible);

        return result;
    }

    private boolean isOdd(Integer number) {

        if ((number % 2) == 0)
            return false;

        return true;
    }


}
