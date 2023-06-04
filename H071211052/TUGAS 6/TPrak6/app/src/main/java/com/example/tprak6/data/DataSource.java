package com.example.tprak6.data;

import android.net.Uri;

import com.example.tprak6.R;
import com.example.tprak6.data.model.Post;
import com.example.tprak6.data.model.User;

import java.util.ArrayList;

public class DataSource {

    private static final String URI_CONST = "android.resource://com.example.tprak6/drawable/";
    private ArrayList<User> users = new ArrayList<>();

    public DataSource() {
        this.users.addAll(generateData());
    }

    public ArrayList<User> getUsers() {

        return users;
    }

    public void addUser(User user) {

        users.add(0, user);
    }

    private ArrayList<User> generateData() {

        ArrayList<User> userArrayList = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {

            User user = new User(usernames[i], names[i], profilePictures[i],
                    new Post(
                            Uri.parse(URI_CONST + profilePictures[i]),
                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labo")
            );

            userArrayList.add(user);
        }

        return userArrayList;
    }

    private final String[] names = {"Monkey D Luffy", "Akagami No Shanks", "Garp", "Nami swann", "God Usopp"};
    private final String[] usernames = {"Luffyyy", "Shankss", "BroGarp", "Nami chan", "G.Usop"};
    private final int[] profilePictures = {R.drawable.luffy, R.drawable.shanks, R.drawable.garp, R.drawable.nami, R.drawable.usopp};

}
