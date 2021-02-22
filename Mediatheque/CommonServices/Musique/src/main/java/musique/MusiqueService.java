package musique;

import musique.MusiqueProvider;

public class MusiqueService {

    String getDefaultMusiqueService(){
        MusiqueProvider provider = new MusiqueProvider();
        return provider.getDefaultMusiqueProvider();
    }
}
