package podcast;

import Enews.EnewsService;

public class PodcastOrchestrateurService {

    public Podcast getDefaultPodcastService(){
        PodcastService provider = new PodcastService();
        EnewsService enewsService = new EnewsService();
        String podcast = provider.getDefaultPodcastService();
        String news = "test";
        return new Podcast(podcast,news);
    }
}
