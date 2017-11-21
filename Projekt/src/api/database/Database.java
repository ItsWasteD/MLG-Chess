package api.database;

import api.database.model.User;
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

public class Database {

    private static final String USERS_TABLE_URL = "https://mlgchess-c56b.restdb.io/rest/mlgchess-users";
    private static final String API_KEY = "100c710f86ffef8c45e0c9f0186c7652dce74";

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
