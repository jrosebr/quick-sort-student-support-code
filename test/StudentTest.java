import org.junit.jupiter.api.Test;
//import sequences.*;
import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

public class StudentTest {

    @Test
    public void randomTest()
    {
        Random r = new Random();
        LinkedList<Integer> test = new LinkedList<>();
        Integer[] oracle = new Integer[20];

        for (int i = 0; i != 20; ++i)
        {
            int x = r.nextInt();
            oracle[i] = x;

            test.insert_front(x);
        }

        QuickSort.quicksort(test.begin(), test.end());
        Arrays.sort(oracle);
        ArraySequence<Integer> oracle1 = new ArraySequence<>(oracle);

        assertTrue(Algorithms.equal_sequences(oracle1, test));
    }


    @Test
    public void test() {
        randomTest();
    }

}
