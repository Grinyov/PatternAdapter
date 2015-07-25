/**
 * Created by green on 11.05.2015.
 */
public class RandomGeneratorAdapter extends RandomGenerator implements Generator{

    @Override
    public int next() {
        return getRandomNumber();
    }
}
