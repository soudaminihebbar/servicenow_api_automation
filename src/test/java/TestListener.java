import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        log(result, "Fail");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log(result, "Skip");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log(result,"Pass");
    }

    private void log(ITestResult result, String string) {
        System.out.println(result.getMethod().getMethodName() + string);

    }


}
