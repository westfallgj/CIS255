/*
* George Westfall
* CIS255: Project #8
* File: Aircraft.java
*
* Create an Aircraft object class that has fields (member variables) equivalent to the field names in
* the table given (i.e. id, make, model, tailNumber). The Aircraft object should have manipulator
* and accessor methods for each field, and it should override the inherited Object class' toString()
*method.
*/

public class Aircraft {
    private String id = null;
    private String make = null;
    private String model = null;
    private String tailNumber = null;
    
    public Aircraft() {
    }

    public Aircraft(String id, String make, String model, String tailNumber) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.tailNumber = tailNumber;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public void setTailNumber(String tailNumber) {
        this.tailNumber = tailNumber;
    }

    public String toString() {
        return "Aircraft [id=" + id + ", make=" + make + ", model=" + model + ", tailNumber=" + tailNumber + "]";
    }

}