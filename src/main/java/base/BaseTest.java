package base;

import org.testng.asserts.SoftAssert;

public class BaseTest {
    protected SoftAssert softAssert;

    protected final String smoke = "smoke";

    protected final String regression = "regression";

    public void setUpBase() {
        softAssert = new SoftAssert();
    }
}
