package musique;

import Enews.EnewsService;

public class MusiqueOrchestrateurService {

    public Musique getDefaultMusiqueService(){
        MusiqueService provider = new MusiqueService();
        EnewsService enewsService = new EnewsService();
        String musique = provider.getDefaultMusiqueService();
        String news = "test";
        return new Musique(musique,news);
    }
}
