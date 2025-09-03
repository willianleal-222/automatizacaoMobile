package mydemoapp.pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CarrinhoPage {

    AndroidDriver driver;

    public CarrinhoPage(AndroidDriver driverTeste){
        this.driver = driverTeste;
    }


    public String xpathIrParaCheckout = "//android.widget.TextView[@text=\"Proceed To Checkout\"]";

   String btnAdicionarItemCarrinho = "//android.view.ViewGroup[@content-desc=\"counter plus button\"]/android.widget.ImageView";


    public void alterarQuantidadeParaTres() {
        driver.findElement(AppiumBy.xpath(btnAdicionarItemCarrinho)).click();
        driver.findElement(AppiumBy.xpath(btnAdicionarItemCarrinho)).click();
    }


}
