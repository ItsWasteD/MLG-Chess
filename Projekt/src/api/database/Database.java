package api.database;

import api.database.model.User;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Database {

    private static final String USERS_TABLE_URL = "https://mlgchess-c56b.restdb.io/rest/mlgchess-users";
    private static final String API_KEY = "100c710f86ffef8c45e0c9f0186c7652dce74";

    public User[] getAllUsers() {
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

            System.out.println(result.toString());

            br.close();

        } catch (MalformedURLException urlEx) {
            urlEx.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return null;
    }

    public void insertUser(User user) {
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

            System.out.println(conn.getResponseCode());

        } catch (MalformedURLException urlEx) {
            urlEx.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
