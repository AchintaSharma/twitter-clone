package com.upgrad.twitterclone;

public class Application {
    private User[] allUsers;
    private Tweet[] allTweets;
    private int maxUserId;
    private int maxTweetId;

    public Application() {
        this.allTweets = new Tweet[1000];
        this.allUsers = new User[1000];

        this.maxTweetId = -1;
        this.maxUserId = -1;
    }



    public void create_new_user(String userName) {
        if (maxUserId == 999) {
            System.out.println("Sorry, we cannot onboard a new user now...");
        } else if (userName.equals("")) {
            System.out.println("Username cannot be blank!");
        } else if (fetchUserObjIfValid(userName) != null) {
            System.out.println("This user already exists");
        } else {
            // Create a user
            maxUserId++;
            User newUser = new User(maxUserId, userName);
            allUsers[maxUserId] = newUser;
        }
    }

    public void post_tweet(String name, String msg) {
        if (maxTweetId == 999) {
            System.out.println("Error! ");
        } else if (msg.equals("")) {
            System.out.println("Error! ");
        } else {
            User owner = fetchUserObjIfValid(name);
            if (owner == null) {
                System.out.println("Error");
            } else {
                maxTweetId++;
                Tweet t = new Tweet(maxTweetId,msg,owner);
                allTweets[maxTweetId] = t;
                for(int i=0; i<=499; i++) {
                    if(owner.myTweets[i] == null) {
                        owner.myTweets[i]=t;
                        break;
                    }
                }
            }
        }
    }

    private User fetchUserObjIfValid(String name) {
        for (int i=0; i<=999; i++) {
            if(allUsers[i] == null) {
                break;
            } else if(name.equals(allUsers[i].userName)) {
                return allUsers[i];
            }
        }
        return null;
    }
}
