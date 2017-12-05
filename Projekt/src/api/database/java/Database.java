package api.database.java;

import api.database.model.java.User;
import api.database.test.DatabaseTest;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is the main database class of the project.
 * It contains methods to get and insert <tt>User</tt>'s and parse JSON.
 *
 * @see #getAllUsers()
 * @see #insertUser(User)
 * @see #parseJSON(String)
 *
 * @author David Roth
 * @version 1.0
 */

public class Database {

    /**
     * @see #USERS_TABLE_URL This is the URL of our <a href="restdb.io">online database</a>.
     * @see #API_KEY This is the api-key, used to access the database.
     */

    private static final String USERS_TABLE_URL = "https://mlgchess-c56b.restdb.io/rest/mlgchess-users";
    private static final String API_KEY = "100c710f86ffef8c45e0c9f0186c7652dce74";

    /**
     * This method gets all users from the database with and <tt>HttpURLConnection</tt>.
     * It creates a connection to the online database and writes the <b>JSON-data</b> into a <tt>String</tt>.
     *
     * @return a <tt>List</tt> of all <tt>User</tt>'s in the database.
     * @see User
     */

    public List<User> getAllUsers() {
        try {
            URL url = new URL(USERS_TABLE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("x-apikey",API_KEY);
            conn.setRequestProperty("cache-control", "no-cache");

            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line;
            StringBuilder result = new StringBuilder();

            while((line = br.readLine()) != null) {
                result.append(line);
            }

            List<User> users = parseJSON(result.toString());

            br.close();

            return users;

        } catch (MalformedURLException urlEx) {
            urlEx.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return null;
    }

    /**
     * This method inserts a user into the online database.
     *
     * @param user a user object to be inserted
     * @return a HTTP Response Code to verify if the insert was succesful.
     *
     * @see DatabaseTest#insertDbTest() if HTTP Response Code == 201 (Create) -> Test successful
     */

    public int insertUser(User user) {
        try {
            URL url = new URL(USERS_TABLE_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("x-apikey",API_KEY);
            conn.setRequestProperty("content-type", "application/json");
            conn.setRequestProperty("cache-control", "no-cache");
            conn.setDoOutput(true);
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());

            out.write("{ \"username\": \"" + user.getUsername() + "\", \"password\": \"" + user.getPassword() + "\"}");
            out.flush();
            out.close();

            return conn.getResponseCode();

        } catch (MalformedURLException urlEx) {
            urlEx.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return 0;
    }

    /**
     * This method uses an external {@link org.json}JSONParser library to parse the JSON Strings received from the
     * online database.
     *
     * @param userString a JSON String to be parsed.
     * @return a List of <tt>User</tt>'s parsed from the JSON String.
     *
     * @see User
     * @see JSONArray
     */

    private List<User> parseJSON(String userString) {

        JSONArray array = new JSONArray(userString);
        List<User> users = new ArrayList<>();

        for(int i = 0; i < array.length(); i++) {
            JSONObject o = array.getJSONObject(i);
            User u = new User(o.getString("username"), o.getString("password"));
            users.add(u);
        }

        return users;
    }

}
