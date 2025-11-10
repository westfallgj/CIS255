/*
* George Westfall
* CIS255: Project #8
* File: President.java
*
* Create a President object class that has fields (member variables) equivalent to the field names in
* the table above (i.e. id, lastName, firstName, middleInitial). The President object should have
* manipulator and accessor methods for each field, and it should override the inherited Object
* class' toString() method.
*
*/

public class President {
    private String id = null;
    private String lastName = null;
    private String firstName = null;
    private String middleInitial = null;

    public President()  {

    }

    public President(String id, String lastName, String firstName, String middleInitial) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String toString() {
        return "President [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", middleInitial=" + middleInitial + "]";
    }

}
