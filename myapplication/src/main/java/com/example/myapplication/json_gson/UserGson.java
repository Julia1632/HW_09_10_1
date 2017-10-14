package com.example.user.my_07_03.json_gson;

import com.google.gson.annotations.SerializedName;

import java.text.SimpleDateFormat;
import java.util.Locale;


public class UserGson implements IUser{

        @SerializedName("_id")
        private String mId;

        @SerializedName("index")
        private int mIndex;

        @SerializedName("guid")
        private String mGuid;

        @SerializedName("isActive")
        private boolean mIsActive;

        @SerializedName("balance")
        private String mBalance;

        @SerializedName("picture")
        private String mPicture;

        @SerializedName("age")
        private int mAge;

        @SerializedName("eyeColor")
        private String mEyecolor;

        @SerializedName("name")
        private String mName;

        @SerializedName("gender")
        private String mGender;

        @SerializedName("company")
        private String mCompany;

        @SerializedName("email")
        private String  mEmail;

        @SerializedName("phone")
        private String mPhone;

        @SerializedName("address")
        private String mAddress;


        @SerializedName("about")
        private String mAbout;

        @SerializedName("registered")
        private String mRegistered;

        @SerializedName("latitude")
        private float mLatitude;

        @SerializedName("longitube")
        private float mLongitude;
        //
        //
        @SerializedName("greeting")
        private String mGreeting;

        @SerializedName("favoriteFruit")
        private String mFavoriteFruit;
        @Override
        public String getId() {
            return mId;
        }

        @Override
        public int getIndex() {
            return mIndex;
        }

        @Override
        public String getGuid() {
            return mGuid;
        }

        @Override
        public boolean getIsActive() {
            return mIsActive;
        }

        @Override
        public String getBalance() {
            return mBalance;
        }

        @Override
        public String getPicture() {
            return mPicture;
        }

        @Override
        public int getAge() {
            return mAge;
        }

        @Override
        public String getEyeColor() {
            return mEyecolor;
        }

        @Override
        public String getName() {
            return mName;
        }

        @Override
        public String getGender() {
            return mGender;
        }

        @Override
        public String getCompany() {
            return mCompany;
        }

        @Override
        public String getEmail() {
            return mEmail;
        }

        @Override
        public String getPhone() {
            return mPhone;
        }

        @Override
        public String getAddress() {
            return mAddress;
        }

        @Override
        public String getAbout() {
            return mAbout;
        }

        @Override
        public String getRegistered() {
                SimpleDateFormat date=new SimpleDateFormat("dd MMM yyyy, hh:mm:ss", Locale.ENGLISH);
                return date.format(mRegistered);
        }

        @Override
        public double getLatitude() {
            return mLatitude;
        }

        @Override
        public double getLongitude() {
            return mLongitude;
        }

        @Override
        public String getGreeting() {
            return mGreeting;
        }

        @Override
        public String getFavoriteFruit() {
            return mFavoriteFruit;
        }
}
