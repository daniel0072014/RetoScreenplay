package com.alkosto.task;

import com.alkosto.utils.CallData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import static com.alkosto.UI.AlkostoHomePageUI.INPUT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(INPUT_SEARCH),
                Enter.theValue(CallData.extractTo().get(0).get("Producto")).into(INPUT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static SearchProductTask searchProduct(){
        return instrumented(SearchProductTask.class);
    }
}
