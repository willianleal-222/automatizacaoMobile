package scenarios;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import mydemoapp.pages.HomePage;
import org.junit.Before;
import org.junit.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class testeCompraProduto {

    AndroidDriver driver;
    HomePage homePage;


    @Before
    public void before() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setPlatformVersion("10.0");
        options.setAutomationName("UiAutomator2");
        options.setDeviceName("emulator-5554");
        options.setApp("C:\\Users\\Windows\\Desktop\\Projeto Intellij\\automatizacaoMobile\\src\\test\\resources\\Android-MyDemoAppRN.1.3.0.build-244.apk");
        options.setNoReset(false);
        options.setAppPackage("com.saucelabs.mydemoapp.rn");
        options.setAppActivity(".MainActivity");
        driver= new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);

    }

    @Test
    public void testeCompraProduto(){
        homePage.clicarporXpath(homePage.produto);
        homePage.clicarporXpath(homePage.xpathAddCarrinho);



    }
}
