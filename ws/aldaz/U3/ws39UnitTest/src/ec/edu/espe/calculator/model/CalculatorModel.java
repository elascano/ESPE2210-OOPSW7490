package ec.edu.espe.calculator.model;

/**
 *
 * @author Bernardo Aldaz, Scriptal, DCCO-ESPE
 */
public class CalculatorModel 
{
    private float number1;
    private float number2;

    public CalculatorModel(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public float getNumber1() {
        return number1;
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public float getNumber2() {
        return number2;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }
    
    
}
