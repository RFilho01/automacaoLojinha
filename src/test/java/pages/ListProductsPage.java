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
    public String capturarMensagemSucesso(){
        return navegador.findElement(By.cssSelector(".toast.rounded")).getText();
    }
}
//<div class="toast rounded" style="top: 0px; transition: transform 0.2s ease 0s, opacity 0.2s ease 0s; opacity: 0.0167346; margin-top: -39.1633px;">Produto adicionado com sucesso</div>
