package com.alkosto.task;

import com.alkosto.interactions.SelectRandomProducts;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectProductTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectRandomProducts.selectRandomProduct()
        );
    }

    public static SelectProductTask selectProduct(){
        return instrumented(SelectProductTask.class);
    }
}
