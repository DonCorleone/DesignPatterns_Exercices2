package com.codewithmosh.adapter;

import com.codewithmosh.adapter.EmailProvider;
import com.codewithmosh.adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {

    private GmailClient gmailClient;

    public GmailAdapter(){

        this.gmailClient = new GmailClient();
    }

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
