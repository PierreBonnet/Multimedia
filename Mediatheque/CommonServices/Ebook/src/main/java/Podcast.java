public class Podcast {

    private String podcast;
    private String news;

    public String getPodcast() {
        return podcast;
    }

    public void setPodcast(String podcast) {
        this.podcast = podcast;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public Podcast(String podcast, String news) {
        this.podcast = podcast;
        this.news = news;
    }
}
