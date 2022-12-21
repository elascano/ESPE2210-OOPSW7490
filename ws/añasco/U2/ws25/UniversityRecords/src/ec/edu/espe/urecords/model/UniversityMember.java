package ec.edu.espe.urecords.model;

import java.util.ArrayList;

/**
 *
 * @author Añasco Silvia, DeltaTeam, DCCO-ESPE
 */
public abstract class UniversityMember {
    private int id;
    private String name;
    private String cedula;
    private ArrayList<NRC> courses;
    
    public abstract void registerInSystem();
    
    public UniversityMember(int id, String name, String cedula, ArrayList<NRC> courses) {
        this.id = id;
        this.name = name;
        this.cedula = cedula;
        this.courses = courses;
    }
    
    
    
    @Override
    public String toString() {
        return "UniversityMember{" + "id=" + id + ", name=" + name + ", cedula=" + cedula + ", courses=" + courses + '}';
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public ArrayList getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<NRC> courses) {
        this.courses = courses;
    }

    
}
