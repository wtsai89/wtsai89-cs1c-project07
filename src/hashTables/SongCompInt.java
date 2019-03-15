package hashTables;

import cs1c.SongEntry;

public class SongCompInt implements Comparable<Integer>
{
    SongEntry data;
    public SongCompInt(SongEntry e) { data = e; }
    public String toString() { return data.toString(); }

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

    public int hashCode()
    {
        return data.getID();
    }
}
