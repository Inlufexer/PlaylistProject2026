import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */
    private ArrayList<Song> playlist;



     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */
    public Playlist(){
        playlist = new ArrayList<Song>();
    }

      

      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

      public void addSong(Song song){
        playlist.add(song);
      }

      public void like(Song song){
        int songIndex = playlist.indexOf(song);
        song.like();
        playlist.set(songIndex, song);
      }

      public void remove(Song song){
        int songIndex = playlist.indexOf(song);
        playlist.remove(songIndex);
      }

      public String examineSongs(){
        String description = "";
        for(int i = 0; i < playlist.size(); i++){
          description += playlist.get(i).toString();
          description += "\n";
        }
        return description;
      }

      public String examineLiked(){
        String description = "";
        for(int i = 0; i < playlist.size(); i++){
          if(playlist.get(i).isLiked()){
            description += playlist.get(i).toString();
            description += "\n";
          }
        }
        return description;
      }

      public String totalDuration(){
        int totalMinutes = 0;
        int totalSeconds = 0;
        for(int i = 0; i < playlist.size(); i++){
          totalMinutes += playlist.get(i).getMinutes();
          totalSeconds += playlist.get(i).getSeconds();
        }
        totalMinutes += totalSeconds / 60;
        totalSeconds = totalSeconds % 60;
        return totalMinutes + ":" + totalSeconds;
      }

      public void removeUnliked(){

      }
}
