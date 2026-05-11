package twitter;

import java.util.*;

public class Twitter {
    Map<Integer, Set<Integer>> followeeMap;
    Map<Integer, List<Tweet>> tweetUserMap;
    int time;

    public Twitter() {
        followeeMap = new HashMap<>();
        tweetUserMap = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(tweetId, time++);
        tweetUserMap.putIfAbsent(userId, new ArrayList<>());
        tweetUserMap.get(userId).add(tweet);
        System.out.println("Posting tweet " + tweetId + " by user " + userId);
    }

    public void follow(int followeeId, int followerId) {
        followeeMap.putIfAbsent(followerId, new HashSet<>());
        followeeMap.get(followerId).add(followeeId);
        System.out.println("Follower " + followerId + " " + "Following" + followeeId);
    }

    public void unfollow(int followeeId, int followerId) {
        if (!followeeMap.containsKey(followerId)) {
            return;
        }
        followeeMap.get(followerId).remove(followeeId);
        System.out.println("Follower " + followerId + " " + "Unfollowed" + followeeId);
    }

    public void getFeedTweets(int userId) {
        System.out.println("Fetching Most recent 5 tweets for user: " + userId);
        if (!tweetUserMap.containsKey(userId)) {
            System.out.println("User " + userId + " does not exist");
            return;
        }
        PriorityQueue<Tweet> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.time));
        pq.addAll(tweetUserMap.get(userId));

        if (followeeMap.containsKey(userId)) {
            for (int followee : followeeMap.get(userId)) {
                if (tweetUserMap.containsKey(followee)) {
                    pq.addAll(tweetUserMap.get(followee));
                }
            }
        }

        int count = 0;
        while (!pq.isEmpty() && count < 5) {
            System.out.println(pq.poll().tweetId);
            count++;
        }
    }

    public static class Tweet {
        int tweetId;
        int time;

        public Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }
}
