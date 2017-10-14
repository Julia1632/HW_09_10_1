package com.example.user.my_07_03.json_gson;

import java.io.InputStream;

/**
 * Created by User on 14.10.2017.
 */

public class UserListParserFactory {
    public  IUserListParser createGsonParser(InputStream pSource) throws Exception{
        return new UserListGsonParser(pSource);
    }

    public  IUserListJsonParser createJsonParser (InputStream pSource) throws Exception{
        return new UserListJsonParser(pSource);
    }
}
