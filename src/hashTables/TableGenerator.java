package hashTables;

import cs1c.*;
import java.util.*;

public class TableGenerator
{
    FHhashQPwFind<Integer, SongCompInt> tableOfIDs;
    FHhashQPwFind<String, SongsCompGenre> tableOfGenres;
    ArrayList<String> genreNames;

    public TableGenerator()
    {
        tableOfIDs = null;
        tableOfGenres = null;
        genreNames = null;
    }

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

    ArrayList<String> getGenreNames() { return genreNames; }

}
