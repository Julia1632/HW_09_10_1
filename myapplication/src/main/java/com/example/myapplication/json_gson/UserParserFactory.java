package com.example.user.my_07_03.json_gson;

import java.io.InputStream;

/**
 * Created by User on 13.10.2017.
 */

public class UserParserFactory {


    public IUserParser createParser(String pSource) {
        return new UserJSONObjectParser(pSource);
    }

    public IUserParser createParserFile (InputStream pInputStream){
        return  new UserJSONObjectParserFile(pInputStream);
    }

    public IUserParser createGsonParseFile(InputStream pInputStream)
    {
        return  new UserGSONObjectParserFile(pInputStream);
    }
}
