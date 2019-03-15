package hashTables;

import cs1c.SongEntry;
import java.util.*;

public class SongsCompGenre implements Comparable<String>
{
    ArrayList<SongEntry> list;
    String genre;
    public String toString() { return list.toString(); }

    public SongsCompGenre(String g, SongEntry e)
    {
        genre = g;
        list = new ArrayList<SongEntry>();
        list.add(e);
    }

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

    public int hashCode()
    {
        return genre.hashCode();
    }

    public void addSong(SongEntry e)
    {
        list.add(e);
    }

    public ArrayList<SongEntry> getData()
    {
        return list;
    }

    public String getName()
    {
        return genre;
    }

}
