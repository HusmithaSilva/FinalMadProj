package com.example.finalexamprojecttest;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    SharedPreferences sharedPreferences;

    public SharedPreferences.Editor editor;

    public Context context;
    int PRIVATE_MODE = 0;

    private static final  String REF_NAME = "LOGIN";

    public SessionManager(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(REF_NAME, PRIVATE_MODE);
    }

    public void createSession(String username, String password){
        editor.putBoolean("LOGIN", true);
        editor.putString("Username", username);
    }
}
