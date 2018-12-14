package befaster.solutions.SUM;

import befaster.runner.SolutionNotImplementedException;
import sun.nio.ch.IOStatus;

public class SumSolution {

    public int compute(int x, int y) {
        if (!checkInput(x))
            throw new IllegalArgumentException("The first arg is invalid");

        if (!checkInput(y))
            throw new IllegalArgumentException("The second arg is invalid");

        return x+y;
    }

    private boolean checkInput(int x) {
        if(x < 0 || x >= 100)
            return  false;
        return true;
    }

}


