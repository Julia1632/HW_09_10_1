package com.example.user.my_07_03.json_gson;

import org.json.JSONObject;

/**
 * Created by User on 13.10.2017.
 */

class UserJSONObjectParser implements IUserParser {

    private final String mSource;

    UserJSONObjectParser(final String pSource) {
        mSource = pSource;
    }

    @Override
    public IUser parse() throws Exception {
        final JSONObject jsonObject = new JSONObject(mSource);
        return new UserJSONWrapper(jsonObject);
    }

}
