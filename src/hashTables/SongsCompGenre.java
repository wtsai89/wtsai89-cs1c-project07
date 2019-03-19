package hashTables;

import cs1c.SongEntry;
import java.util.*;

public class SongsCompGenre implements Comparable<String>
{
    ArrayList<SongEntry> list;
    String genre;

    /**
     * Prints out the list of elements
     * @return
     */
    public String toString() { return list.toString(); }

    /**
     * Constructor which sets the genre
     * @param g
     * @param e
     */
    public SongsCompGenre(String g, SongEntry e)
    {
        genre = g;
        list = new ArrayList<SongEntry>();
        list.add(e);
    }

    /**
     * Compares the key values
     * @param key
     * @return
     */
    public int compareTo(String key)
    {
        return genre.compareTo(key);
    }

    /**
     * Compares the objects. Let equals() preserve the equals() provided by embedded data
     * @param rhs
     * @return
     */
    public boolean equals( SongsCompGenre rhs )
    {
        return list.equals(rhs.list);
    }

    /**
     * Returns the hash code of the genre name
     * @return
     */
    public int hashCode()
    {
        return genre.hashCode();
    }

    /**
     * Adds a SongEntry element into the list
     * @param e
     */
    public void addSong(SongEntry e)
    {
        list.add(e);
    }

    /**
     * Getter method for the list of SongEntry
     * @return
     */
    public ArrayList<SongEntry> getData()
    {
        return list;
    }

    /**
     * Getter method for genre
     * @return
     */
    public String getName()
    {
        return genre;
    }

}
