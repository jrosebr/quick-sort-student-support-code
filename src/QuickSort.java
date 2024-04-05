public class QuickSort {

    /**
     * TODO
     * @param begin The position of the first element in the sequence to be sorted.
     * @param end   The position that is one-past the last element in the sequence to be sorted.
     * @param <E>   The element type for the sequence.
     */
    public static <E extends Comparable<? super E>>
    void quicksort(Iterator<E> begin, Iterator<E> end)
    {
        if (begin.equals(end))
            return;

        Iterator<E> pivot_position = partition(begin, end);

        quicksort(begin, pivot_position);
        pivot_position.advance();
        quicksort(pivot_position, end);
    }

    public static <E extends Comparable<? super E>>
    Iterator<E> partition(Iterator<E> begin, Iterator<E> end)
    {
        Iterator<E> pivot = Algorithms.last(begin, end);
        Iterator<E> i = begin.clone();
        Iterator<E> stop = Algorithms.last(begin, end);

        for (Iterator<E> j = begin.clone(); !j.equals(stop); j.advance())
        {
            if ((j.get()).compareTo(pivot.get()) <= 0) {
                Algorithms.iter_swap(i, j);
                i.advance();
            }
        }

        Algorithms.iter_swap(i, pivot);
        return i;
    }

}
