package hashTables;

import cs1c.*;
import java.util.*;

/**
 * This class will create and populate two hash tables of type FHhashQPwFind class, one for each wrapper class
 */
public class TableGenerator
{
    FHhashQPwFind<Integer, SongCompInt> tableOfIDs;
    FHhashQPwFind<String, SongsCompGenre> tableOfGenres;
    ArrayList<String> genreNames;

    /**
     * Default constructor
     */
    public TableGenerator()
    {
        tableOfIDs = null;
        tableOfGenres = null;
        genreNames = null;
    }

    /**
     * Populate a hash table based on SongCompInt
     * @param allSongs
     * @return
     */
    FHhashQPwFind<Integer, SongCompInt> populateIDtable(SongEntry[] allSongs)
    {
        tableOfIDs = new FHhashQPwFind<Integer, SongCompInt>();
        for(int i = 0; i < allSongs.length; i++)
        {
            SongCompInt song = new SongCompInt(allSongs[i]);
            tableOfIDs.insert(song);
        }
        return tableOfIDs;
    }

    /**
     * Populate a hash table based on SongsCompGenre
     * @param allSongs
     * @return
     */
    FHhashQPwFind<String, SongsCompGenre> populateGenreTable(SongEntry[] allSongs)
    {
        tableOfGenres = new FHhashQPwFind<String, SongsCompGenre>();
        genreNames = new ArrayList<String>();
        for(int i = 0; i < allSongs.length; i++)
        {
            SongEntry song = allSongs[i];
            String genre = song.getGenre();

            SongsCompGenre songsList = new SongsCompGenre(genre, song);
            if(!genreNames.contains(genre))
            {
                tableOfGenres.insert(songsList);
                genreNames.add(genre);
            }
            else
            {
                tableOfGenres.find(genre).addSong(song);
            }
        }
        return tableOfGenres;
    }

    /**
     * Getter method for genrenames
     * @return
     */
    ArrayList<String> getGenreNames() { return genreNames; }

}
