package befaster.solutions.FIZ;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FIZTest {

    private FizzBuzzSolution fiz;

    @Before
    public void setUp() {

        fiz = new FizzBuzzSolution();
    }

    @Test
    public void fizzBuzzTest() {

        String res = fiz.fizzBuzz(55);

        System.out.println("  "+res);
    }


}

