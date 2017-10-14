package com.example.user.my_07_03.json_gson;

import org.json.JSONObject;

/**
 * Created by User on 13.10.2017.
 */

public class UserJSONWrapper implements IUser {

    private static final String ID = "_id";
    private static final String INDEX="index";
    private static final String GUID="guid";
    private static final String ISACTIVE="isActive";
    private static final String BALANCE="balance";
    private static final String PICTURE="picture";
    private static final String AGE="age";
    private static final String EYECOLOR="eyeColor";
    private static final String NAME = "name";
    private static final String GENDER="gender";
    private static final String COMPANY="company";
    private static final String EMAIL="email";
    private static final String PHONE="phone";
    private static final String ADDRESS="address";
    private static final String ABOUT="about";
    private static final String REGISTRED="registered";
    private static final String LATITUDE="latitude";
    private static final String LONGITUBE="longitude";
    private static final String GREETING="greeting";
    private static final String FAVORITEFRUIT="favoriteFruit";

    private final JSONObject mJsonObject;

    UserJSONWrapper(final JSONObject pJsonObject) {
        mJsonObject = pJsonObject;
    }

    @Override
    public String getId() {
        return mJsonObject.optString(ID);
    }

    @Override
    public int getIndex() {
        return mJsonObject.optInt(INDEX);
    }

    @Override
    public String getGuid() {
        return mJsonObject.optString(GUID);
    }

    @Override
    public boolean getIsActive() {
        return mJsonObject.optBoolean(ISACTIVE);
    }

    @Override
    public String getBalance() {
        return mJsonObject.optString(BALANCE);
    }

    @Override
    public String getPicture() {
        return mJsonObject.optString(PICTURE);
    }

    @Override
    public int getAge() {
        return mJsonObject.optInt(AGE);
    }

    @Override
    public String getEyeColor() {
        return mJsonObject.optString(EYECOLOR);
    }

    @Override
    public String getName() {
        return mJsonObject.optString(NAME);
    }

    @Override
    public String getGender() {
        return mJsonObject.optString(GENDER);
    }

    @Override
    public String getCompany() {
        return mJsonObject.optString(COMPANY);
    }

    @Override
    public String getEmail() {
        return mJsonObject.optString(EMAIL);
    }

    @Override
    public String getPhone() {
        return mJsonObject.optString(PHONE);
    }

    @Override
    public String getAddress() {
        return mJsonObject.optString(ADDRESS);
    }

    @Override
    public String getAbout() {
        return mJsonObject.optString(ABOUT);
    }

    @Override
    public String getRegistered() {
        return mJsonObject.optLong(REGISTRED);
    }

    @Override
    public double getLatitude() {
        return mJsonObject.optDouble(LATITUDE);
    }

    @Override
    public double getLongitude() {
        return mJsonObject.optDouble(LONGITUBE);
    }

    @Override
    public String getGreeting() {
        return mJsonObject.optString(GREETING);
    }

    @Override
    public String getFavoriteFruit() {
        return mJsonObject.optString(FAVORITEFRUIT);
    }

}
