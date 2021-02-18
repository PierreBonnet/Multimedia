package podcast;

public class PodcastProvider {

    String getDefaultPodcastProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
