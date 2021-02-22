package podcast;

class SonController {


    PodcastDto getPodCastDetails(){
        PodcastOrchestrateurService podCastOrchestrateurService = new PodcastOrchestrateurService();
        podCastOrchestrateurService.getDefaultPodcastService();
        return new PodcastDto();
    }
}
