package com.example.user.my_07_03.json_gson;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by User on 13.10.2017.
 */

public class UserJSONObjectParserFile implements IUserParser {

    private final InputStream mInputStream;

    UserJSONObjectParserFile(final InputStream pInputStream)
    {
        mInputStream=pInputStream;
    }

    @Override
    public IUser parse() throws Exception {
        StringBuffer buffer= new StringBuffer();
        BufferedReader reader=new BufferedReader(new InputStreamReader(mInputStream));
        String line;
        String resultJson="";
        while ((line=reader.readLine())!=null){
            buffer.append(line);
        }

        resultJson=buffer.toString();
        final JSONObject jsonObject = new JSONObject(resultJson);
        return new UserJSONWrapper(jsonObject);
    }

}

