package edu.calhoun.cis.java.intro;

import java.util.Date;

public class Host {
    private String lastName;
    private String firstName;
    private String hostNumber;
    private Date birthday;

    public Host() {
    }

    public Host(String lastName, String firstName, String hostNumber, Date birthday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.hostNumber = hostNumber;
        this.birthday = birthday;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setHostNumber(String hostNumber) {
        this.hostNumber = hostNumber;
    }

    public String getHostNumber() {
        return hostNumber;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append("LAST NAME: " + lastName);
        buffer.append(" | FIRST NAME: " + firstName);
        buffer.append(" | HOST NUMBER: " + hostNumber);
        buffer.append(" | BIRTHDAY: " + birthday);
        
        return buffer.toString();
    }
}
