/**
 * Created by green on 11.05.2015.
 */
public class Test {

    public static void main(String[] args) {

        RandomGeneratorAdapter adapter = new RandomGeneratorAdapter();

        SequenceGenerator generator = new SequenceGenerator(adapter);

        for (int i : generator.generate(10)){

            System.out.println(i + " ");
        }
    }
}
