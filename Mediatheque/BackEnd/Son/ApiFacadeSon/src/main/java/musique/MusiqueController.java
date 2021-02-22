package musique;

import podcast.PodcastOrchestrateurService;

public class MusiqueController {

    MusiqueDto getPodcastDetails(){
        MusiqueOrchestrateurService podCastOrchestrateurService = new MusiqueOrchestrateurService();
        podCastOrchestrateurService.getDefaultMusiqueService();
        return new MusiqueDto();
    }
}
