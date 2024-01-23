package project;

class Person {
    //properties
    private String name;
    private String surName;
    private int age;


    //constructors
    public Person() {
        this.name = "";
        this.surName = "";
        this.age = 0;
    }
    public Person(final String n, String s) {
        this.name = n;
        this.surName = s;
        this.age = 0;
    }
    public Person(final String n, String s, int a) {
        this.name = n;
        this.surName = s;
        this.age = a;
    }


    //getters
    public String getFirstName() {
        return this.name;
    }
    public String getLastName() {
        return this.surName;
    }
    public int getAge() {
        return this.age;
    }

    //method
    public void display() {
        System.out.println(this.name);
        System.out.println(this.surName);
        System.out.println(this.age);
    }
}