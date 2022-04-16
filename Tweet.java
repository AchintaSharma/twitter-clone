package com.upgrad.twitterclone;

public class Tweet {

    private int tweetID;
    private String message;
    private User owner;
    private boolean isDeleted;

    public Tweet(int id, String  msg, User owner) {
        this.tweetID = id;
        this.message = msg;
        this.owner = owner;
    }


//    public boolean isDeleted() {
//        return  False;
//    }
}
