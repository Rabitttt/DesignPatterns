package Singleton;

import javax.xml.crypto.Data;

public class Database {
    private static Database instance;

    //private constructor
    private Database() {
        // Some initialization code, such as the actual
        // connection to a database server.
    }

    //Singleton instance creator.
    public static Database getInstance() {
        if (Database.instance == null) {
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void write() {
        System.out.println("Singleton");
    }
}
