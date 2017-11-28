package api.database;

import api.database.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * This class is a JUnit test for the database class.
 *
 * @see org.junit.runners.JUnit4
 * @see Database
 *
 * @author David Roth
 * @version 1.0
 */

public class DatabaseTest {

    private Database db;
    private User user;

    private List<User> usersTest = new ArrayList<>();

    /**
     * The setup method creates a new instance of the database class.
     * It also creates a new user and add's some users to the {@link #usersTest} list.
     *
     * @see User
     * @see Database
     */

    @Before
    public void setup() {
        db = new Database();
        user = new User("ItsWasted", "1234");

        usersTest.add(new User("yanis","1234"));
        usersTest.add(new User("David","xxxxxxxxx"));
        usersTest.add(new User("ItsWasted","1234"));

    }

    /**
     * The {@link #getAllUsersTest()} tests if the data gets transmitted successfully
     * and if it is still the same.
     *
     * @see Database#getAllUsers()
     */

    @Test
    public void getAllUsersTest() {
        List<User> users = db.getAllUsers();

        for(int i = 0; i < 3; i++) {
            User u = users.get(i);
            User uTest = users.get(i);

            Assert.assertEquals(u, uTest);
        }
    }

    /**
     * This method inserts the user created in {@link #setup()} and checks if it returns the correct response code.
     *
     * Response Code
     * 200: OK
     * 201: Created
     *
     * @see Database#insertUser(User)
     */

    @Test
    public void insertDbTest() {
        int responseCode = db.insertUser(user);

        Assert.assertEquals(responseCode, 200 | 201);
    }

}