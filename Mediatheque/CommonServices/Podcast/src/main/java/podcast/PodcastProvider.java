package podcast;

import applicationServices.ApiReceiver;

public class PodcastProvider {

    String getDefaultPodcastProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
