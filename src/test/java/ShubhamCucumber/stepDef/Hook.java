package ShubhamCucumber.stepDef;

import io.cucumber.java.After;
import utils.TextContextSetup;
import java.io.IOException;

public class Hook {

    TextContextSetup textContextSetup;
    public Hook(TextContextSetup textContextSetup){
        this.textContextSetup = textContextSetup;
    }

    @After
    public void afterScenario() throws IOException {
        textContextSetup.testbase.WebDriverManager().quit();
    }

}
