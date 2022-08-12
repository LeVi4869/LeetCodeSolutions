class Twitter {
    
    class Tweet {
        int tweetId;
        int userId;
        Tweet(int userId, int tweetId)  {
            this.userId = userId;
            this.tweetId = tweetId;
        }
    }

    List<Tweet> tweets;
    HashMap<Integer, List<Integer>> follows;
    
    public Twitter() {
        tweets = new ArrayList<>();
        follows = new HashMap<>();
    }
    
    public void postTweet(int userId, int tweetId) {
        tweets.add(new Tweet(userId, tweetId));
    }
    
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        int cnt = 0;
        for(int i = tweets.size() - 1; i >= 0 && cnt < 10; --i)    {
            int tweetUserId = tweets.get(i).userId;
            if(tweetUserId == userId || (follows.containsKey(userId) && follows.get(userId).contains(tweetUserId)))  {
                res.add(tweets.get(i).tweetId);
                ++cnt;
            }
        }
        return res;
    }
    
    public void follow(int followerId, int followeeId) {
        if(!follows.containsKey(followerId))    {
            follows.put(followerId, new ArrayList<>());
        }
        List<Integer> followList = follows.get(followerId);
        followList.add(followeeId);
        follows.put(followerId, followList);
    }
    
    public void unfollow(int followerId, int followeeId) {
        if(!follows.containsKey(followerId))   {
            return;
        }
        List<Integer> followList = follows.get(followerId);
        followList.remove(followList.indexOf(followeeId));
        follows.put(followerId, followList);
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */