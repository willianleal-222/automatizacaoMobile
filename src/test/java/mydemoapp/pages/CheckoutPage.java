package mydemoapp.pages;

import io.appium.java_client.android.AndroidDriver;

public class CheckoutPage extends BasePage {

    AndroidDriver driver;

    public String inputIdNome = "Full Name* input field";

    public String inputIdEndereco = "Address Line 1* input field";

    public String inputIdCidade ="City* input field";

    public String inputIdCodigoPostal = "Zip Code* input field";

    public String inputIdPais = "Country* input field";

    public String btnIdIrParaPagamento = "To Payment button";


    public String inputIdNomeNoCartao ="Full Name* input field";

    public String inputIdNumeroCartao ="Card Number* input field";

    public String inputIdDataVencimento ="Expiration Date* input field";

    public String inputIdCodigoSeguranca ="Security Code* input field";

    public String btnIdRevisarPedido = "Review Order button";

    public String IdQuantidadeTotal = "total number";

    public String IdNomeProduto = "product label";

    public String btnIdConfirmarPedido = "Place Order button";





    public CheckoutPage(AndroidDriver driverScenario){
        super(driverScenario);
        super.driver = driverScenario;


    }



}