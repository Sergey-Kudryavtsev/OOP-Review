package org.serega.OOPinJava.Lesson2;

public class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected void finalize() throws Throwable {
        System.out.println("Object delete");
        super.finalize();
    }

    public void info() {
        System.out.println("Name- " + this.name + "\nAge- " + this.age);
    }

    public static void main(String[] args) {
        Person person = new Person("Alex", 18);
        person.info();
        person.setName("Glory");
        person.info();
        person = null;
        System.gc();
        if (person != null) {
            person.info();
        } else {
            System.out.println("Access is not possible!");
        }

        System.out.println("Closed programing");
    }
}
