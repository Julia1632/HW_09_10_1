package com.example.user.my_07_03.json_gson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 14.10.2017.
 */

public class UserListJsonParser implements IUserListJsonParser {

    public  final InputStream mInputStream;
    public List<UserJSONWrapper> listJsonUsers;

    public UserListJsonParser(InputStream mInputStream) {
        this.mInputStream = mInputStream;
    }

    @Override
    public IUserListJson parse() throws Exception {

        StringBuffer buffer= new StringBuffer();
        BufferedReader reader=new BufferedReader(new InputStreamReader(mInputStream));
        String line;
        String resultJson="";
        while ((line=reader.readLine())!=null){
            buffer.append(line);
        }

        resultJson=buffer.toString();


        final JSONArray jsonArray = new JSONArray(resultJson);
        final List<UserJSONWrapper> usersJsonList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            usersJsonList.add(new UserJSONWrapper(jsonObject));
        }
        return new UserListJson(usersJsonList);
    }

    /*@Override
    public parse() throws Exception {

        StringBuffer buffer= new StringBuffer();
        BufferedReader reader=new BufferedReader(new InputStreamReader(mInputStream));
        String line;
        String resultJson="";
        while ((line=reader.readLine())!=null){
            buffer.append(line);
        }

        resultJson=buffer.toString();



        final JSONArray jsonArray = new JSONArray(resultJson);
        final List<UserJsonWrapperList> usersJsonList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            final JSONObject jsonObject = jsonArray.getJSONObject(i);
            usersJsonList.add(new UserJsonWrapperList(jsonObject));
        }
        return new UserListJson(usersJsonList);

        /*JSONArray jsonArray = new JSONArray(resultJson);
        JSONObject[] j = new JSONObject[jsonArray.length()];
        UserJsonWrapperList[] w=new UserJsonWrapperList[jsonArray.length()];
        List<UserJsonWrapperList> h=null;
        h.add(new UserJsonWrapperList((JSONObject)jsonArray.get(0)));
         for (int i=0;i<jsonArray.length();i++)
        {
            j[i]=(JSONObject)jsonArray.get(i);
        }
        for (int i=0;i<jsonArray.length();i++)
        {
            w[i].consctuctor(j[i]);

        }

        for (int i=0; i<jsonArray.length();i++) {
            JSONObject jsonObject = (JSONObject) jsonArray.get(i);
            listJsonUsers.add(new UserJSONWrapper(jsonObject));
        }
        return new UserListJson(Arrays.asList(w));

    }*/
}
