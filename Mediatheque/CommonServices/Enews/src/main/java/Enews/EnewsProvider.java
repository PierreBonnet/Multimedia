package Enews;

public class EnewsProvider {

    String getDefaultPodcastProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
