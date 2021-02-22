package musique;

import applicationServices.ApiReceiver;

public class MusiqueProvider {

    String getDefaultMusiqueProvider(){
        ApiReceiver api =new ApiReceiver();
        return api.getResponseApi();
    }
}
