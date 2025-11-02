/*
* George Westfall
* CIS255
* File: Cat.java

Write a Java object class Cat with the member variables (fields) color, breed, birthday, and weight. Create an empty constructor and overload that constructor and have it accept values for each member variable. There should be manipulator (setter) and accessor (getter) methods for each member variable. Ensure the Cat object has a toString() method. The accessor method for the birthday should return the date in the format MM/DD/YYYY. Add an accessor method getAgeInYears() that calculates how many years old the cat is based on the birthday. Use java.util.Date as the data type for the birthday. (Hint: java.util.Date, java.util.GregorianCalendar, java.util.Calendar, java.text.SimpleDateFormat will be imported and used in this class)

*/

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Cat {
    
    private String color = null;
    private String breed = null;
    private Date birthday = null;
    private double weight;

    public Cat()  {
        
    }

    public Cat(String color, String breed, Date birthday, double weight)  {
        this.color = color;
        this.breed = breed;
        this.birthday = birthday;
        this.weight = weight;
    }
    
    public void setColor(String color)  {
        this.color = color;
    }

    public String getColor()  {
        return this.color;
    }

    public void setBreed(String breed)  {
        this.breed = breed;
    }

    public String getBreed()  {
        return this.breed;
    }
    
    public void setBirthday(Date birthday)  {
        this.birthday = birthday;
    }

    public Date getBirthday()  {
        return this.birthday;
    }
    
    public void setWeight(double weight)  {
        this.weight = weight;
    }

    public double getWeight()  {
        return this.weight;
    }

    public int getAgeInYears(Date catsDate)  {
        int ageInYears = 0;

        if(catsDate != null) {
            GregorianCalendar timePeriodCalendar = new GregorianCalendar();
            int pastYear = 0;
            int currentYear = 0;

            timePeriodCalendar.setTime(catsDate);
            pastYear = timePeriodCalendar.get(Calendar.YEAR);
            currentYear = new GregorianCalendar().get(Calendar.YEAR);
            ageInYears = currentYear - pastYear;

        }

        return ageInYears;
    }

    public String toString()  {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\ncolor: " + color);
        buffer.append("\nbreed: " + breed);
        buffer.append("\nbirthday: " + birthday);
        buffer.append("\nweight: " + weight);

        return buffer.toString();
    }


    public static void main(String[] args)  {

        Date catsDate = new GregorianCalendar(2010, 03, 15).getTime();
        Cat aCat = new Cat();

        Cat bCat = new Cat("Red", "Junk Yard", catsDate, 20);

        System.out.println("Cat 1 " + aCat);
        System.out.println("Cat 2 " + bCat + "\nyears old: " +  bCat.getAgeInYears(catsDate));
    }
        
}
