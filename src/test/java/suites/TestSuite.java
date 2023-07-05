package suites;

import Tests.RIES.AuthTests.Login18858;
import Tests.RIES.ObjectsTests.CheckObjectsParameters;
import Tests.RIES.TicketsTests.MakeBuyGarageTicket;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Login18858.class,
        CheckObjectsParameters.class,
        MakeBuyGarageTicket.class,
})
public class TestSuite {}
