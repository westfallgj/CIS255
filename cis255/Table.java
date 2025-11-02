/*
* George Westfall
* CIS255
* File: Table.java

Write a Java object class Table with the member variables (fields) color, length, width, height, and numChairs. Create an empty constructor and overload that constructor and have it accept values for each member variable. There should be manipulator (setter) and accessor (getter) methods for each member variable. Ensure the Table object has a toString() method.

*/

public class Table {
    
    private String color = null;
    private int length;
    private int width;
    private int height;
    private int numChairs;

    public Table()  {
        
    }

    public Table(String color, int length, int width, int height, int numChairs)  {
        this.color = color;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numChairs = numChairs;
    }

    public void setColor(String color)  {
        this.color = color;
    }

    public String getColor()  {
        return this.color;
    }
    
    public void setLength(int length)  {
        this.length = length;
    }

    public int getLength()  {
        return this.length;
    }
    
    public void setWidth(int width)  {
        this.width - width;
    }

    public int getWidth()  {
        return this.width;
    }

    public void setHeight(int height)  {
        this.height = height;
    }

    public int getHeight()  {
        return this.height;
    }

    public void setNumChairs(int numChairs)  {
        this.numChairs = numChairs;
    }

    public int getNumChairs()  {
        return this.numChairs;
    }

    public String toString()  {
        StringBuffer buffer = new StringBuffer();

        buffer.append("color: " + color);
        buffer.append("length: " + length);
        buffer.append("width: " + width);
        buffer.append("height: " + height);
        buffer.append("numChairs: " + numChairs);

        return buffer.toString();
    }
    public static void main(String[] args)  {

        Table aTable = new Table();

    }
 
}