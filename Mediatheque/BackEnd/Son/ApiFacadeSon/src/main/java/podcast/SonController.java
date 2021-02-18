package podcast;

public class SonController {


    SonDto getPodCastDetails(){
        PodcastOrchestrateurService podCastOrchestrateurService = new PodcastOrchestrateurService();
        podCastOrchestrateurService.getDefaultPodcastService();
        return new SonDto();
    }
}
