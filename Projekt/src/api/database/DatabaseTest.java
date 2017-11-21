package api.database;

import api.database.model.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class DatabaseTest {

    private Database db;

    @Test
    public void dataBaseTest() {
        db = new Database();
        User user = new User("ItsWasted", "1234");
        db.insertUser(user);
        db.getAllUsers();
    }

}