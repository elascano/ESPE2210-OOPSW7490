package ec.edu.espe.templatemethod.model;

/**
 *
 * @author Reishel Tipan, PACSTORE, DCCO-ESPE
 */
public abstract class CaffeineBeverage {
    
    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (wantsCondiments()) { 
            addCondiments(); 
        }
    }
    
    public void boilWater() { 
        System.out.println("Boiling water");
    }
    public abstract void brew();
    
    public void pourInCup () { 
        System.out.println("Pouring into cup");
    }
    
    public abstract void addCondiments();
    
    public boolean wantsCondiments() {
        return true;
    }
}
    
    
