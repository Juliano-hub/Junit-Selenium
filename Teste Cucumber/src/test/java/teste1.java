import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class teste1 {

    private ChromeDriver driver;

    @Dado("primeiro iniciar o driver")
    public void primeiroIniciarODriver(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        // indica aonde está localizado o driver do chrome
        driver = new ChromeDriver();
        // faz uma instancia dele


    }

    @Dado("^que um usuario acesse o site \"([^\"]*)\"$")
    public void queUmUsuarioAcesseOSite(String parametroSite){
        WebDriverWait wait = new WebDriverWait(driver, 5);

        driver.get(parametroSite);
    }

    @Entao("^pesquisa pelo produto \"([^\"]*)\"$")
    public void pesquisaPeloProduto(String parametroProduto){
        driver.findElement(By.cssSelector("#search_query_top")).sendKeys(parametroProduto);
        // escreve na barra a string de pesquisa
        driver.findElement(By.cssSelector("#searchbox > button")).click();
        // aperta no botão da lupa de pesquisa
    }

    @E("^vai adicionar ao carrinho")
    public void vaiAdicionarAoCarrinho(){
        driver.executeScript("window.scrollBy(0, 250)", "");
        // faz o scroll para baixo e encontrar o próximo css

        driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default > span")).click();
        // aperta em "more" para mudar alguma config

        //driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default > span")).click();
        driver.findElement(By.cssSelector("#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up > span")).click();
        // soma +1 pelo quadrado " + "

        driver.findElement(By.cssSelector("#add_to_cart > button > span")).click();
        // adiciona no carrinho
    }

}
