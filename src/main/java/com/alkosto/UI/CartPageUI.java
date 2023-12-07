package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class CartPageUI {

    public static Target LABEL_PRODUCT1 = Target.the("primer producto").locatedBy("(//ul[@class='item__list item__list__cart']/li)[last()]//a/span");
    public static Target LABEL_PRODUCT2 = Target.the("primer producto").locatedBy("(//ul[@class='item__list item__list__cart']/li)[1]//a/span");

}
