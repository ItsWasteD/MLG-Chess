package api.database.model.java;

/**
 * This class is a simple database model for a user.
 *
 * @author David Roth
 * @version 1.0
 */

public class User {

    private String username;
    private String password;
    private int id;

    /**
     * This is the default constructor of the class <tt>User</tt>.
     *
     * @param username This is a <tt>String</tt> which contains the username.
     * @param password This is a <tt>String</tt> which contains the password of the user.
     * @param id This is an unique id of type <tt>int</tt>, to identify each user.
     */

    public User(String username, String password, int id) {
        this.username = username;
        this.password = password;
        this.id = id;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
