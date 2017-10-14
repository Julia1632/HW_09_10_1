package com.example.user.my_07_03.json_gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

/**
 * Created by User on 14.10.2017.
 */

public class UserListGsonParser implements IUserListParser {
    public  final InputStream mInputStream;

    public UserListGsonParser(InputStream pInputStream) {
        mInputStream = pInputStream;
    }

    @Override
    public IUserList parse() throws Exception {
        Reader reader = new InputStreamReader(mInputStream);
        UserGson[] result=new Gson().fromJson(reader,UserGson[].class);
        return new UserListGson(Arrays.asList(result));
    }
}
