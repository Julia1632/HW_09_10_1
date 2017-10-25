package com.example.user.my_07_03.json;

import com.example.user.my_07_03.BuildConfig;
import com.example.user.my_07_03.http.IHttpClient;
import com.example.user.my_07_03.json_gson.IUser;
import com.example.user.my_07_03.json_gson.IUserList;
import com.example.user.my_07_03.json_gson.IUserListJson;
import com.example.user.my_07_03.json_gson.UserListParserFactory;
import com.example.user.my_07_03.json_gson.UserParserFactory;
import com.example.user.my_07_03.mocks.Mocks;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.InputStream;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by User on 13.10.2017.
 */

@RunWith(RobolectricTestRunner.class)
@Config(
        constants = BuildConfig.class,
        sdk = 21
)
public class UserParserTest {
    private static final String EXPECTED_ID = "59dbe02684a66bbe143b20d1";
    private IHttpClient mHttpClient;

    @Before
    public void setUp() {
        mHttpClient = mock(IHttpClient.class);
    }
    @Test
    public void parse() throws Exception{

        final UserParserFactory userParserFactory= new UserParserFactory();
        // final IUser user=userParserFactory.createParser(SOURCE).parse();
        InputStream mockedInputStream= Mocks.stream("user.json");
        doReturn(mockedInputStream).when(mHttpClient).request(Matchers.anyString());
        // when(mHttpClient.request(Matchers.anyString())).thenReturn(mockedInputStream);
        InputStream response=mHttpClient.request("https://backend/getuser");
        IUser userjson = userParserFactory.createParserFile(response).parse();

        assertEquals(EXPECTED_ID, userjson.getId());

        final  UserParserFactory userParserFactory1=new UserParserFactory();
        InputStream inputStreamGson=Mocks.stream("user.json");
        final IUser usergson=userParserFactory1.createParserFile(inputStreamGson).parse();
        assertEquals(EXPECTED_ID, usergson.getId());


        final UserListParserFactory userListParserFactory=new UserListParserFactory();
        InputStream inputStreamListGson=Mocks.stream("list_users.json");
        final IUserList gsonUserList=userListParserFactory.createGsonParser(inputStreamListGson).parse();
        assertEquals(EXPECTED_ID,gsonUserList.getUserList().get(0).getId());

        final UserListParserFactory userListParserFactory1=new UserListParserFactory();
        InputStream inputStreamJson= Mocks.stream("list_users.json");
        final IUserListJson jsonList=userListParserFactory1.createJsonParser(inputStreamJson).parse();
        assertEquals(EXPECTED_ID,jsonList.getUserList().get(0).getId());

    }

}