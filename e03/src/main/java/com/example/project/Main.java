package project;

public class Main {
    public static void main(String[] args) {

        
        Person person1 = new Person();
        Person person2 = new Person("John", "Wick");
        Person person3 = new Person("Hannah", "Montanah", 26);

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());

        System.out.println(person3.getFirstName());
        System.out.println(person3.getLastName());
        System.out.println(person3.getAge());
       
        
    }
}