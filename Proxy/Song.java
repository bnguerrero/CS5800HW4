package CS5800HW4.Proxy;


public class Song 
{
    private String title;
    private String artist;
    private String album;
    private String duration;

    public Song(String title, String artist, String album, String duration)
    {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }

    public void setArtist(String artist)
    {
        this.artist = artist;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setAlbum(String album)
    {
        this.album = album;
    }

    public String getAlbum()
    {
        return album;
    }

    public void setDuration(String duration)
    {
        this.duration = duration;
    }

    public String getDuration()
    {
        return duration;
    }
}
