package suites;

import Tests.RIES.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AuthTests.class,
        MakeBuyGarageTicket.class,
        CheckObjectsParameters.class,
        CreateAndCheckObject.class,
        CreateMortgageTicket.class
})
public class TestSuite {}
