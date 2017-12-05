package api.database.model.test;

import api.database.model.java.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is a JUnit test for the {@link api.database.model.java.User} database model.
 *
 * @see org.junit.runners.JUnit4
 * @see api.database.model.java.User
 *
 * @author David Roth
 * @version 1.0
 */
public class UserTest {

    private User user;

    /**
     * Initialization method to create a simple user.
     */
    @Before
    public void init() {
        user = new User("David","secret");
    }

    /**
     * This method tests if the values are asigned correctly.
     *
     * @see User#getUsername()
     * @see User#getPassword()
     */
    @Test
    public void testValues() {
        Assert.assertEquals(user.getUsername(), "David");
        Assert.assertEquals(user.getPassword(), "secret");
    }

}
