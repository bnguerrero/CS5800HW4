package CS5800HW4.Proxy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RealServer implements SongService
{
    private HashMap<Integer, Song> songMetaData = new HashMap<>();

    public RealServer()
    {
        songMetaData.put(123, new Song("song", "artist","album", "1"));

        songMetaData.put(234,new Song("song2", "artist2", "album2", "2"));
    
        songMetaData.put(345,new Song("song3", "artist", "album", "3"));

        songMetaData.put(456, new Song("song4", "artist2","album2", "1"));

        songMetaData.put(567, new Song("song5", "artist","album", "1"));
    }



    public Song searchByID(Integer songID)
    {

        try 
        {
            Thread.sleep(1000);
        } 
        catch (Exception e) 
        {
            System.out.println("opps");
        }
        
        if(songMetaData.containsKey(songID))
        {
            return songMetaData.get(songID);
        }
        else
        {
            Song song= null;
            if(songID == null)
            {
                song = new Song("title", "artist", "album", "duration");
            }
            songMetaData.put(songID, song);
            return song;
        } 
        
    }

   @Override
    public List<Song> searchByTitle(String title) {
        try 
        {
            Thread.sleep(1000);
        } 
        catch (Exception e) 
        {
            System.out.println("opps");
        }

        List < Song > searchResults = new ArrayList < > ();
        for (Song song: songMetaData.values()) 
        {
            if (song.getTitle().equalsIgnoreCase(title)) 
            {
                searchResults.add(song);
            }
        }
        return searchResults;
    }
    
    @Override
    public List<Song> searchByAlbum(String album) 
    {
        try 
        {
            Thread.sleep(1000);
        } 
        catch (Exception e) 
        {
          System.out.println("opps");
        }
   
        List < Song > searchResults = new ArrayList < > ();
        for (Song song: songMetaData.values()) 
        {
            if (song.getAlbum().equalsIgnoreCase(album)) 
            {
                searchResults.add(song);
            }
        }
        return searchResults;
    }
}
