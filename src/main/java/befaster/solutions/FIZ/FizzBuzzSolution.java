package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        //throw new SolutionNotImplementedException();
        boolean multi3 = multipleOf(number, 3) || containsValOf(number, 3);
        boolean multi5 = multipleOf(number, 5) || containsValOf(number, 5);

        if(!multi3 && !multi5)
            return Integer.toString(number);

        if(multi3 && multi5) {
            return "fizz buzz";
        }
        else if (multi3) {
            return "fizz";
        }
        else if (multi5) {
            return "buzz";
        }

        return Integer.toString(number);
    }

    private boolean multipleOf(Integer givenNumber, Integer multipleOf) {

        if((givenNumber % multipleOf) == 0 )
            return true;

        return false;
    }

    private boolean containsValOf(Integer givenNumber, Integer valOf) {

        String numStr = Integer.toString(givenNumber);
        char charToCheck = Integer.toString(givenNumber).charAt(0);
        boolean result = false;

        for(int i = 0; i < numStr.length(); i++) {
            if( numStr.charAt(i) == charToCheck) {
                result = true;
                break;
            }
        }
        return result;
    }


}
