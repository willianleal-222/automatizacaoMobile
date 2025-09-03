package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage extends BasePage {

    AndroidDriver driver;

    public String inputIdUsername = "Username input field";

    public String imputIdPassword = "Password input field";

    public String btnIdLogin = "Login button";

    public LoginPage(AndroidDriver driverScenario){
        super(driverScenario);
        super.driver = driverScenario;


    }



}