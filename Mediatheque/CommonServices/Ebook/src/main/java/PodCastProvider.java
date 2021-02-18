public class PodCastProvider {

    String getDefaultPodcastProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
