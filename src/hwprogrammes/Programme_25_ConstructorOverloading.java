package hwprogrammes;
/** Example of Consrucotr overloading
 *
 */
public class Programme_25_ConstructorOverloading {
    // Java program showing overloading of constructors
    static class Student5 {
        int id;
        String name;
        int age;

        // Creation of Two Argument Constructor
        Student5(int i, String n) {
            id = i;
            name = n;
        }

        // Creation of Three Argument Constructor
        Student5(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        public void display() { // method printing the values
            System.out.println(id + " " + name + " " + age);
        }
    }
    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan"); // Object creation providing values
        Student5 s2 = new Student5(222, "Aryan", 25); // Object creation providing different value
        s1.display(); // calling display method using s1 object
        s2.display(); // calling display method with s2 object
    }
}
