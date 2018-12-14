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

        if(isDeluxe(number)) {
            deluxe = true;

            if(isOdd(number)){
                fakeDeluxe = false;
            }
        }




        if(!multi3 && !multi5 && !deluxe)
            return Integer.toString(number);

        if(multi3 && multi5 && deluxe) {
            return "fizz buzz deluxe";
        }
        else if(multi3 && multi5) {
            return "fizz buzz";
        }
        else if (multi3) {
            if(deluxe)
                return "fizz deluxe";
            return "fizz";
        }
        else if (multi5) {
            if(deluxe)
                return "buzz deluxe";
            return "buzz";
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

    private boolean isDeluxe(Integer givenNumber) {
        boolean result = true;
        if (givenNumber < 10)
            return false;

        String numStr = Integer.toString(givenNumber);
        char charToCheck = numStr.charAt(0);

        for(int i = 0; i < numStr.length(); i++) {
            if( numStr.charAt(i) != charToCheck) {
                result = false;
                break;
            }
        }

        return result;
    }

    private boolean isOdd(Integer number) {

        if ((number % 2) == 0)
            return false;

        return true;
    }


}



