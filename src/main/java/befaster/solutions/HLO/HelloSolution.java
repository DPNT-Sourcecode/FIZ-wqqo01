package befaster.solutions.HLO;

import befaster.runner.SolutionNotImplementedException;

public class HelloSolution {
    public String hello(String friendName) {
        if(friendName == null || friendName.isEmpty())
            throw new IllegalArgumentException("The given arg is incorrect");
        return friendName;
    }
}
