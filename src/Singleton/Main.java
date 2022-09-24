package Singleton;

public class Main {
    public static void main(String[] args) {
        //Pros
            //You can have only one singleton instance.
            //Global access to that instance.
            //The singleton object is initialized only when it’s requested for the first time.

        //Cons
            //Violets Single-Responsibility
            //Special treatment necessary when using with multithreading
            //Difficult to write Unit Test
            //The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
        Database database = Database.getInstance();
        database.write();
    }
}
