package com.example.user.my_07_03.json_gson;

import java.util.List;

/**
 * Created by User on 14.10.2017.
 */

public class UserListGson implements IUserList {

    private List<UserGson> mUsersLists;

    public UserListGson(List<UserGson> mUsersLists) {
        this.mUsersLists = mUsersLists;
    }

    @Override
    public List<UserGson> getUserList() {
        return mUsersLists;
    }
}