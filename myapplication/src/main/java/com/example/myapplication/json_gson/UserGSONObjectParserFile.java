package com.example.user.my_07_03.json_gson;

import com.google.gson.Gson;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by User on 14.10.2017.
 */

public class UserGSONObjectParserFile implements IUserParser {

    private  final InputStream mInputStream;
    UserGSONObjectParserFile(final InputStream pInputStream){
        mInputStream = pInputStream;
    }

    @Override
    public IUser parse() throws Exception {
        Reader reader=new InputStreamReader(mInputStream);
        return new Gson().fromJson(reader,UserGson.class);
    }
}
