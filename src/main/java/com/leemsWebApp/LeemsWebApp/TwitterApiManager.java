package com.leemsWebApp.LeemsWebApp;

import org.springframework.web.client.RestTemplate;
import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.util.List;

public class TwitterApiManager {

    private static final ConfigurationBuilder config = initAuthProperties();
    private static final TwitterFactory twitterFactory = new TwitterFactory(config.build());
    private static final Twitter twitter = twitterFactory.getInstance();
    private static final long GOEDELE_TWITTER_ID = 388508697L;


    public void makeTwitterCall() throws Exception {
        // The factory instance is re-useable and thread safe.

        List<Status> statuses = twitter.getHomeTimeline();
        User user = twitter.verifyCredentials();
        System.out.println("Showing @" + user.getScreenName() + "'s home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":" +
                    status.getText());
        }
    }

    public static void setUpTimeLineListener(){
       // twitter.liste
    }

    public static void sendPrivateMessage() throws Exception{
        DirectMessage message = twitter.sendDirectMessage(GOEDELE_TWITTER_ID, "Hey babe this is me telling you I love you via Java :).");
        System.out.println("Direct message successfully sent to " + message.getId());
        System.out.println(" details:" + message.toString());
    }

    private static ConfigurationBuilder initAuthProperties(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("ciTMAjMet44ipAjV7YYNbexlp")
                .setOAuthConsumerSecret("ODbuEVAsWcMxGAZbCJBWbm2zP7R1m6Ra1eFprblpTqMv1tE9cK")
                .setOAuthAccessToken("500372775-6DDeFcrO58W1J5QWZUcLmwhY34jLpMJA7SxDKSBR")
                .setOAuthAccessTokenSecret("pK5gDxDzya448OzlRyJG62g6euUuq7i2Mil1H3c96xoao");

        return cb;
    }

}
