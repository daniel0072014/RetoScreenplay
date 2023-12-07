package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ListProductsUI {

    public static Target LIST_PRODUCTS = Target.the("lista de productos").locatedBy("//ol/li//h3/a");
}
