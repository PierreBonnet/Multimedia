package Enews;

import applicationServices.ApiReceiver;

public class EnewsProvider {

    String getDefaultPodcastProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
