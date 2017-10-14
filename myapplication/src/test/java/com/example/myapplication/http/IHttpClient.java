package com.example.user.my_07_03.http;

import java.io.InputStream;

/**
 * Created by User on 14.10.2017.
 */

public interface IHttpClient {
    InputStream request(String url);
}
