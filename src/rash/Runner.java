package rash;

/**
 * Created by green on 29.07.2015.
 */
public class Runner {
    public static void main(String[] args) {

        AlphaList listAlpha = AlphaListManager.createList();
        BetaList listBeta = new ListAdapter(listAlpha);
        BetaSaveManager.saveList(listBeta);
    }

}
