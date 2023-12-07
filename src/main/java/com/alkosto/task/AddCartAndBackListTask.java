package com.alkosto.task;

import com.alkosto.interactions.BackAndRefreshList;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.alkosto.UI.ProductUI.BTN_ADDCART;
import static com.alkosto.UI.ProductUI.BTN_CONTINUESHOP;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCartAndBackListTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_ADDCART),
                Click.on(BTN_CONTINUESHOP),
                BackAndRefreshList.back()
        );
    }

    public static AddCartAndBackListTask addCart(){
        return instrumented(AddCartAndBackListTask.class);
    }
}
