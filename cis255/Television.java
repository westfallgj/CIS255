/*
* George Westfall
* CIS255
* File: Television.java

Write a Java object class Television with the member variables (fields) brand (string), type (string), and screenSize (integer). Create an empty constructor and overload that constructor and have it accept values for each member variable. There should be manipulator (setter) and accessor
(getter) methods for each member variable. Ensure the Television object has a toString() method.
*/

public class Television {
    
    private String brand = null;
    private String type = null;
    private int screenSize;

    public Television()  {
    }

    public Television(String brand, String type, int screenSize)  {
        this.brand = brand;
        this.type = type;
        this.screenSize = screenSize;
    }

    public void setBrand(String brand)  {
        this.brand = brand;
    }

    public String getBrand()  {
        return this.brand;
    }

    public void setType(String type)  {
        this.type = type;
    }

    public String getType()  {
        return this.type;
    }

    public void setScreenSize(int screenSize)  {
        this.screenSize = screenSize;
    }

    public int getScreenSize()  {
        return this.screenSize;
    }

    public String toString()  {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\nbrand: " + brand);
        buffer.append("\ntype: " + type);
        buffer.append("\nscreenSize: " + screenSize);

        return buffer.toString();
    }
    public static void main(String[] args)  {

        Television aTV = new Television();
        
        aTV.setBrand("Panasonic");
        aTV.setType("HD");
        aTV.setScreenSize(65);

        System.out.println("TV 1 " + aTV);
        System.out.println();

        Television bTV = new Television("Sony", "USD", 72);
        System.out.println("TV 2 " + bTV);

    }

}
