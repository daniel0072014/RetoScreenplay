package com.alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;

public class ProductUI {

    public static Target BTN_ADDCART = Target.the("agregar al carrito").locatedBy("//button[@aria-label='Agregar al carrito']");
    public static Target BTN_CONTINUESHOP = Target.the("continuar comprando").locatedBy("//div[@class='modal-footer']//a[starts-with(@class, 'c')]");
    public static Target BTN_CARTPAGE = Target.the("ir al carrito de compras").locatedBy("//div[@class='modal-footer']/a[@href='/cart']");
}
