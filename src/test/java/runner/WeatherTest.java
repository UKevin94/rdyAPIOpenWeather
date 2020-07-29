package runner;

import com.smartbear.ready.cmd.runner.pro.SoapUIProTestCaseRunner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherTest {
    SoapUIProTestCaseRunner runner;

    @BeforeEach
    public void setUp(){
            runner = new SoapUIProTestCaseRunner();
            runner.setProjectFile("resources/OpenWeather-readyapi-project.xml");
            runner.setTestSuite("WeatherSuite");
    }

    @Test
    public void weatherByCityTest() throws Exception {
        runner.setTestCase("CheckWeatherByCity");
        runner.run();
    }

    @Test
    public void weatherByCityFailureTest() throws Exception {
        runner.setTestCase("CheckWeatherByCityFailure");
        runner.run();
    }

}
