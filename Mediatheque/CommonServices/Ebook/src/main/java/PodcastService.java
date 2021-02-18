public class PodcastService {

    String getDefaultPodcastService(){
        PodCastProvider provider = new PodCastProvider();
        return provider.getDefaultPodcastProvider();
    }
}
