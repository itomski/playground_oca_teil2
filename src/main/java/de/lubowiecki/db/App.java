package de.lubowiecki.db;

import java.sql.SQLException;
import java.util.List;

public class App {

    public static void main(String[] args) {

        try {
            UserMapper mapper = new UserMapper();

            /*
            // findAll
            List<User> users = mapper.findAll();
            for(User user : users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }
            */

            /*
            // findById
            User user = mapper.findById(1);
            if(user != null)
                System.out.println(user.getFirstname() + " " + user.getLastname());
            */

            /*
            // deleteById
            if(mapper.deleteById(1)) {
                System.out.println("Datensatz wurde gelöscht.");
            }
            List<User> users = mapper.findAll();
            for(User user : users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }
            */

            /*
            // insert
            if(mapper.save(new User("Carol", "Danvers")))
                System.out.println("User wurde gespeichert.");

            List<User> users = mapper.findAll();
            for(User user : users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }
            */

            User u = mapper.findById(2);
            u.setLastname("Romanov");
            mapper.save(u);

            List<User> users = mapper.findAll();
            for(User user : users) {
                System.out.println(user.getFirstname() + " " + user.getLastname());
            }

        }
        catch(SQLException ex) {
            System.out.println("...");
        }
    }
}
