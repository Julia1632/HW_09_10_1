package com.example.user.my_07_03.mocks;

import junit.framework.Assert;

import java.io.InputStream;

/**
 * Created by User on 13.10.2017.
 */

public class Mocks  {

    public static InputStream stream(final String pName) {
        final InputStream resourceAsStream = Mocks.class.getClassLoader().getResourceAsStream(pName);
        Assert.assertNotNull("resource not found, maybe you forget add .json?", resourceAsStream);
        return resourceAsStream;
    }
}
