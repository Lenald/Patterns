package Adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database db = new AdapterJavaToDatabase();

        db.insert();
        db.update();
        db.select();
        db.remove();
    }
}
