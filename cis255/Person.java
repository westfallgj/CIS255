/*
* George Westfall
* CIS255
* File: Person.java

Write a Java object class Person with the member variables (fields) firstName, lastName, address, city, state, zip, and phone. Create an empty constructor and overload that constructor and have it accept values for each member variable. There should be manipulator (setter) and accessor (getter) methods for each member variable. Ensure the Person object has a toString() method.

*/

public class Person {
    
    private String firstName = null;
    private String lastName = null;
    private String address = null;
    private String city = null;
    private String state = null;
    private int zip;
    private int phone;

    public Person()  {

    }

    public Person(String firstName, String lastName, String address, String city, String state, int zip, String phone)  {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public void setFirstName(String firstName)  {
        this.firstName = firstName;
    }

    public String getFirstName()  {
        return this.firstName;
    }

    public void setLastName(String lastName)  {
        this.lastName = lastName;
    }

    public String getLastName()  {
        return this.lastName;
    }

    public void setAddress(String address)  {
        this.address = address;
    }

    public String getAddress()  {
        return this.address;
    }

    public void setCity(String city)  {
        this.city = city;
    }

    public String getCity()  {
        return this.city;
    }   
    
    public void setState(String state)  {
        this.state = state;
    }

    public String getState()  {
        return this.state;
    } 
 
    public void setZip(int zip)  {
        this.zip = zip;
    }

    public int getZip()  {
        return this.zip;
    }     

    public void setPhone(int phone)  {
        this.phone = phone;
    }

    public int getPhone()  {
        return this.phone;
    }
    
    public String toString()  {
        StringBuffer buffer = new StringBuffer();

        buffer.append("firstName: " + firstName);
        buffer.append("lastName: " + lastName);
        buffer.append("address: " + address);
        buffer.append("city: " + city);
        buffer.append("state: " + state);
        buffer.append("zip: " + zip);
        buffer.append("phone: " + phone);

        return buffer.toString();
    }
    public static void main(String[] args)  {

        Person aPerson = new Person();
        Person bPerson = new Person("Travis", "Horse", "1000 B Street", "Auburn", "AL", 36552, "555-555-5555");

    }

}
