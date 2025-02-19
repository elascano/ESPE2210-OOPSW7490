package ec.edu.espe.singletongui.controller;

import ec.edu.espe.singletongui.model.UtahTax;

/**
 *
 * @author Jonathan Jaguaco, Pythons, DCCO-
 */
public class UtahTaxController {
    
    public static double salesTotal(double price, UtahTax utahTax) {
        return price + price * utahTax.getIvaPersentage() / 100;
    }
    
}
