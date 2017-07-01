package com.example.dl579.login;

import java.net.Socket;

/**
 * Created by dl579 on 2017-07-01.
 */

class MySocket extends  Thread{
    Socket socket = null;
    String Id = "",password="";
    Send Login = null;
    String IP = "192.168.43.229";
    String Receive=null;
    private static final MySocket ourInstance = new MySocket();

    static MySocket getInstance() {
        return ourInstance;
    }

    private MySocket() {
    }
    public void run()
    {

    }

}
