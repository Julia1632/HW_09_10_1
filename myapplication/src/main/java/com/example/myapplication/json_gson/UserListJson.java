package com.example.user.my_07_03.json_gson;

import java.util.List;

/**
 * Created by User on 14.10.2017.
 */

public class UserListJson implements IUserListJson {

    private List<UserJSONWrapper> mUsersLists;

    public UserListJson(List<UserJSONWrapper> mUsersLists) {
        this.mUsersLists = mUsersLists;
    }

    @Override
    public List<UserJSONWrapper> getUserList() {
       return mUsersLists;
    }
}
