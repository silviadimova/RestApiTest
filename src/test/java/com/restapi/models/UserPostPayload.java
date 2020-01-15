package com.restapi.models;


import com.google.gson.Gson;

public class UserPostPayload {

    private int userId;
    private String title;
    private String text;

    public UserPostPayload(int userId, String title, String text) {
        this.userId = userId;
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }
}
