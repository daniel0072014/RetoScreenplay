package com.alkosto.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.alkosto.UI.ProductUI.BTN_ADDCART;
import static com.alkosto.UI.ProductUI.BTN_CARTPAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCartTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADDCART),
                Click.on(BTN_CARTPAGE)
        );
    }

    public static AddCartTask addCartAndCartPage(){
        return instrumented(AddCartTask.class);
    }
}
