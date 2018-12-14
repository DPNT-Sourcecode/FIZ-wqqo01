package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        //throw new SolutionNotImplementedException();
        boolean multi3 = multipleOf(number, 3);
        boolean multi5 = multipleOf(number, 5);

        if(!multi3 && !multi5)
            return "";

        if(multi3 && multi5) {
            return
        }


    }

    private boolean multipleOf(Integer givenNumber, Integer multiple) {
        if((givenNumber % multiple) == 0 )
            return true;

        return false;
    }

}

