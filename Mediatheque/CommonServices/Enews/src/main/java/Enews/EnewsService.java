package Enews;

public class EnewsService {

    String getDefaultEnewsService(){
        EnewsProvider provider = new EnewsProvider();
        return provider.getDefaultPodcastProvider();
    }
}
