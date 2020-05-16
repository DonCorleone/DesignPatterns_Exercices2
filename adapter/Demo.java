package com.codewithmosh.adapter;

import com.codewithmosh.adapter.Gmail.GmailClient;

public class Demo {
    public static void show(){
        var emailClient = new EmailClient();
        var gmailProvider = new GmailAdapter();
        emailClient.addProvider(gmailProvider);

        emailClient.downloadEmails();
    }
}
