package twitter;

public class TwitterController {

    public static void controlTwitter(){
        Twitter twitter = new Twitter();
        twitter.postTweet(1,4);
        twitter.postTweet(2,5);
        twitter.postTweet(2,6);
        twitter.postTweet(3,7);
        twitter.postTweet(3,8);
        twitter.postTweet(1,10);
        twitter.postTweet(2,11);
        twitter.follow(2,1);
        twitter.follow(3,1);
        twitter.follow(4,1);
        twitter.getFeedTweets(1);
        twitter.unfollow(2,1);
        twitter.getFeedTweets(1);
        twitter.postTweet(2,2);
        twitter.getFeedTweets(2);
    }
}
