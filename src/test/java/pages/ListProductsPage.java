package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListProductsPage {
    private WebDriver navegador;

    public ListProductsPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public RegisterItemPage submeterFormListProduct() {
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();
        return new RegisterItemPage(navegador);
    }

    public String capturarMensagemErro(){
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
   // public ListProductsPage submeterFormsLogin(){
    //    navegador.findElement(By.cssSelector("button[type = submit]")).click();
    //    return new ListProductsPage(navegador);
  //  }