/*
* George Westfall
* CIS255
* File: Television.java
*
* Given in class
*
*/

public class Television {
    
    private String brand = null;
    private String type = null;
    private int screenSize;

    public Television()  {
    }

    public Television(String brand, int screenSize)  {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public void setBrand(String brand)  {
        this.brand = brand;
    }

    public String getBrand()  {
        return this.brand;
    }

    public void setScreenSize(int screenSize)  {
        this.screenSize = screenSize;
    }

    public int getScreenSize()  {
        return this.screenSize;
    }

    public void turnOn()  {
        System.out.println("Turning on...");
    }

    public String toString()  {
        StringBuffer buffer = new StringBuffer();

        buffer.append("\nbrand: " + brand);
        buffer.append("\ntype: " + type);
        buffer.append("\nscreenSize: " + screenSize);

        return buffer.toString();
    }

}
