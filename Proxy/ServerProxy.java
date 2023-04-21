package CS5800HW4.Proxy;

import java.util.HashMap;
import java.util.List;

public class ServerProxy implements SongService
{

    private RealServer realServer;
    private HashMap<Integer, Song> songMetaData = new HashMap<>();

    public ServerProxy(RealServer realServer)
    {
        this.realServer = realServer;
    }

    @Override
    public Song searchByID(Integer songID) 
    {
        if(songMetaData.containsKey(songID))
        {
            return songMetaData.get(songID);
        }
        else
        {
            Song song = realServer.searchByID(songID);
            if (song != null) 
            {
                songMetaData.put(songID, song);
            }
            return song;
        }
    }

    @Override
    public List<Song> searchByTitle(String title) 
    {
        return realServer.searchByTitle(title);
    }

    @Override
    public List<Song> searchByAlbum(String album) 
    {
        return realServer.searchByAlbum(album);
    }
    
}
