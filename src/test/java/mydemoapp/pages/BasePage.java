package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;

public class BasePage {

    AndroidDriver driver;

    public BasePage(AndroidDriver driverScenario){
        this.driver = driverScenario;
        

    }
    public void clicarporXpath(String elemento){
        driver.findElement(AppiumBy.xpath(elemento)).click();

    }
    public void preencherCampoTextoPorAccId(String elemento, String valor){
        driver.findElement(AppiumBy.accessibilityId(elemento)).sendKeys(valor);
    }


    public void clicarPorAccId(String elemento) {
        driver.findElement(AppiumBy.accessibilityId(elemento)).click();

    }

    public void validarNomeProduto(String elemento, String valorEsperado){
        String valorAtual = driver.findElement(AppiumBy.accessibilityId(elemento)).getText();
        Assert.assertEquals(valorEsperado, valorAtual);
    }

    public void validarQuantidadeDoProduto(String elemento, String valorEsperado){
        String valorAtual = driver.findElement(AppiumBy.accessibilityId(elemento)).getText();
        Assert.assertEquals(valorEsperado, valorAtual);
    }

}
