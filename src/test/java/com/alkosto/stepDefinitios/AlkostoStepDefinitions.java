package com.alkosto.stepDefinitios;

import com.alkosto.questions.ValidateProducts;
import com.alkosto.task.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class AlkostoStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }


    @Given("user open the browser and alkosto page")
    public void userOpenTheBrowserAndAlkostoPage() {
        theActorCalled("user").wasAbleTo(
                AlkostoOpenTask.openPage()
        );
    }
    @When("user search a product")
    public void userSearchAProduct() {
        theActorInTheSpotlight().attemptsTo(
                SearchProductTask.searchProduct()
        );
    }
    @When("add to cart two products and click to cart")
    public void addToCartTwoProductsAndClickToCart() {
        theActorInTheSpotlight().attemptsTo(
                SelectProductTask.selectProduct(),
                AddCartAndBackListTask.addCart(),
                SelectProductTask.selectProduct(),
                AddCartTask.addCartAndCartPage()
        );
    }
    @Then("user can see two productos in the cart page")
    public void userCanSeeTwoProductosInTheCartPage() {
        theActorInTheSpotlight().should(
                seeThat(ValidateProducts.validate(), Matchers.equalTo(true))
        );
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

}
