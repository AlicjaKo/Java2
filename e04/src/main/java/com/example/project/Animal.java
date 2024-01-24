package project;

class Animal {

//properties
private String name;
private String type;
private int age;


//constructor 
public Animal(String n, String t, int a) {
    this.name = n;
    this.type = t;
    this.age = a;
}
//toString method
public String toString() {
return "Name: " + name + ", Type: " + type + ", Age: " + age;
}

//overriding "equals"
public boolean equals(Animal n) {
    return this.name == n.name && this.type == n.type && this.age == n.age;
}

//display
public void display(Animal object) {
    System.out.println(object.toString());
}


}


/*
 

4. Create multiple objects of the Animal class and test the `toString()` and `equals()` methods by comparing them and printing them to the console.
6. Create a main method to test the toString, equals and display methods.
 */