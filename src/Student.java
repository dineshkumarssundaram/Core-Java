public class Student {

    // Create new Student class
    /*
    * it should have 2 data members
    *   age int;
    *   name String;
    *
    * it should display method
    *
    *   Signature: void:display()
    *   it should print:"my name is<name>.I am<age> years old
    *
    * it should have a "sayHello" method
    *
    *    Signature :void:sayHello(String)
    *    it should print:"<name data members says hello to <name parameter> */

    int age;
    String name;

    void display()
    {
        System.out.println("my name is "+name+" I am"+age+"years old");
    }

    void sayHello(String name)
    {
        System.out.println("name data members says hello to:"+name);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name ="dinesh";
        s1.age=23;
        s1.display();
        s1.sayHello("arun");

    }

}
