/*
* George Westfall
* CIS255
* File: Person.java
*
* Homework 12
* Given Person class
*
*/
public class Person {

        protected String name;
        protected int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void play() { 
        System.out.println("Out having fun…");
    }

    public void talk() {
        System.out.println("Hi!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

}
