
package ec.edu.espe.clientApp.model;

/**
 *
 * @author Yorman Oña, GiftSoft Team, DCCO-ESPE
 */
public class LinuxButton extends Button {
    @Override
    public void paint() {
        System.out.println("I'm a LinuxButton: " + caption);
    }
}
