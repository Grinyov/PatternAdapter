/**
 * Created by green on 11.05.2015.
 */

public class SequenceGenerator {

    private Generator generator;

    public SequenceGenerator(Generator generator){
        super();
        this.generator = generator;
    }

    public int[] generate(int length){

        int ret[] = new int[length];

        for (int i = 0; i < length; i++){

            ret[i] = generator.next();
        }

        return ret;
    }

}
