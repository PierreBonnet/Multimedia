package podcast;

public class PodcastService {

    String getDefaultPodcastService(){
        PodcastProvider provider = new PodcastProvider();
        return provider.getDefaultPodcastProvider();
    }
}
