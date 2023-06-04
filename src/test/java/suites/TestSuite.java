package suites;

import Tests.RIES.AuthTests;
import Tests.RIES.CheckObjectsParameters;
import Tests.RIES.CreateAndCheckObject;
import Tests.RIES.MakeBuyGarageTicket;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        AuthTests.class,
        MakeBuyGarageTicket.class,
        CheckObjectsParameters.class,
        CreateAndCheckObject.class
})
public class TestSuite {}
