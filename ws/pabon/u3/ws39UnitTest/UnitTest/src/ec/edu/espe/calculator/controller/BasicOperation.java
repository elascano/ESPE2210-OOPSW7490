package ec.edu.espe.calculator.controller;

/**
 *
 * @author Elkin Pabon, GiftSoft TEAM, DCCO-ESPE
 */

public class BasicOperation {
    
    public float add(float addend1, float addend2){
        
        float sum;
        
        sum = addend1 + addend2;
        return sum;
        
    }
    
    public float substract(float minuend, float susbtraend){
        
        float difference;
        
        difference = minuend - susbtraend;
        return difference;
        
    }
        
    public float multiply(float miltiplicand, float multiplier){
        
        float product;
        
        product = miltiplicand*multiplier;
        return product;
        
    }
    
    public float divide(float dividend, float divisor){
        
        float quotient;
        
        quotient = dividend/divisor;
        return quotient;
        
    }
    
}
