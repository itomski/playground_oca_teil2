package de.lubowiecki.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserMapper { // Mögliche Namen wären: UserManager oder UserRepository

    public static final String TABLE = "users";

    // CRUD - Create, Read, Update, Delete

    public UserMapper() throws SQLException {
        createTable(); // Tabelle wird gebaut, wenn noch nicht verfügbar
    }

    public List<User> findAll() throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE;

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {

            List<User> users = new ArrayList<>();
            ResultSet data = stmt.executeQuery(SQL);
            while(data.next()) {
                users.add(populate(data));
            }
            return users;
        }
    }

    public User findById(int id) throws SQLException {

        final String SQL = "SELECT * FROM " + TABLE + " WHERE id = " + id;

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {

            ResultSet data = stmt.executeQuery(SQL);
            if(data.next()) {
                return populate(data);
            }
            return null;
        }
    }

    //findAll(...);
    //findBy...();

    public boolean save(User user) throws SQLException {
        if(user.getId() > 0) {
            return update(user);
        }
        else {
            return insert(user);
        }
    }

    private boolean insert(User user) throws SQLException {

        final String SQL = "INSERT INTO " + TABLE + " (id, firstname, lastname) VALUES(null, ?, ?)";

        // PreparedStatement macht eine SQLInjection unmöglich

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(SQL)) {

            // Werden nicht als Befehl interpretiert
            stmt.setString(1, user.getFirstname());
            stmt.setString(2, user.getLastname());

            return stmt.executeUpdate() == 1;
        }
    }

    private boolean update(User user) throws SQLException {

        // TODO: gegen SQLInjection absichern

        final String SQL = "UPDATE " + TABLE + " SET firstname = '%s', lastname = '%s' WHERE id = " + user.getId();

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {

            return stmt.executeUpdate(String.format(SQL, user.getFirstname(), user.getLastname())) == 1;
        }
    }

    public boolean delete(User user) throws SQLException {
        return deleteById(user.getId());
    }

    public boolean deleteById(int id) throws SQLException {

        final String SQL = "DELETE FROM " + TABLE + " WHERE id = " + id;

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {

            return stmt.executeUpdate(SQL) == 1;
        }
    }

    private User populate(ResultSet result) throws SQLException {
        User user = new User();
        user.setId(result.getInt("id"));
        user.setFirstname(result.getString("firstname"));
        user.setLastname(result.getString("lastname"));
        return user;
    }

    private void createTable() throws SQLException {

        final String SQL = "CREATE TABLE IF NOT EXISTS " + TABLE + " (" +
                "id INTEGER," +
                "firstname TEXT NOT NULL," +
                "lastname TEXT NOT NULL," +
                "PRIMARY KEY (id AUTOINCREMENT))";

        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement()) {
            stmt.execute(SQL);
        }
    }
}
