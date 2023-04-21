package CS5800HW4.Proxy;

import java.util.List;

public class Driver 
{
    public static void main(String[] args) 
    {
        RealServer songService = new RealServer();
        ServerProxy serverProxy = new ServerProxy(songService);

        // looking song by ID
        Song song = serverProxy.searchByID(234);
        System.out.println("song: " + song.getTitle() + " artist: " + song.getArtist() + " album: " + song.getAlbum() + " duration: " + song.getDuration());

        // looking for songs based on album
        List<Song> song2 = serverProxy.searchByAlbum("album2");
        System.out.println(song2.size() + " songs in that album");
        
        // looking for songs based on title
        List<Song> song3 = serverProxy.searchByTitle("song");
        System.out.println( song3.size() + " songs with that title");
    }
}
