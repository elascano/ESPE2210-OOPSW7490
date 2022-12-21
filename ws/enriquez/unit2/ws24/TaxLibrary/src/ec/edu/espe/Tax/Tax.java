
package ec.edu.espe.Tax;

/**
 *
 * @author Sheylee Enriquez, Developer Bears, DCCO-ESPE
 */
public class Tax {

    public static float computeIva(float base, float ivaPercentage) {
        float iva;
        iva = base * ivaPercentage;
        return iva;
    }

    public static float computeGreenTax() {
        return 0.0F;
    }

    public static float computeRentTax() {
        return 1.0F;
    }

    public static float computeIva(float base) {
        float iva;
        iva = base * 0.12F;
        return iva;
    }

}
