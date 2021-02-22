package musique;

public class Musique {
    private String musique;
    private String news;

    public String getMusique() {
        return musique;
    }

    public void setMusique(String musique) {
        this.musique = musique;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public Musique(String musique, String news) {
        this.musique = musique;
        this.news = news;
    }
}

