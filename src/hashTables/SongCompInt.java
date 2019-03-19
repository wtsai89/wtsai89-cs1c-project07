package hashTables;

import cs1c.SongEntry;

/**
 * Wrapper class for a SongEntry object used to compare objects based on their ID field
 */
public class SongCompInt implements Comparable<Integer>
{
    SongEntry data;

    /**
     * Constructor which takes in an element
     * @param e
     */
    public SongCompInt(SongEntry e) { data = e; }

    /**
     * Prints out the element
     * @return
     */
    public String toString() { return data.toString(); }

    /**
     * Compares the key values
     * @param key
     * @return
     */
    public int compareTo(Integer key)
    {
        return data.getID() - key;
    }

    /**
     * Compares the objects. Let equals() preserve the equals() provided by embedded data
     * @param rhs
     * @return
     */
    public boolean equals( SongCompInt rhs )
    {
        return data.equals(rhs.data);
    }

    /**
     * Returns the hash code of an element which is simply its ID
     * @return
     */
    public int hashCode()
    {
        return data.getID();
    }
}
