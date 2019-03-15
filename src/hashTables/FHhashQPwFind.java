package hashTables;

import java.util.*;

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E>
{
    public E find( KeyType key )
    {
        int index = findPosKey(key);
        if(mArray[index].state != EMPTY)
            return mArray[index].data;
        else
            throw new NoSuchElementException();
    }

    int findPosKey( KeyType key )
    {
        int kthOddNum = 1;
        int index = myHashKey(key);

        while ( mArray[index].state != EMPTY
                && mArray[index].data.compareTo(key) != 0)
        {
            index += kthOddNum; // k squared = (k-1) squared + kth odd #
            kthOddNum += 2;     // compute next odd #
            if ( index >= mTableSize )
                index -= mTableSize;
        }
        return index;
    }

    public int myHashKey( KeyType key)
    {
        int hashVal;

        hashVal = key.hashCode() % mTableSize;
        if(hashVal < 0)
            hashVal += mTableSize;

        return hashVal;
    }
}