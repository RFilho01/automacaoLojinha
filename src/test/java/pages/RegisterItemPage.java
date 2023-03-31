package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterItemPage {
    private WebDriver navegador;

    public RegisterItemPage(WebDriver navegador) {
    this.navegador = navegador;
    }

    public RegisterItemPage informarProdutoNome(String ProdutoNome){
        navegador.findElement(By.id("produtonome")).sendKeys(ProdutoNome);
        return this;
    }

    public RegisterItemPage informarProdutoValor(String price) {
        navegador.findElement(By.id("produtovalor")).sendKeys(price);
        return this;
    }

    public RegisterItemPage informarCoresProduto(String cor) {
        navegador.findElement(By.id("produtocores")).sendKeys(cor);
        return this;
    }
    public ListProductsPage submeterForms() {
        navegador.findElement(By.cssSelector("button[type = 'submit']")).click();
        return new ListProductsPage(navegador);
    }
}

