package com.alkosto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import static com.alkosto.UI.CartPageUI.LABEL_PRODUCT1;
import static com.alkosto.UI.CartPageUI.LABEL_PRODUCT2;

public class ValidateProducts implements Question<Boolean>{

    @Override
    public Boolean answeredBy(Actor actor) {
        String product10 = LABEL_PRODUCT1.resolveFor(actor).getText();
        String product11 = actor.recall("product1");
        String product20 = LABEL_PRODUCT2.resolveFor(actor).getText();
        String product21 = actor.recall("product2");
        return product10.equals(product11) && product20.equals(product21);
    }
    public static Question <Boolean> validate(){
        return new ValidateProducts();
    }
}
