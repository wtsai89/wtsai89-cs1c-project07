package hashTables;

/**
 * HashEntry class for use by FHhashQP
 * @param <E>
 */
public class HashEntry<E>
{
    public E data;
    public int state;

    /**
     * Constructor which sets an element and its state
     * @param x
     * @param st
     */
    public HashEntry( E x, int st )
    {
        data = x;
        state = st;
    }

    /**
     * Default constructor
     */
    public HashEntry()
    {
        this(null, FHhashQP.EMPTY);
    }
}
