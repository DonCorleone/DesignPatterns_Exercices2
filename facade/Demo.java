package com.codewithmosh.facade;

public class Demo {
  public static void show() {
    var service = new RecentTweetService("key", "secret");
    service.getTweets();
  }
}
