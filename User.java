package com.upgrad.twitterclone;

public class User {
    int userId;
    String userName;

    User[] following; // If this object is following users A, B, C and D

    User[] followers;
    User[] followReqs;

    Tweet[] myTweets;
    Tweet[] hiddenTweets;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;

        this.followers = new User [100];
        this.following = new User [100];
        this.followReqs = new User [100];

        this.myTweets = new Tweet[500];
        this.hiddenTweets = new Tweet[500];
    }

    //public void add_tweet(Tweet  )
}
