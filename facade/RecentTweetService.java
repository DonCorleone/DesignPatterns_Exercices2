package com.codewithmosh.facade;

import java.util.List;

public class RecentTweetService {

    private String appKey;
    private String appSecret;

    public RecentTweetService(String appKey, String appSecret){
        this.appKey = appKey;
        this.appSecret = appSecret;
    }

    public List<Tweet> getTweets(){
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, appSecret);
        var accessToken = oauth.getAccessToken(requestToken);

        var twitterClient = new TwitterClient();
        var tweets = twitterClient.getRecentTweets(accessToken);

        return tweets;
    }
}
