package modules.products;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.time.Duration;

@DisplayName("Iniciando teste")
public class ProductsTests {
    private static WebDriver navegador;
    @BeforeEach
   public void beforeEach(){

       System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\WebDriver\\Bin\\chromedriver.exe");
       this.navegador = new ChromeDriver();
       this.navegador.manage().window().maximize();
       this.navegador.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       this.navegador.get("http://165.227.93.41/lojinha-web/v2/");

   }
    @Test
    @DisplayName("Não é possível regisntrar produto com valor = 0")
    public void testeNaoEpermitidoRegistrarProdutoComValorIgualAZero(){

        String mensagemErro =new LoginPage(navegador)
                .informarUsuario("admin")
                .informarSenha("admin")
                .submeterFormsLogin()
                .submeterFormListProduct()
                .informarProdutoValor("0")
                .informarCoresProduto("rosa, azul")
                .informarProdutoNome("cadeira")
                .submeterFormsComErro()
                .capturarMensagemErro();
        Assertions.assertEquals("O valor do produto deve estar entre R$ 0,01 e R$ 7.000,00", mensagemErro);

    }
@AfterEach
    public void afterEach(){
    navegador.quit();
}
}
