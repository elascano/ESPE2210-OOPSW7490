package ec.edu.espe.uscalculator.view;


//@author Martín Suquillo, WebMasterTeam, DCCO-ESPE

import ec.edu.espe.uscalculator.controller.USTax;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        USTax tax = USTax.getInstance();
        System.out.println("Imput price of the product:");
        float price = Float.parseFloat(console.nextLine());
        tax.salesTotal(price);
    }
}
