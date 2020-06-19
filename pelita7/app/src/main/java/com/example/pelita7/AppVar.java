package com.example.pelita7;

public class AppVar {


    //URL to our login.php file, url bisa diganti sesuai dengan alamat server kita
    public static final String LOGIN_URL = "http://192.168.1.9/webfr/login.php";



        //Keys for email and password as defined in our $_POST['key'] in login.php

    public static final String KEY_EMAIL = "email_pelanggan";

    public static final String KEY_PASSWORD = "password_pelanggan";



        //If server response is equal to this that means login is successful

    public static final String LOGIN_SUCCESS = "success";

}


p