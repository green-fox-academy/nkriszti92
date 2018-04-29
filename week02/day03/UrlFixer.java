package week02.day03;

public class UrlFixer {
    public static void main(String... args){
        String url = "https//www.reddit.com/r/nevertellmethebots";

        url = url.replace("bots", "odds" );

        int index = url.indexOf("/");
        StringBuilder sb = new StringBuilder(url);
        sb.insert(index,":");


        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crucial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        System.out.println(sb);

    }
}