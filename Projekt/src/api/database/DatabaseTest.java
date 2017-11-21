package api.database;

import api.database.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class DatabaseTest {

    private Database db;
    private User user;

    private List<User> usersTest = new ArrayList<>();

    @Before
    public void setup() {
        db = new Database();
        user = new User("ItsWasted", "1234");

        usersTest.add(new User("yanis","1234"));
        usersTest.add(new User("David","xxxxxxxxx"));
        usersTest.add(new User("ItsWasted","1234"));

    }

    @Test
    public void getAllUsersTest() {
        List<User> users = db.getAllUsers();

        for(int i = 0; i < 3; i++) {
            User u = users.get(i);
            User uTest = users.get(i);

            Assert.assertEquals(u, uTest);
        }
    }

    @Test
    public void insertDbTest() {
        int responseCode = db.insertUser(user);

        Assert.assertEquals(responseCode, 200 | 201);
    }

}