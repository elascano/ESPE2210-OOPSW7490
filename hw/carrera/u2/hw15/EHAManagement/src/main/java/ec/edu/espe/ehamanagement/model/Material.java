package ec.edu.espe.ehamanagement.model;

import java.util.ArrayList;

/**
 *
 * @author Nahir Carrera, Gaman GeekLords, DCC0-ESPE
 */
public class Material {
    private int id;
    private String name;
    private float generalQuantity;
    private float unitCost;
    private float generalCost;

    public Material(int id, String name, float generalQuantity, float unitCost, float generalCost) {
        this.id = id;
        this.name = name;
        this.generalQuantity = generalQuantity;
        this.unitCost = unitCost;
        this.generalCost = generalCost;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public float getGeneralQuantity() {
        return generalQuantity;
    }

    public void setGeneralQuantity(float generalQuantity) {
        this.generalQuantity = generalQuantity;
    }

    /**
     * @return the unitCost
     */
    public float getUnitCost() {
        return unitCost;
    }

    /**
     * @param unitCost the unitCost to set
     */
    public void setUnitCost(float unitCost) {
        this.unitCost = unitCost;
    }

    /**
     * @return the generalCost
     */
    public float getGeneralCost() {
        return generalCost;
    }

    /**
     * @param generalCost the generalCost to set
     */
    public void setGeneralCost(float generalCost) {
        this.generalCost = generalCost;
    }

    public static ArrayList getAttributesNames(){
        ArrayList keys = new ArrayList(4);
        keys.add("id");
        keys.add("name");
        keys.add("generalQuantity");
        keys.add("generalCost");
        keys.add("unitCost");
        return keys;   
    }
    public static ArrayList getAttributes(Material material){
        ArrayList values = new ArrayList(4);
        values.add(material.getId());
        values.add(material.getName());
        values.add(material.getGeneralQuantity());
        values.add(material.getGeneralCost());
        values.add(material.getUnitCost());
        return values;
    }
}
