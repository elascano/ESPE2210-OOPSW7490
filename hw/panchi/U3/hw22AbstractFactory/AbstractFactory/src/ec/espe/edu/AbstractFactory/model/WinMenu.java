package ec.espe.edu.AbstractFactory.model;

/**
 *
 * @author Allan Panchi, GiftSoft Team, DCCO-ESPE
 */
public class WinMenu extends Menu{

    @Override
    public void paint() {
        System.out.println("I'm a WinMenu: " + caption);
    }
    
}
